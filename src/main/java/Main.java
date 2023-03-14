import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Wyświetlić wymiar tablicy i wywołać metodę PrzedstawSie.

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Podaj wymiar tablicy");

        int wymiar = myObj.nextInt();

        NaturalnaTablica naturalnaTablica = new NT2(wymiar);
        NaturalnaTablica naturalnaTablica2 = new NT2();

        System.out.println("Wymiar Twojej tablicy to: " + naturalnaTablica.getWymiar());
        System.out.println("Wymiar defaultowy tablicy utworzonej bez pobrania wymiaru od uzytkownika to: " + naturalnaTablica2.getWymiar());

        naturalnaTablica.przedstawSie();
        naturalnaTablica2.przedstawSie();


    }
}
