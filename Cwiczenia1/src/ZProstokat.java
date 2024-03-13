public class ZProstokat extends Prostokat {
    static int counterK;
    static int counterP;
    char kontur;
    char srodek;


    public ZProstokat(int szerokosc, int wysokosc, char kontur, char srodek) {
        super(szerokosc, wysokosc);
        this.kontur = kontur;
        this.srodek = srodek;
    }

    public ZProstokat(int szerokosc, char kontur, char srodek) {
        super(szerokosc, szerokosc);
        this.kontur = kontur;
        this.srodek = srodek;
    }

    int konturCounter = szerkość*2+(wysokość-2)*2;
    int srodekCounter=szerkość*wysokość-konturCounter;



    public void rysuj() {
        if (wysokość == szerkość){
            System.out.println("Kwadrat (" + ++counterK + ")" + " rozmiaru " + szerkość +"x"+szerkość+" " + kontur + "=" + konturCounter +"," + srodek +"=" + srodekCounter);
            for (int i = 0; i < szerkość; i++) {
                for (int j = 0; j < wysokość; j++) {
                    if (i == 0 || i == szerkość - 1 || j == 0 || j == wysokość - 1) {
                        System.out.print(kontur);
                    } else
                        System.out.print(srodek);
                }
                System.out.println();

            }
            System.out.println();
        } else
            System.out.println("Prostokąt (" + ++counterP + ")"+ " rozmiaru " + szerkość +"x"+ wysokość +" "+ kontur + "=" + konturCounter +"," + srodek +"=" + srodekCounter);
        for (int i = 0; i < szerkość; i++) {
            for (int j = 0; j < wysokość; j++) {
                if (i == 0 || i == szerkość - 1 || j == 0 || j == wysokość - 1) {
                    System.out.print(kontur);
                } else
                    System.out.print(srodek);
            }
            System.out.println();
        }
        System.out.println();



    }
}
