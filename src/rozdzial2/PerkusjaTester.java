package rozdzial2;

public class PerkusjaTester {
    public static void main(String[] args) {

        Perkusja p = new Perkusja();
        p.zagrajNaBebnie();
        p.beben = false;
        p.zagrajNaTalerzach();

        if (p.beben == true) {
            p.zagrajNaBebnie();
        }
    }
}
