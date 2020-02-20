package com.sparta.engineering50.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectFlightPage extends PageObject {
    @FindBy(name = "fromPort")
    Select departureCity;

    @FindBy(name = "toPort")
    Select destinationCity;

    @FindBy(xpath = "/html/body/div[3]/form/div/input")
    WebElement findFlightsButton;

    public SelectFlightPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SelectFlightPage goToSelectFlightPage() {
        webDriver.get("http://blazedemo.com/index.php");
        return this;
    }

    public void selectDepartureCity(String departureCity) {
        this.departureCity.selectByValue(departureCity);
    }

    public void selectDestinationCity(String destinationCity) {
        this.destinationCity.selectByValue(destinationCity);
    }

    // 'findFlights' or 'submit'???
    public ReserveFlightPage findFlights() {
        findFlightsButton.click();
        return new ReserveFlightPage(webDriver);
    }
}
