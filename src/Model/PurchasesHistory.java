package Model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class PurchasesHistory {
    private int ID;
    private HashMap<Product, Integer> productList;
    private User user;
    private Date purchaseDate;

    public PurchasesHistory(int ID, HashMap<Product, Integer> productList, User user, Date purchaseDate) {
        this.ID = ID;
        this.productList = productList;
        this.user = user;
        this.purchaseDate = purchaseDate;
    }

    public int getID() {
        return ID;
    }

    public HashMap<Product, Integer> getProductList() {
        return productList;
    }

    public User getUser() {
        return user;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }
}
