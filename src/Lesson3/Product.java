package Lesson3;

public class Product {
        private String name;
        private String productionDate;
        private String manufacturer;
        private String country;
        private int price;
        private boolean reserved;
        public Product(String name,
                       String productionDate,
                       String manufacturer,
                       String country,
                       int price,
                       boolean reserved) {
            this.name = name;
            this.productionDate = productionDate;
            this.manufacturer = manufacturer;
            this.country = country;
            this.price = price;
            this.reserved = reserved;
        }
        public void printInfo() {
            System.out.println("Название: " + name);
            System.out.println("Дата производства: " + productionDate);
            System.out.println("Производитель: " + manufacturer);
            System.out.println("Страна: " + country);
            System.out.println("Цена: " + price);
            System.out.println("Забронирован: " + reserved);
        }
    }
