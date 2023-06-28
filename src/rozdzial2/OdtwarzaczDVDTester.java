package rozdzial2;

public class OdtwarzaczDVDTester {
    public static void main(String[] args) {

        OdtwarzaczDVD o = new OdtwarzaczDVD();
        o.mozeNagrywac = true;
        o.odtworzPlyteDVD(); //wiersz sie nie skompiluje, bo trzeba zadeklarowac metode

        if (o.mozeNagrywac == true) {
            o.nagrajPlyteDVD();
        }
    }
}
