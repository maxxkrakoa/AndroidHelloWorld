# Hello World Android App
A simple Hello World Android app with very basic Espresso tests. Included classes for running tests in Visual Studio App Center.

## Notes

### Permissions to enable
Add this to the manifest:

`<uses-permission android:name="android.permission.INTERNET" />`

### Dependencies to include
In the app `build.gradle`include the following
```
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test:rules:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'

    androidTestImplementation 'com.microsoft.appcenter:espresso-test-extension:1.3'
```

And set `testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"`

### Visual Studio App Center Test
Get build ready for Visual Studio App Center Test:

```
./gradlew assembleDebug
./gradlew assembleDebugAndroidTest
```

To run Espresso tests in Visual Studio App Center use the following values when executing `appcenter` CLI command

- `--app-path app/build/outputs/apk/debug/app-debug.apk`
- `--build-dir app/build/outputs/apk/androidTest/debug/`
