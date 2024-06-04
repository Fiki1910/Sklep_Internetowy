import Model.Product;
import Model.PurchasesHistory;
import Model.User;

import java.util.List;

public class Application {

    private Controller controller;

    public Application() {
        controller = new Controller();
    }

    public void printAllProducts(){
        List<Product> listOfProducts = controller.getProducts();
        for(int i = 0; i < listOfProducts.size(); i++){
            System.out.println(listOfProducts.get(i));
        }


    }
    public boolean login(String login, String password){
        return controller.login(login, password);
    }
    public boolean checkIfProductExists(int ID){
        return controller.checkIfProductExists(ID);
    }
    public boolean checkIfEnoughProducts(int ID, int amount){
        return  controller.checkIfEnoughProducts(ID, amount);
    }
    public Product getProductByID(int ID){
        return  controller.getProductByID(ID);
    }
    public User getLoggedUser(){
        return  controller.getLoggedUser();
    }
    public void addPurchasesHistory(PurchasesHistory p){
        controller.addPurchasesHistory(p);
    }
}
