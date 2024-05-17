import Model.Product;

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
}
