package rozdzial6;
import java.util.*;
public class ArrayListMagnet {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "jeden");
        a.add(2, "dwa");
        a.add(3, "trzy");
        wyswietlWszystko(a);

        a.remove(2);

        if (a.contains("trzy")) {
            a.add("cztery");
        }
        wyswietlWszystko(a);

        if (a.indexOf("cztery") != 4) { // "cztery" znajduje się w indexie 3, więc dodany jest dodatkowy elemnt
            a.add(4,"4.2");
        }
        wyswietlWszystko(a); //w ksiazce blad w proponowanych fragmentach (printaAL(a))

        if (a.contains("dwa")) {
            a.add("2.2");
        }
        wyswietlWszystko(a); //w ksiazce blad w proponowanych fragmentach (printaAL(a))
    }

    public static void wyswietlWszystko(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
