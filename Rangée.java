
import java.awt.Color;


public class Rangée {
    private Color[] jetons;
    private int indiceJeton;
    private int noirs;  
    private int blancs; 
    public Rangée() {
        jetons = new Color[Modele.DIFFICULTE];
        this.indiceJeton = 0;
        this.noirs = 0;
        this.blancs = 0;
    }

    public Color[] getJetons() {
        return jetons;
    }
    
    public void setJeton(int index, Color couleur) {
        if (index >= 0 && index < Modele.DIFFICULTE) {
            jetons[index] = couleur;
            indiceJeton++;
        }
    }
    
    public int getIndiceJeton() {
        return indiceJeton;
    }
    
    public void setIndiceJeton(int indiceJeton) {
        this.indiceJeton = indiceJeton;
    }
    
    public int getNoirs() {
        return noirs;
    }
    
    public void setNoirs(int noirs) {
        this.noirs = noirs;
    }
    
    public int getBlancs() {
        return blancs;
    }
    
    public void setBlancs(int blancs) {
        this.blancs = blancs;
    }

    
// bc = bonne couleur bcbp = bonne couleur et bien placée
    public void calculerResultat(Color[] combinaison) {
        int nbNoirs = 0;
        int nbBlancs = 0;

        boolean[] bc = new boolean[Modele.DIFFICULTE];
        boolean[] bcbp = new boolean[Modele.DIFFICULTE];

        for (int i = 0; i < Modele.DIFFICULTE; i++) {
            if (jetons[i] != null && jetons[i].equals(combinaison[i])) {
                nbNoirs++;
                bc[i] = true;
                bcbp[i] = true;
            }
        }

        for (int i = 0; i < Modele.DIFFICULTE; i++) {
            if (!bcbp[i]) {
                for (int j = 0; j < Modele.DIFFICULTE; j++) {
                    if (!bc[j] && jetons[i] != null && jetons[i].equals(combinaison[j])) {
                        nbBlancs++;
                        bc[j] = true;
                        break;
                    }
                }
            }
        }

        this.noirs = nbNoirs;
        this.blancs = nbBlancs;
    }
}


















































    
   
