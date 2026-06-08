package by.mts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String URL = "https://www.mts.by/";

    private final By paymentTitle =
            By.cssSelector("#pay-section h2");

    private final By paymentLogos =
            By.cssSelector(".pay__partners img");

    private final By detailsLink =
            By.xpath("//a[contains(text(),'Подробнее о сервисе')]");

    public void hideCookieBanner() {
        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "document.querySelector('.cookie').style.display='none';");
    }

    private final By phoneField =
            By.id("connection-phone");

    private final By sumField =
            By.xpath("//form[@id='pay-connection']//input[@placeholder='Сумма']");

    private final By continueButton =
            By.xpath("//form[@id='pay-connection']//button[@type='submit']");

    private final By paymentModal =
            By.cssSelector(".bepaid-app");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public HomePage open() {
        driver.get(URL);
        return this;
    }

    public String paymentTitleText() {

        By title = By.xpath("//div[@id='pay-section']//h2");

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(title)
        ).getText().replaceAll("\\s+", " ").trim();
    }

    public int getPaymentLogosCount() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(paymentLogos)
        ).size();
    }

    public void clickDetailsLink() {
        wait.until(
                ExpectedConditions.elementToBeClickable(detailsLink)
        ).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void enterPhone(String phone) {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(phoneField)
        ).sendKeys(phone);
    }

    public void enterSum(String sum) {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(sumField)
        ).sendKeys(sum);
    }

    public void clickContinue() {
        wait.until(
                ExpectedConditions.elementToBeClickable(continueButton)
        ).click();
    }

    public boolean isPaymentFormDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(paymentModal)
        ).isDisplayed();
    }
}