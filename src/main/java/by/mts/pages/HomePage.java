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


    private final By phoneField =
            By.id("connection-phone");

    private final By sumField =
            By.xpath("//form[@id='pay-connection']//input[@placeholder='Сумма']");

    private final By continueButton =
            By.xpath("//form[@id='pay-connection']//button[@type='submit']");

    private final By serviceTypeDropdown =
            By.cssSelector(".select__header");

    private final By internetPhoneField =
            By.id("internet-phone");

    private final By installmentField =
            By.id("score-instalment");

    private final By arrearsField =
            By.id("score-arrears");


    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public HomePage open() {
        driver.get(URL);
        return this;
    }

    public void selectHomeInternet() {

        wait.until(
                ExpectedConditions.elementToBeClickable(serviceTypeDropdown)
        ).click();

        var element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//p[text()='Домашний интернет']")
                )
        );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

    public void selectInstallment() {

        wait.until(
                ExpectedConditions.elementToBeClickable(serviceTypeDropdown)
        ).click();

        var element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//p[text()='Рассрочка']")
                )
        );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

    public void selectArrears() {

        wait.until(
                ExpectedConditions.elementToBeClickable(serviceTypeDropdown)
        ).click();

        var element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//p[text()='Задолженность']")
                )
        );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

    public String getConnectionPlaceholder() {
        return driver.findElement(phoneField)
                .getAttribute("placeholder");
    }

    public String getInternetPlaceholder() {
        return driver.findElement(internetPhoneField)
                .getAttribute("placeholder");
    }

    public String getInstallmentPlaceholder() {
        return driver.findElement(installmentField)
                .getAttribute("placeholder");
    }

    public String getArrearsPlaceholder() {
        return driver.findElement(arrearsField)
                .getAttribute("placeholder");
    }


    public String paymentTitleText() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(paymentTitle)
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

        var button = wait.until(
                ExpectedConditions.elementToBeClickable(continueButton)
        );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", button);
    }

    public void hideCookieBanner() {
        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "document.querySelector('.cookie').style.display='none';");
    }
}