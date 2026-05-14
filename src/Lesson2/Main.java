package Lesson2;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product(
                "IPhone 17 Pro",
                "17.09.2025",
                "Apple",
                "USA",
                7777,
                true
        );
        productsArray[1] = new Product(
                "MacBook Pro",
                "01.02.2026",
                "Apple",
                "USA",
                6628,
                false
        );
        productsArray[2] = new Product(
                "Samsung Galaxy S26",
                "05.03.2026",
                "Samsung Corp.",
                "Vietnam",
                3381,
                true
        );
        productsArray[3] = new Product(
                "HONOR Magic7 Pro",
                "01.04.2026",
                "HONOR Corp.",
                "Vietnam",
                9913,
                true
        );
        productsArray[4] = new Product(
                "Samsung S25 Ultra",
                "01.02.2025",
                "Samsung Corp.",
                "Korea",
                5599,
                false
        );
        for (Product product : productsArray) {
            product.printInfo();
            System.out.println();
        }
        Park park = new Park();
        Park.Attraction attraction1 =
                park.new Attraction(
                        "Колесо обозрения",
                        "10:00 - 22:00",
                        500
                );
        Park.Attraction attraction2 =
                park.new Attraction(
                        "Американские горки",
                        "09:00 - 21:00",
                        800
                );
        attraction1.printAttractionInfo();
        System.out.println();
        attraction2.printAttractionInfo();
    }
}