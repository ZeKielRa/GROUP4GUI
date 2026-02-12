package GUII;
import javax.swing.*;
public class main {

    public static void main(String[] args) {

        JButton greenButton = new JButton();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,1080,720);


        JFrame frame = new JFrame("GROUP 4 GUI");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080,720);
        frame.setResizable(false);
        frame.setLayout(null);




        frame.setVisible(true);
    }
}
