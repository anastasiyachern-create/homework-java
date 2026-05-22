package Lesson6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts;
    public PhoneBook() {
        contacts = new HashMap<>();
    }
    public void add(String surname,
                    String phoneNumber) {
        if (!contacts.containsKey(surname)) {
            contacts.put(surname, new ArrayList<>());
        }
        contacts.get(surname).add(phoneNumber);
    }
    public void get(String surname) {
        if (contacts.containsKey(surname)) {
            System.out.println(
                    surname + ": " + contacts.get(surname)
            );
        } else {
            System.out.println(
                    "Фамилия не найдена"
            );
        }
    }
}
