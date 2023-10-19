package org.example;

import POM.ColorsPage;
import POM.NewEventPage;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidTest {

    private static AndroidDriver driver;
    private static int PORT = 4723;
    private static String HOST = "localhost";


    @BeforeAll
    public static void setUp() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:hostname", "localhost");
        desiredCapabilities.setCapability("appium:path", "/wd/hub");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appium:platformVersion", "13.0");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        desiredCapabilities.setCapability("appium:appPackage", "com.claudivan.taskagenda");
        desiredCapabilities.setCapability("appium:appActivity", ".Activities.MainActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




    }

    @Test
    public void testEnableDarkMode(){
        ColorsPage colorsPage = new ColorsPage(driver);
        colorsPage.openColorsPage();
        colorsPage.enableDarkModeSequence();
    }

    @Test
    public void testAddNewEvent() {

        NewEventPage newEventPage = new NewEventPage(driver);
        newEventPage.openNewEventPage();
        newEventPage.AddNewEventSequence("Doctor appointment", "check my back.");

    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}