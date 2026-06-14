package by.mts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final By cardNumber =
            By.xpath("//*[contains(text(),'Номер карты')]");
    private final By expiryDate =
            By.xpath("//*[contains(text(),'Срок действия')]");
    private final By cvc =
            By.xpath("//*[contains(text(),'CVC')]");
    private final By cardHolder =
            By.xpath("//*[contains(text(),'Имя и фамилия')]");
    private final By amount =
            By.xpath("//*[contains(text(),'BYN')]");
    private final By paymentInfo =
            By.xpath("//*[contains(text(),'37529')]");
    private final By payButton =
            By.xpath("//*[contains(text(),'Оплатить')]");
    private final By paymentSystems =
            By.cssSelector("img");

    public String getAmountText() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(amount)
        ).getText();
    }

    public String getPaymentInfoText() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(paymentInfo)
        ).getText();
    }

    public String getPayButtonText() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(payButton)
        ).getText();
    }

    public PaymentPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(0)
        );
    }

    public boolean isCardNumberDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(cardNumber)
        ).isDisplayed();
    }

    public boolean isExpiryDateDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(expiryDate)
        ).isDisplayed();
    }

    public boolean isCvcDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(cvc)
        ).isDisplayed();
    }

    public boolean isCardHolderDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(cardHolder)
        ).isDisplayed();
    }

    public int getPaymentSystemsCount() {
        return driver.findElements(paymentSystems).size();
    }
}