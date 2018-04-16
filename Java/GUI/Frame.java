package guı;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame {

    public static void main(String[] args) {

        JFrame a = new JFrame("Frame Deneme");

        a.pack();
        a.setVisible(true);
        a.setSize(700, 700); // en boy olarak pixel cinsinden istenilen boyutlar yazılır.
        a.setLocationRelativeTo(null);  // pencere ekranda nerede görülecek. null denirse ortalar
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X ( çıkış ) bastığınızda kapanmasını sağlar
        a.setLayout(new BorderLayout()); // istenilen layoutun frame için seçilmesini sağlar.
    
        JLabel label = new JLabel("Merhaba ben bir JLabel'im"); // "Merhaba ben bir JLabel'im" yazısını içeren bir label oluştuyuyoruz.
        a.add(label); // oluşturduğumuz frame üzerine labeli ekliyoruz
    }

}
