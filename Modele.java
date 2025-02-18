
import java.awt.Color;

class Modele {
    Color[] couleurs = {Color.yellow, Color.BLUE,Color.BLACK, Color.GREEN, Color.magenta,Color.red, Color.orange,Color.white};
    int N_TENTATIVES = 10;
    static int DIFFICULTE = 4;
    enum Etat {
        EN_COURS,
        GAGNE,
        PERDU
    }
    public void completerRangee(int i){
        System.out.println("ajout de la couleur :"+couleurs[i]);
    }
}

