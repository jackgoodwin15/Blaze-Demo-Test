package com.sparta.engineering50.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReserveFlightPage extends PageObject {
    @FindBy(xpath = "/html/body/div[2]/table/thead/tr/th[4]")
    WebElement departsCity;

    @FindBy(xpath = "/html/body/div[2]/table/thead/tr/th[5]")
    WebElement arrivalCity;

    public ReserveFlightPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getDepartingCityText() {
        return departsCity.getText();
    }

    public String getArrivalCityText() {
        return arrivalCity.getText();
    }
}
