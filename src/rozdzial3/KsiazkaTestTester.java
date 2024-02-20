package rozdzial3;

public class KsiazkaTestTester {
    public static void main(String[] args) {

        Ksiazka[] mojeKsiazki = new Ksiazka[3];
        int x = 0;
        mojeKsiazki[0] = new Ksiazka();
        mojeKsiazki[1] = new Ksiazka();
        mojeKsiazki[2] = new Ksiazka();
        mojeKsiazki[0].tytul = "A";
        mojeKsiazki[1].tytul = "B";
        mojeKsiazki[2].tytul = "C";
        mojeKsiazki[0].autor = "a";
        mojeKsiazki[1].autor = "b";
        mojeKsiazki[2].autor = "c";

        while (x<3) {
            System.out.print(mojeKsiazki[x].tytul);
            System.out.print(", autor ");
            System.out.println(mojeKsiazki[x].autor);
            x = x + 1;
        }
    }
}
