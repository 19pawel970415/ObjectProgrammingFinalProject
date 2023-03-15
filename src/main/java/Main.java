import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main implements ActionListener {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj wymiar tablicy");

        int wymiar = myObj.nextInt();

        Integer[] tablica = new Integer[wymiar];
        Integer[] tablica2 = new Integer[5];
        Integer[] tablica3 = new Integer[5];

        for (int i = 0; i < wymiar; i++) {
            Integer rand = (int) ((Math.random() * (10 - 0)) + 0);
            tablica[i] = rand;
        }

        for (int i = 0; i < 5; i++) {
            Integer rand = (int) ((Math.random() * (10 - 0)) + 0);
            tablica2[i] = rand;
        }

        for (int i = 0; i < 5; i++) {
            Integer rand = (int) ((Math.random() * (10 - 0)) + 0);
            tablica3[i] = rand;
        }

        NaturalnaTablica<Integer> naturalnaTablica = new NT2<Integer>(tablica, wymiar);
        NaturalnaTablica<Integer> naturalnaTablica2 = new NT2<Integer>(tablica2);
        NaturalnaTablica<Integer> naturalnaTablica3 = new NaturalnaTablica<Integer>(tablica3);

        System.out.println("Wymiar Twojej tablicy to: " + naturalnaTablica.getWymiar());
        System.out.println("Wymiar defaultowych tablic utworzonych bez pobrania wymiaru od uzytkownika to: " + naturalnaTablica2.getWymiar());

        naturalnaTablica.przedstawSie();
        naturalnaTablica2.przedstawSie();
        naturalnaTablica3.przedstawSie();

        String tabElemsAsText = naturalnaTablica.getTabElemsAsText();
        String tab2ElemsAsText = naturalnaTablica2.getTabElemsAsText();
        String tab3ElemsAsText = naturalnaTablica2.getTabElemsAsText();

        System.out.println(tabElemsAsText);
        System.out.println(tab2ElemsAsText);
        System.out.println(tab3ElemsAsText);

        String naturalnaTablicaToString = naturalnaTablica.toString();
        String naturalnaTablica2ToString = naturalnaTablica2.toString();
        String naturalnaTablica3ToString = naturalnaTablica3.toString();

        System.out.println("Ilosc tablic w tym momencie to " + naturalnaTablicaToString);

        if(naturalnaTablica.isMoreThanTwo()) {
            //Tworzenie ramki
            JFrame frame = new JFrame("");
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //obiektu
            Main obj = new Main();

            //przycisku by moc zobaczyc komunikat
            JButton button = new JButton("Wyswietl komunikat");
            frame.add(button);
            button.addActionListener(obj);

            //widocznosc ramki
            frame.setVisible(true);

        }
    }

    //funkcja do towrzenia drugiej ramki z komunikatem
    public void actionPerformed(ActionEvent e) {
        //Tworzenie ramki
        JFrame sub_frame = new JFrame("");
        sub_frame.setSize(200, 200);

        //Wypisanie komunikatu
        JLabel label = new JLabel("Mamy juz wiecej niz 2 obiekty");
        sub_frame.add(label);

        //widocznosc ramki
        sub_frame.setVisible(true);
    }
}

