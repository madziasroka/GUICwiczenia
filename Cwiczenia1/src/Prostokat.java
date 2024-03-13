public class Prostokat {
     int szerkość;
     int wysokość;

    public  Prostokat(int szerokosc,int wysokosc){
        this.szerkość = szerokosc;
        this.wysokość = wysokosc;
    }

    public void rysuj(){
        if((wysokość==1 || szerkość==1)|| (wysokość==2 && szerkość==1)||(szerkość==2 &&wysokość==1) ) {
            System.out.println("Zwykły prostokąt rozmiaru " + wysokość + "x" + szerkość  +"\n" + "Błędny prostokąt!" + "\n");
        }else
            System.out.println("Zwykły prostokąt rozmiaru" + wysokość + "x" + szerkość+"\n");



    }

}
