package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    JButton[] buttons = new JButton[3];
    JComboBox comboBox;
    String[] shapes = {"Square", "Circle","Triangle"};
    int shape=0;
    int color=0;

    public void paint(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(50,55, 600, 600);
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
        comboBox.setFocusable(false);
        comboBox.setBackground(Color.white);
        comboBox.setFont(new Font("Comic Sans MS",Font.BOLD,35));


        buttons[0] = new JButton();
        buttons[0].setBounds(700,520,250,100);
        buttons[0].setBackground(Color.green);
        buttons[0].addActionListener(this);
        buttons[0].setBorder(BorderFactory.createLineBorder(Color.black));

        buttons[1] = new JButton();
        buttons[1].setBounds(700,400,250,100);
        buttons[1].setBackground(Color.red);
        buttons[1].addActionListener(this);
        buttons[1].setBorder(BorderFactory.createLineBorder(Color.black));

        buttons[2] = new JButton();
        buttons[2].setBounds(700,280,250,100);
        buttons[2].setBackground(Color.blue);
        buttons[2].addActionListener(this);
        buttons[2].setBorder(BorderFactory.createLineBorder(Color.black));


        this.add(comboBox);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1080,720);
        this.setLocationRelativeTo(null);
        this.setTitle("GROUP 4 GUI");
        this.setResizable(false);
        this.add(buttons[0]);
        this.add(buttons[1]);
        this.add(buttons[2]);

        this.setVisible(true);

    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttons[0]){
            color=0;
           repaint();
        }
        if(e.getSource() == buttons[1]){
            color=1;
            repaint();
        }
        if(e.getSource() == buttons[2]){
            color=2;
            repaint();
        }
        if(e.getSource()==comboBox){
          shape=comboBox.getSelectedIndex();
          repaint();
        }
    }
}
