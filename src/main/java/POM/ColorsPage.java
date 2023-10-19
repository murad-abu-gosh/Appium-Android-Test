package POM;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import lombok.Getter;
import org.openqa.selenium.By;

public class ColorsPage extends PackagePage {


    @Getter
    private final String activity = ".Activities.ContainerFragmentsActivity";

    private final By DARK_MODE_SETTINGS = By.id("com.claudivan.taskagenda:id/itemTemaEscuro");

    private final By DARK_MODE_OPTIONS = By.id("android:id/text1");

    public ColorsPage(AndroidDriver driver) {
        super(driver);
    }

    public void enableDarkModeSequence(){
//        openColorsPage();
        clickDarkModeSettings();
        clickDarkModeEnableOption();
    }

    private void clickDarkModeEnableOption() {
        driver.findElements(DARK_MODE_OPTIONS).get(1).click();
    }

    private void clickDarkModeSettings() {
        driver.findElement(DARK_MODE_SETTINGS).click();
    }

    public void openColorsPage() {
        driver.startActivity(new Activity(currentPackage, activity));
    }
}
