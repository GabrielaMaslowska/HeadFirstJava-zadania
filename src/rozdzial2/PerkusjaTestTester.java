package rozdzial2;

public class PerkusjaTestTester {
    public static void main(String[] args) {

        Perkusja p = new Perkusja();
        p.zagrajNaBebnie();
        p.zagrajNaTalerzach();
        p.beben = false;

        if (p.beben == true) {
            p.zagrajNaBebnie();
        }

    }
}
