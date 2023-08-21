# Travel AI Translator Android WebView

Travel AI Translator Android WebView is a solution to integrate your web app into an Android application using WebView. The primary purpose is to provide a seamless experience for users accessing web apps on mobile devices.

<div align="center">
    <img src="static/img/screenshot1.png" width="270" height="600" >
	<img src="static/img/screenshot2.png" width="270" height="600" >
</div>

## Demo

To see the Travel AI Translator Android App in action, please visit the live demo on the Play Store [here](https://play.google.com/store/apps/details?id=com.end2endai.traveltranslatorai&pcampaignid=web_share). This demo showcases how the android app works with the provided web app using a webview. Feel free to test and experience the integration.

## Table of Contents

1. [Getting Started](#getting-started)
2. [Prerequisites](#prerequisites)
3. [Installation](#installation)
4. [Contribute](#contribute)
5. [License](#license)
6. [Contact](#contact)

## Getting Started

Follow the steps below to set up the project locally.

### Prerequisites

Ensure you have Android Studio installed and set up on your machine.

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/End2EndAI/travel-ai-translator-android.git
   ```

2. Open the project in Android Studio and sync Gradle.

3. Set Up Your Web App URL:
    - Open the `MainActivity.java` file.
    - Replace the URL `https://lfontaine.pythonanywhere.com/` with the URL of your web app.

4. Replace App Icons:
    - Navigate to the `app/src/main/res` directory.
    - Replace the images in the various `mipmap` folders with your own app icons.
      - Use [easyappicon.com](https://easyappicon.com/) to generate the necessary icon files.

5. Build and run the app on an emulator or a physical device. Experience your web app within the Android WebView environment.

## Contribute

Contributions are always welcome! Feel free to fork the repository, make changes, and submit pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE.md) file for details.

## Contact

For any inquiries, feedback, or suggestions, please feel free to reach out. You can contact directly via email at [louis.fontaine.pro@gmail.com](mailto:louis.fontaine.pro@gmail.com).