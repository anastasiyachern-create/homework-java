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
}
