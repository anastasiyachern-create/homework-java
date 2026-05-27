package Lesson6;

public class MainPhoneBook {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "111-111");
        phoneBook.add("Иванов", "222-222");
        phoneBook.add("Петров", "333-333");
        phoneBook.add("Сидоров", "444-444");
        phoneBook.get("Иванов");
        phoneBook.get("Петров");
        phoneBook.get("Смирнов");
    }
}
