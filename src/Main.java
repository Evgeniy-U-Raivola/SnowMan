import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame start=new JFrame();
        start.add(new Design());
        start.setBounds(200,50,600,600);
        start.setBackground(Color.WHITE);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setResizable(true);
        start.setLocationRelativeTo(null); // Теперь окно помещено в центр.
        start.setVisible(true);


    }
}