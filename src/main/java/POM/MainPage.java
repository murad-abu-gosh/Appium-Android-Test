package POM;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainPage extends PackagePage {

    private final By TOP_BUTTONS = By.id("com.claudivan.taskagenda:id/tvTitulo");

    private final By LEFT_ARROW_BTN = By.id("com.claudivan.taskagenda:id/ibtRetroceder");

    private final By RIGHT_ARROW_BTN = By.id("com.claudivan.taskagenda:id/ibtAvancar");

    private final By SIDE_PANEL_BTN = By.id("com.claudivan.taskagenda:id/hamburguer");

    private final By NEW_EVENT_BTN = By.id("com.claudivan.taskagenda:id/btNovoEvento");

    private final By NEW_EVENT_POPUP = By.id("android:id/text1");

    public MainPage(AndroidDriver driver) {
        super(driver);
    }
}
