import Model.Category;
import Model.Manufacturer;
import Model.Product;
import Model.User;

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
        Manufacturer manufacturer1 = new Manufacturer(1,"Piekarnia u Staszka", "Warszawa", "Staszek");
    products.add(new Product(1, "Chleb", "Razowy",4.99, Category.FOODS, manufacturer1, parametersChleb, 100) );
        HashMap<String, String> parametersTV = new HashMap<>();
        parametersTV.put("Przekątna ekranu", "52 cale");
        Manufacturer manufacturer2 = new Manufacturer(2,"Samsung", "Warszawa", "Kowalski");
        products.add(new Product(2, "Telewizor", "Telewizor plazmowy",2999, Category.HOME_APPLIANCES, manufacturer2, parametersTV, 10) );

    }


    public List<Product> getProducts() {
        return products;
    }
}
