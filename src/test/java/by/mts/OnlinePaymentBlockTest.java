package by.mts;

import by.mts.pages.HomePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlinePaymentBlockTest extends BaseUiTest {

    @Test
    @DisplayName("Название блока: Онлайн пополнение без комиссии")
    void paymentBlockTitleIsDisplayed() {

        HomePage homePage = new HomePage(driver, wait).open();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        assertEquals(
                "Онлайн пополнение без комиссии",
                homePage.paymentTitleText()
        );
    }

    @Test
    @DisplayName("Отображаются логотипы платежных систем")
    void paymentSystemsLogosAreDisplayed() {

        HomePage homePage = new HomePage(driver, wait).open();

        assertEquals(
                5,
                homePage.getPaymentLogosCount()
        );
    }

    @Test
    @DisplayName("Переход по ссылке Подробнее о сервисе")
    void detailsLinkWorks() {

        HomePage homePage = new HomePage(driver, wait).open();

        homePage.hideCookieBanner();
        homePage.clickDetailsLink();

        assertEquals(
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                homePage.getCurrentUrl()
        );
    }

    @Test
    @DisplayName("Заполнение формы и нажатие кнопки Продолжить")
    void continueButtonWorks() {

        HomePage homePage = new HomePage(driver, wait).open();

        homePage.hideCookieBanner();

        homePage.enterPhone("297777777");
        homePage.enterSum("100");

        homePage.clickContinue();
    }
}
