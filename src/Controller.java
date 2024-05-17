import Model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controller {

    private List<Product> products;
    private List<User> users;

    public Controller() {
        products = new ArrayList<>();
        users = new ArrayList<>();
        HashMap<String, String> parametersChleb = new HashMap<>();
        parametersChleb.put("Data ważności", "10.05.2025");
        Manufacturer manufacturer1 = new Manufacturer(1, "Piekarnia u Staszka", "Warszawa", "Staszek");
        products.add(new Product(1, "Chleb", "Razowy", 4.99, Category.FOODS, manufacturer1, parametersChleb, 100));
        HashMap<String, String> parametersTV = new HashMap<>();
        parametersTV.put("Przekątna ekranu", "52 cale");
        Manufacturer manufacturer2 = new Manufacturer(2, "Samsung", "Warszawa", "Kowalski");
        products.add(new Product(2, "Telewizor", "Telewizor plazmowy", 2999, Category.HOME_APPLIANCES, manufacturer2, parametersTV, 10));
        User userStandard1 = new User(1, "Standard", "Standard", "Standard@Standard.pl", "Łódź, Klonowa 10", "Jan", "Nowak", UserType.STANDARD);
        users.add(userStandard1);
        User userAdmin1 = new User(2, "Admin", "Admin", "Admin@Admin.pl", "Łódź, Piekarnicza 10", "Tomasz", "Kowalski", UserType.ADMIN);
        users.add(userAdmin1);
    }


    public List<Product> getProducts() {
        return products;
    }

    public boolean login(String login, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(login) && users.get(i).getPassword().equals(password)) {
                return true;
            }


        }
        return false;
    }
}