public abstract class Muzyk {
    public String imie;
    public double czas;

    public Muzyk(String imie, double czas) {
        this.imie = imie;
        this.czas = czas;
    }

    public String imie() {
        return imie;
    }

    public double czas() {
        return czas;
    }


    public abstract String instrument();

    public abstract double stawka();

    // double maxHon = muzycy[i].czas()*muzycy[i].stawka();



    public static Muzyk maxHonorarium(Muzyk[] muzycy) {

        Muzyk maxHonorariumMuzyk = muzycy[0];
        double maxHonorarium = muzycy[0].czas() * muzycy[0].stawka();
        //double honorarium = muzycy[i].czas() * muzycy[i].stawka();

        for (Muzyk m : muzycy) {
                double honoroarium = m.czas() * m.stawka();
                if(honoroarium > maxHonorarium){
                    maxHonorarium = honoroarium;
                    maxHonorariumMuzyk = m;
                }

            }

       return maxHonorariumMuzyk;
    }

    @Override
    public String toString() {
        return imie()+ ", czas = " + czas() + " godz., stawka = " + stawka();
    }
}
