# Travel AI Translator Android WebView App

This repository is a solution to integrate your web app into an Android application using WebView. The primary purpose is to provide a seamless experience for users accessing web apps on mobile devices.

In this repository, we are creating an android app for this webapp : https://lfontaine.pythonanywhere.com/

The webapp code is also on github : https://github.com/End2EndAI/travel-ai-translator

<div align="center">
    <img src="static/img/screenshot1.jpg" width="304" height="607" >
	<img src="static/img/screenshot2.png" width="304" height="607" >
</div>

## Demo

To see the Travel AI Translator Android App in action, please visit the live demo on the Play Store [here](https://play.google.com/store/apps/details?id=com.end2endai.traveltranslatorai&pcampaignid=web_share). This demo showcases how the android app works with the provided web app using a webview. Feel free to test and experience the integration.

## Table of Contents

1. [Structure](#structure)
2. [Contribute](#contribute)
3. [License](#license)
4. [Contact](#contact)


## Getting Started

Follow the steps below to set up the project locally.

### Structure

The `travel-ai-translator-android` repository is organized to ensure clarity and ease of navigation. Here's a brief overview of its structure:

- **app/**: This is the main directory containing all the Android app-related files.
  - **src/main/java/com/end2endai/traveltranslatorai/**: Houses the `MainActivity.java` which contains the primary logic for the WebView integration and permission handling.
  - **src/main/res/**: Contains resources for the app, such as layouts, drawables, and values. Notably, the `activity_main.xml` defines the layout structure for the main activity, and the various `mipmap` folders contain the app icons.
- **gradle/**: Contains files related to the Gradle build system.
- **playstore/**: This directory has screenshots and images related to the app's Play Store listing.
- **build.gradle**: A build configuration file for the app module.
- **settings.gradle**: Contains project settings for Gradle.

By understanding this structure, developers can easily navigate the repository, make modifications, and extend the functionality of the app.

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

4. Modify the App Name:
	- Navigate to app/src/main/res/values/strings.xml.
	- Locate the app_name string resource and modify its value to your desired app name.

4. Replace App Icons:
    - Navigate to the `app/src/main/res` directory.
    - Replace the images in the various `mipmap` folders with your own app icons.
      - You can use [easyappicon.com](https://easyappicon.com/) to generate the necessary icon files and copy paste into the `/res` folder.
	  - Keep the default name `ic_launcher`

5. Build and run the app on an emulator or a physical device. Experience your web app within the Android WebView environment.


### Building and Running on Your Android Device

1. **Enable Developer Mode on Your Android Device**:
   - Go to `Settings` > `About phone`.
   - Tap on the `Build number` multiple times (usually 7 times) until you see a message that says "You are now a developer!"
   
2. **Enable USB Debugging**:
   - Go back to the main `Settings` menu and now you should find a new option called `Developer options`.
   - Open `Developer options` and enable `USB Debugging`.

3. **Connect Your Android Device to Your Computer**:
   - Use a USB cable to connect your Android device to your computer.
   - You might receive a prompt on your Android device asking to allow USB debugging. Make sure to accept it.

4. **Set Up Your Device in Android Studio**:
   - Open Android Studio and the `travel-ai-translator-android` project.
   - In the top-right corner, ensure your device is detected and selected from the dropdown list. If it's not showing up, make sure the correct drivers for your device are installed on your computer.

5. **Build and Run**:
   - Click on the green play button (▶️) or choose `Run` > `Run 'app'` from the top menu.
   - Android Studio will build the app and install it on your connected device.
   - Once installed, the app should automatically launch on your device.

6. **Grant Necessary Permissions**:
   - On the first launch, the app might request certain permissions (like Internet access or audio recording). Make sure to grant these permissions for the app to function correctly.


## Contribute

Contributions are always welcome! Feel free to fork the repository, make changes, and submit pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE.md) file for details.

## Contact

For any inquiries, feedback, or suggestions, please feel free to reach out. You can contact directly via email at [louis.fontaine.pro@gmail.com](mailto:louis.fontaine.pro@gmail.com).
