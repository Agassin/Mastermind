
import java.awt.Color;
import java.util.ArrayList;

class Modele {
    Color[] couleurs = {Color.yellow, Color.BLUE,Color.BLACK, Color.GREEN, Color.magenta,Color.red, Color.orange,Color.white};
    int N_TENTATIVES = 10;
    static int DIFFICULTE = 4;
    ArrayList<Color> ar_c = new ArrayList<>();
    enum Etat {
        EN_COURS,
        GAGNE,
        PERDU
    }
    public void completerRangee(int i){
        System.out.println("ajout de la couleur :"+couleurs[i]);
        ar_c.add(couleurs[i]);
        System.out.println(ar_c);
    }
}

