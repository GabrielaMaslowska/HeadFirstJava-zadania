package rozdzial1;

public class ZagadkowyBasen1 {
    public static void main(String[] args) {
        int x = 0;
        while(x < 4) {
            System.out.println("a");
            if (x < 1) {
                System.out.println(" ");
            }
            System.out.println("n");
            if (x > 1) {
                System.out.println("tyczny");
                x = x + 2 ;
            }
            if (x == 1) {
                System.out.println("talek");
            }
            if (x < 1) {
                System.out.println("asz");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}
