
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    Modele modl;

    public Controller(Modele m) {
        this.modl = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       
       Button b = (Button) e.getSource();
       System.out.println(b.getActionCommand());
       this.modl.completerRangee(Integer.parseInt(b.getActionCommand()));
    }

    
    
}

