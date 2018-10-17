package core;

public class Zupy {

    public static void main (String[] arga)  {

        Zupa pomidorowa = new Zupa ();
        pomidorowa.jakaZupa = "Pomidorowa";
        pomidorowa.czyLatwa = true;
        pomidorowa.czyWege = false;
        pomidorowa.informacjaPomidorowa();
        System.out.println(pomidorowa.czyGotowac());

    }

}

class Zupa {

    String jakaZupa;
    boolean czyWege, czyLatwa;

    void informacjaPomidorowa() {
        System.out.println("zupa " + jakaZupa + " jest smaczna.");
    }

    String czyGotowac() {
        if (czyLatwa && !czyWege) {
            return
                    "Dziś na obiad będzię zupa " + jakaZupa;
        } else {
            return "Nie bedzie obiadu";
        }
    }
}
