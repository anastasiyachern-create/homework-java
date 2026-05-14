package Lesson3;

public class Park {
    public class Attraction {
    private String attractionName;
    private String workingHours;
    private int price;
    public Attraction(String attractionName,
                      String workingHours,
                      int price) {
        this.attractionName = attractionName;
        this.workingHours = workingHours;
        this.price = price;
    }
    public void printAttractionInfo() {
        System.out.println("Аттракцион: " + attractionName);
        System.out.println("Время работы: " + workingHours);
        System.out.println("Стоимость: " + price);
    }
}
}

