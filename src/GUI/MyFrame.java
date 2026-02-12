package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton greenButton;
    JButton redButton;
    JButton blueButton;
    JPanel panel;
    JPanel panel2;
    JPanel trianglePanel;
    JPanel circlePanel;
    JPanel squarePanel;

    JLayeredPane layeredPane;

    MyFrame(){

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,1080, 720);

        greenButton = new JButton();
        greenButton.setBounds(700,520,250,100);
        greenButton.setBackground(Color.green);
        greenButton.addActionListener(this);
        greenButton.setBorder(BorderFactory.createLineBorder(Color.black));

        redButton = new JButton();
        redButton.setBounds(700,400,250,100);
        redButton.setBackground(Color.red);
        redButton.addActionListener(this);
        redButton.setBorder(BorderFactory.createLineBorder(Color.black));

        blueButton = new JButton();
        blueButton.setBounds(700,280,250,100);
        blueButton.setBackground(Color.blue);
        blueButton.addActionListener(this);
        blueButton.setBorder(BorderFactory.createLineBorder(Color.black));

        panel = new JPanel();
        panel.setBounds(20,50,650,600);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));


        panel2 = new JPanel();
        panel2.setBounds(170,200,300,300);
        panel2.setLayout(null);
        panel2.setBackground(Color.green);

        layeredPane.add(panel2, Integer.valueOf(1));
        layeredPane.add(panel, Integer.valueOf(0));



        this.add(layeredPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1080,720);
        this.setVisible(true);
        this.setTitle("GROUP 4 GUI");
        this.setResizable(false);
        this.add(greenButton);
        this.add(redButton);
        this.add(blueButton);

        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == greenButton){
            panel2.setBackground(Color.green);
        }
        if(e.getSource() == redButton){
            panel2.setBackground(Color.red);
        }
        if(e.getSource() == blueButton){
            panel2.setBackground(Color.blue);
        }
    }
}
