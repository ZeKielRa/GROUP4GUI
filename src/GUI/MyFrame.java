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
    JPanel trianglePanel;
    JPanel circlePanel;
    JPanel squarePanel;

    JLayeredPane layeredPane;

    MyFrame(){

        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(400,400));

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
        panel.setBackground(Color.black);

        trianglePanel = new JPanel();
        trianglePanel.setBounds(70,70,100,100);
        trianglePanel.add(trianglePanel);
        trianglePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        trianglePanel.setLayout(null);
        trianglePanel.setVisible(true);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1080,720);
        this.setVisible(true);
        this.setTitle("GROUP 4 GUI");
        this.setResizable(false);
        this.add(panel, Integer.valueOf(0));
        layeredPane.add(trianglePanel, Integer.valueOf(1));
        layeredPane.add(circlePanel, Integer.valueOf(1));
        layeredPane.add(squarePanel, Integer.valueOf(1));
        this.add(greenButton);
        this.add(redButton);
        this.add(blueButton);

        this.add(layeredPane);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == greenButton){
            panel.setBackground(Color.green);
        }
        if(e.getSource() == redButton){
            panel.setBackground(Color.red);
        }
        if(e.getSource() == blueButton){
            panel.setBackground(Color.blue);
        }
    }
}
