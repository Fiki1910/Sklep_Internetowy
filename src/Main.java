import Model.Product;
import Model.PurchasesHistory;
import Model.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Application aplikacja1 = new Application();

    public static void main(String[] args) {
        System.out.println();
        Scanner skaner1 = new Scanner(System.in);
        String option = "";

        while (true) {
            System.out.println("Podaj login i hasło");
            System.out.print("Login: ");
            String login = skaner1.nextLine();
            System.out.print("Hasło: ");
            String password = skaner1.nextLine();
            if (aplikacja1.login(login, password)) {
                break;

            } else {
                System.out.println("Wprowadzono nieprawidłowe dane");
            }

        }

        System.out.println("Logowanie się powiodło");

        while (true) {
            System.out.println("1. Wyświetl wszystkie produkty");
            System.out.println("2. Kup produkty");
            System.out.println("0. Wyjdź");
            option = skaner1.nextLine();
            switch (option) {
                case "1":
                    aplikacja1.printAllProducts();
                    break;
                case "2":
                    buyProducts();
                    break;
                case "0":
                    return;
            }
        }
    }

    private static void buyProducts() {
        System.out.println("Ile różnych produktów chcesz kupić?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        HashMap<Product, Integer> products = new HashMap();
        for (int i = 0; i < count; i++) {
            System.out.println("Podaj ID produktu, który chcesz kupić");
            int id = scanner.nextInt();
            if (!aplikacja1.checkIfProductExists(id)) {
                System.out.println("Taki produkt nie istnieje");
                break;
            }
            System.out.println("Ile sztuk produktów chcesz kupić?");
            int amount = scanner.nextInt();
            if (!aplikacja1.checkIfEnoughProducts(id, amount)) {
                System.out.println("Brak wystarczającej liczby produktów na stanie");
                break;
            }
            products.put(aplikacja1.getProductByID(id), amount);
        }
        Random random = new Random();
        int purchaseID = random.nextInt();
        User user = aplikacja1.getLoggedUser();
        Date date = new Date();
        PurchasesHistory purchasesHistory = new PurchasesHistory(purchaseID, products, user, date);
        aplikacja1.addPurchasesHistory(purchasesHistory);
    }
}



