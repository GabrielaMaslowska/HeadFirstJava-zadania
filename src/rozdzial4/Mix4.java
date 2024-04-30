package rozdzial4;

public class Mix4 {
    int licznik = 0;

    public static void main(String[] args) {
        int ilosc = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while (x < 19) { //tu wstawiamy wersje kodu
            m4a[x] = new Mix4();
            m4a[x].licznik = m4a[x].licznik + 1;
            ilosc = ilosc + 1;
            ilosc = ilosc + m4a[x].mozeNowa(x);
            x = x + 1;
        }
        System.out.println(ilosc + " " + m4a[1].licznik);
    }
    public int mozeNowa(int indeks) {
        if (indeks < 1) { //tu wstawiamy wersje kodu
            Mix4 m4 = new Mix4();
            m4.licznik = m4.licznik + 1;
            return 1;
        }
        return 0;
    }
}

//wersje kodu i dopasowane wyniki:
//x<9; indeks<5; -> 14 1
//x<20; indeks<5; -> 25 1
//x<7; indeks<7; -> 14 1
//x<19; indeks<1 -> 20 1