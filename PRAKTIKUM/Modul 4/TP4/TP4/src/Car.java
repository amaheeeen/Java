// Class
public class Car {
    // Attributes
    private String brand;
    private int year;
    
    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // Method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
