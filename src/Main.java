import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Application aplikacja1 = new Application();
        Scanner skaner1  = new Scanner(System.in);
        String option = "";

        while(true){
            System.out.println("Podaj login i hasło");
            System.out.print("Login: ");
            String login = skaner1.nextLine();
            System.out.print("Hasło: ");
            String password = skaner1.nextLine();
            if(aplikacja1.login(login, password)){
                break;

            }
            else {
                System.out.println("Wprowadzono nieprawidłowe dane");
            }

        }

        System.out.println("Logowanie się powiodło");
    }
}


