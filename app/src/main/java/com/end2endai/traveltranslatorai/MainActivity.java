package com.end2endai.traveltranslatorai;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;

public class MainActivity extends AppCompatActivity {
    private static final boolean DEV_MODE = true;
    private WebView webView;
    private static final int REQUEST_CODE = 1234; // Define a constant for the request code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        if (DEV_MODE == false) {
            webView.setWebViewClient(new WebViewClient());
        } else {
            // ONLY FOR DEV : HTTPS is not secured, need to accept all certificates
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                    // WARNING: This will accept all certificates, even invalid ones.
                    // ONLY use for development purposes.
                    handler.proceed();
                }
            });
        }

        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onPermissionRequest(final PermissionRequest request) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        request.grant(request.getResources());
                    }
                });
            }
        });

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setMediaPlaybackRequiresUserGesture(false);

        // Check and request permissions
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, REQUEST_CODE);
        } else {
            // Load the web content
            if (DEV_MODE == false) {
                webView.loadUrl("https://lfontaine.pythonanywhere.com/");
            } else {
                webView.loadUrl("https://192.168.0.3:5009");
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            webView.setWebContentsDebuggingEnabled(true);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, load the web content
                if (DEV_MODE == false) {
                    webView.loadUrl("https://lfontaine.pythonanywhere.com/");
                } else {
                    webView.loadUrl("https://192.168.0.3:5009");
                }

            } else {
                // Permission denied, show a message to the user or handle as needed
            }
        }
    }
}
