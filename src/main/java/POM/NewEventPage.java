package POM;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import lombok.Getter;
import org.openqa.selenium.By;

public class NewEventPage extends PackagePage{



    @Getter
    private final String activity = ".Activities.ContainerFragmentsActivity";

    private final By EVENT_NAME_BOX = By.id("com.claudivan.taskagenda:id/etTitulo");

    private final By EVENT_DATE_BOX = By.id("com.claudivan.taskagenda:id/btData");

    private final By EVENT_TYPE_CIRCLE = By.id("com.claudivan.taskagenda:id/vCirculoEtiqueta");

    private final By EVENT_DESCRIPTION_BOX = By.id("com.claudivan.taskagenda:id/etDescricao");

    private final By EVENT_SAVE_BTN = By.id("com.claudivan.taskagenda:id/item_salvar");

    public NewEventPage(AndroidDriver driver) {
        super(driver);
    }

    public void openNewEventPage(){
        driver.startActivity(new Activity(currentPackage, activity));
    }

    public void enterEventName(String eventName){
        driver.findElement(EVENT_NAME_BOX).sendKeys(eventName);
    }

    public void enterEventDescription(String eventDescription){
        driver.findElement(EVENT_DESCRIPTION_BOX).sendKeys(eventDescription);
    }

    public void clickSaveEventButton(){
        driver.findElement(EVENT_SAVE_BTN).click();
    }

    public void AddNewEventSequence(String eventName, String eventDescription){
        enterEventName(eventName);
        enterEventDescription(eventDescription);
        clickSaveEventButton();
    }

}
