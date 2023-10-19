package POM;

import io.appium.java_client.android.AndroidDriver;

public abstract class PackagePage {
    final AndroidDriver driver;

    final String currentPackage = "com.claudivan.taskagenda";
    public PackagePage(AndroidDriver driver) {
        this.driver = driver;
    }
}
