import Model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controller {

    private List<Product> products;
    private List<User> users;

    public User getLoggedUser() {
        return loggedUser;
    }

    private User loggedUser;

    private List<PurchasesHistory> purchasesHistory;

    public Controller() {
        products = new ArrayList<>();
        users = new ArrayList<>();
        purchasesHistory = new ArrayList<>();
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
                loggedUser = users.get(i);
                return true;
            }


        }
        return false;
    }

    public boolean checkIfProductExists(int ID) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getID() == ID) {
                return true;
            }

        }
        return false;
    }

    public boolean checkIfEnoughProducts(int ID, int amount){
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getID() == ID && products.get(i).getCount() <= amount){
                return  true;
            }
        }
        return  false;
    }

    public Product getProductByID(int ID){
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getID() == ID){
                return products.get(i);
            }
        }
        return  null;
    }

    public void addPurchasesHistory(PurchasesHistory p){
        purchasesHistory.add(p);
    }

}