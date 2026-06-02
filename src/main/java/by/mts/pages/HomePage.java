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
}