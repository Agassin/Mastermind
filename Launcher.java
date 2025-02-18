public class Launcher {
    public static void main(String[] args){
        Modele m = new Modele();
        Controller c = new Controller();
        Vue v = new Vue(5, m.couleurs, c);
    }
    
}
