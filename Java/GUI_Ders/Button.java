package guı;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame implements ActionListener { // Java'da her şey bir objedir. 
                                                               // Ve bunlar birbirine üst class'a doğru extend edilebilir.

    private int sayac = 0;

    public Button() {
        JButton button = new JButton("Ben Bir JButton'm");
        button.addActionListener(this);
        add(button); //JFrame extend edildiği için add fonksiyonunu direkt kullanabiliriz.

    }

     /*
    Butondaki olayları ActionEvent sınıfı ile yönetiyor ,
    dinleme işini ise ActionListener arayüzü(interface) ile dinliyoruz.
     */
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        sayac++;
        System.out.println("Butona " + sayac + " kez Basıldı.");

    }

    public static void main(String[] args) {
        Button btn = new Button();
        btn.pack(); // içerisinde barındırdığı obje kadar genişlik ve yüksekliğinin ayarlanmasını sağlar.
        btn.setLocationRelativeTo(null);
        btn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.setVisible(true);
    }

   
}
