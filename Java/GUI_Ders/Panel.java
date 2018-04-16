package guı;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame {

    private JPanel panel = new JPanel() ;

    public Panel() {

        /*
        JFrame'in üzerine panel ekliyoruz.
        */
        
        super("Panel");
        add(panel, BorderLayout.CENTER);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] arg) {

        new Panel();

    }

}
