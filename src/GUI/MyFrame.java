package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    JButton[] buttons = new JButton[4];
    JComboBox comboBox;
    String[] shapes = {"Square", "Circle","Triangle"};
    String shape="Square";
    int color=0;

    public void paint(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(50,55, 600, 600);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(10));
        switch(color){
            case 0:
                g2d.setPaint(new Color(0x37E675));
                break;
            case 1:
                g2d.setPaint(new Color(0xE63737));
                break;
            case 2:
                g2d.setPaint(new Color(0x3743E6));
                break;
            case 3:
                g2d.setPaint(new Color(0xFF85D1));
                break;
        }

        int x =200, y=200, size=300;
        switch(shape){
            case "Square":
                g2d.fillRect(x,y,size,size);
                break;
            case "Circle":
                g2d.fillOval(x,y,size,size);
                break;
            case "Triangle":
                int[] xcordi = {x,x + (size / 2), x +size};
                int[] ycordi = {y +size,y,y+size};
                g2d.fillPolygon(xcordi,ycordi,3);
            break;
        }



    }
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1080,720);
        this.setLocationRelativeTo(null);
        this.setTitle("GROUP 4 GUI");
        this.setResizable(false);

        comboBox = new JComboBox(shapes);
        comboBox.addActionListener(this);
        comboBox.setBounds(700,80,250,100);
        comboBox.setFocusable(false);
        comboBox.setBackground(Color.white);
        comboBox.setFont(new Font("Comic Sans MS",Font.BOLD,35));


        buttons[0] = new JButton();
        buttons[0].setBounds(700,520,250,100);
        buttons[0].setBackground(new Color(0x37E675));
        buttons[0].addActionListener(this);
        buttons[0].setBorder(BorderFactory.createLineBorder(Color.black));

        buttons[1] = new JButton();
        buttons[1].setBounds(700,400,250,100);
        buttons[1].setBackground(new Color(0xE63737));
        buttons[1].addActionListener(this);
        buttons[1].setBorder(BorderFactory.createLineBorder(Color.black));

        buttons[2] = new JButton();
        buttons[2].setBounds(700,280,250,100);
        buttons[2].setBackground(new Color(0x3743E6));
        buttons[2].addActionListener(this);
        buttons[2].setBorder(BorderFactory.createLineBorder(Color.black));

        buttons[3] = new JButton();
        buttons[3].setBounds(700,640,250,100);
        buttons[3].setBackground(new Color(0xFF85D1));
        buttons[3].addActionListener(this);
        buttons[3].setBorder(BorderFactory.createLineBorder(Color.black));


        this.add(comboBox);
        this.add(buttons[0]);
        this.add(buttons[1]);
        this.add(buttons[2]);
        this.add(buttons[3]);

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
        if(e.getSource() == buttons[2]) {
            color = 2;
            repaint();
        }
        if(e.getSource() == buttons[3]){
            color=3;
            repaint();
        }

        if(e.getSource()==comboBox){
          shape = comboBox.getSelectedItem().toString();
          repaint();
        }
    }
}

