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
    JComboBox comboBox;
    String[] shapes = {"Square", "Circle","Triangle"};
    int shape=0;
    int color=0;

    JLayeredPane layeredPane;
    public void paint(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(50,70, 650, 600);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(10));
        switch(color){
            case 0:
                g2d.setPaint(Color.green);
                break;
            case 1:
                g2d.setPaint(Color.red);
                break;
            case 2:
                g2d.setPaint(Color.blue);
                break;
        }

        int x =200, y=200, size=300;
        switch(shape){
            case 0:
                g2d.fillRect(x,y,size,size);
                break;
            case 1:
                g2d.fillOval(x,y,size,size);
                break;
            case 2:
                int[] xcordi = {x,x + (size / 2), x +size};
                int[] ycordi = {y +size,y,y+size};
                g2d.fillPolygon(xcordi,ycordi,3);
            break;
        }



    }
    MyFrame(){


        comboBox = new JComboBox(shapes);
        comboBox.addActionListener(this);
        comboBox.setBounds(700,80,250,100);
        comboBox.setBackground(Color.white);
        comboBox.setFont(new Font("Comic Sans MS",Font.BOLD,35));

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




        this.add(layeredPane);

        this.add(comboBox);
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
            color=0;
            repaint();
        }
        if(e.getSource() == redButton){
            color=1;
            repaint();
        }
        if(e.getSource() == blueButton){
            color=2;
            repaint();
        }
        if(e.getSource() == comboBox){
            comboBox.getSelectedItem();
        }

        if(e.getSource()==comboBox){
          shape=comboBox.getSelectedIndex();
          repaint();
        }
    }
}
