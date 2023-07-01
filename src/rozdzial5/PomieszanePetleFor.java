package rozdzial5;

public class PomieszanePetleFor {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int zewn = 0; zewn < 3; zewn++) {
            for (int wewn = 4; wewn > 1; wewn--) {
                x = x + 0; //tutaj wersje kodu
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}

//wersje kodu i dopasowane wyniki:
//x = x + 3 -> 54 6
//x = x + 6 -> 60 10
//x = x + 2 -> 45 6
//x++ -> 36 6
//x-- -> 18 6
//x = x + 0 -> 6 14