package Model;

import java.util.HashMap;

public class Product {

    private int ID;
    private String name;
    private String description;
    private double price;
    private Category category;
    private Manufacturer manufacturer;
    private HashMap <String, String> parameters;
    private int count;



    public Product(int ID, String name, String description, double price, Category category, Manufacturer manufacturer, HashMap<String, String> parameters, int count) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.manufacturer = manufacturer;
        this.parameters = parameters;
        this.count = count;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public HashMap<String, String> getParameters() {
        return parameters;
    }
    public int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", manufacturer=" + manufacturer +
                ", parameters=" + parameters +
                ", count=" + count +
                '}';
    }
}
