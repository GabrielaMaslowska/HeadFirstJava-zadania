package rozdzial6;
import java.util.*;
public class ArrayListMagnetTest {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0,"zero");
        a.add(1,"jeden");
        a.add(2,"dwa");
        a.add(3,"trzy");
        wyswietlWszystko(a);

        a.remove(2);

        if (a.contains("trzy")) {
            a.add("cztery");
        }
        wyswietlWszystko(a);

        if (a.indexOf("cztery") != 4) {
            a.add(4, "4.2");
        }
        wyswietlWszystko(a);

        if (a.contains("dwa")) {
            a.add("2.2");
        }
        wyswietlWszystko(a);

    }
    public static void wyswietlWszystko(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}

