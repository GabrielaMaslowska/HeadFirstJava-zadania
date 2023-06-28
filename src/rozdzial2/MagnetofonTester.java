package rozdzial2;

public class MagnetofonTester {
    public static void main(String[] args) {

        Magnetofon m = new Magnetofon(); //metoda nie ma obiektu, nalezy go zadeklarowac
        m.mozeNagrywac = true;
        m.odtworzTasme();

        if (m.mozeNagrywac == true) {
            m.nagrajTasme();
        }
    }
}

