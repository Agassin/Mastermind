
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Vue{
    private Color[] liste_couleurs;
    private JPanel pan = new JPanel();
    private JPanel bas = new JPanel();
    private JPanel est = new JPanel();
    private BorderLayout bl = new BorderLayout();
    private GridLayout grid = new GridLayout(0,8, 5,5);

    

    public Vue(int difficulte, Color[] liste_c, ActionListener al){
        this.liste_couleurs = liste_c;
        JFrame fenetre = new JFrame("Mastermind");
        fenetre.setVisible(true);
        fenetre.setSize(400,500);
        fenetre.setContentPane(pan);
        fenetre.setVisible(true);
        this.pan.setLayout(bl);
        this.pan.setBackground(Color.LIGHT_GRAY);
        this.pan.add(bas, bl.SOUTH);
        this.pan.add(est, bl.EAST);
        this.est.setBackground(Color.ORANGE);
        bas.setLayout(grid);
        bas.setPreferredSize(new Dimension(440, 40));
        ArrayList<Button> b_a  = definirButtons(liste_c, al);
        
        for (int i = 0; i < grid.getColumns(); i++) {
            bas.add(b_a.get(i));
            
        }

    }

    public ArrayList<Button> definirButtons(Color[] c, ActionListener al){
        ArrayList<Button> l_c = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            Color col = c[i];
            Button b = new Button();
            b.setSize(new Dimension(50,50));
            b.setBackground(col);
            b.setActionCommand(String.valueOf(i));
            l_c.add(b);
            b.addActionListener(al);
        }
        return l_c;

    }
    
}
