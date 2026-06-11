package by.mts;

import by.mts.pages.HomePage;
import by.mts.pages.PaymentPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class OnlinePaymentBlockTest extends BaseUiTest {

    @Test
    @DisplayName("Название блока: Онлайн пополнение без комиссии")
    void paymentBlockTitleIsDisplayed() {

        HomePage homePage = new HomePage(driver, wait).open();
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

    @Test
    @DisplayName("Плейсхолдер для Услуги связи")
    void connectionPlaceholderTest() {

        HomePage homePage = new HomePage(driver, wait).open();

        assertEquals(
                "Номер телефона",
                homePage.getConnectionPlaceholder()
        );
    }

    @Test
    @DisplayName("Плейсхолдер для Домашний интернет")
    void internetPlaceholderTest() {

        HomePage homePage = new HomePage(driver, wait).open();

        homePage.hideCookieBanner();

        homePage.selectHomeInternet();

        assertEquals(
                "Номер абонента",
                homePage.getInternetPlaceholder()
        );
    }

    @Test
    @DisplayName("Плейсхолдер для Рассрочка")
    void installmentPlaceholderTest() {

        HomePage homePage = new HomePage(driver, wait).open();

        homePage.hideCookieBanner();
        homePage.selectInstallment();

        assertEquals(
                "Номер счета на 44",
                homePage.getInstallmentPlaceholder()
        );
    }

    @Test
    @DisplayName("Плейсхолдер для Задолженность")
    void arrearsPlaceholderTest() {

        HomePage homePage = new HomePage(driver, wait).open();

        homePage.hideCookieBanner();
        homePage.selectArrears();

        assertEquals(
                "Номер счета на 2073",
                homePage.getArrearsPlaceholder()
        );
    }

    @Test
    @DisplayName("Проверка данных в окне оплаты")
    void paymentFormDataTest() {

        HomePage homePage = new HomePage(driver, wait).open();

        homePage.hideCookieBanner();

        homePage.enterPhone("297777777");
        homePage.enterSum("100");

        homePage.clickContinue();

        PaymentPage paymentPage =
                new PaymentPage(driver, wait);

        assertTrue(paymentPage.isCardNumberDisplayed());
        assertTrue(paymentPage.isExpiryDateDisplayed());
        assertTrue(paymentPage.isCvcDisplayed());
        assertTrue(paymentPage.isCardHolderDisplayed());

        assertTrue(
                paymentPage.getAmountText().contains("100")
        );

        assertTrue(
                paymentPage.getPaymentInfoText()
                        .contains("375297777777")
        );

        assertTrue(
                paymentPage.getPayButtonText()
                        .contains("100")
        );

        assertTrue(
                paymentPage.getPaymentSystemsCount() > 0
        );
    }
}
