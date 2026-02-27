package GUI;

// imports to use the java GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// call an inheritance to implement JFrame in this class and implements ActionListener to have actions when buttons are pressed
public class MyFrame extends JFrame implements ActionListener {

    //3 JButtons  for the colors (RGB)
    JButton[] buttons = new JButton[3];
    //JComboBox is the dropdown menu for the shapes
    JComboBox comboBox;
    //shapes variable is the contents inside the JComboBox/dropdown menu
    String[] shapes = {"Square", "Circle","Triangle"};
    //shape variable is the holder of the variable for conditions on shapes JComboBox
    String shape="Square";
    // color variable is the holder of the variable for conditions on colors JButton
    int color=0;

    //Method for the shapes
    public void paint(Graphics g){
        super.paintComponents(g); // syntax for the buttons to show up with the shapes
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(50,55, 600, 600); //this is the outer layer box
        g2d.setColor(Color.black); //this is the color of the outer layer box
        g2d.setStroke(new BasicStroke(10)); //this is the thickness of the outer layer box
        // this is the condition for the color of the shapes to be seen
        switch(color){
            case 0: //for green color
                g2d.setPaint(new Color(0x37E675));
                break;
            case 1: //for red color
                g2d.setPaint(new Color(0xE63737));
                break;
            case 2: //for blue color
                g2d.setPaint(new Color(0x3743E6));
                break;
        }

        // set the coordinates and size on where the shape will be shown
        int x =200, y=200, size=300;
        //this is the condition for the shapes to be seen
        switch(shape){
            case "Square": //for square shape
                g2d.fillRect(x,y,size,size);
                break;
            case "Circle": //for circle shape
                g2d.fillOval(x,y,size,size);
                break;
            case "Triangle": //for triangle shape
                //coordinates for the 3 points of the triangle
                int[] xcordi = {x,x + (size / 2), x +size};
                int[] ycordi = {y +size,y,y+size};
                g2d.fillPolygon(xcordi,ycordi,3);
            break;
        }



    }
    //constructor of the class
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //if user pressed exit button. program will exit/kill
        this.setLayout(null);// set the layout
        this.setSize(1080,720); // set size of the popup panel for GUI
        this.setLocationRelativeTo(null); // move the popup panel in the center when run
        this.setTitle("GROUP 4 GUI"); // title of the popup panel seen in the top-left
        this.setResizable(false); // set popup panel so that it can't be maximized and change the size of it

        // initialize the dropdown menu
        comboBox = new JComboBox(shapes);
        comboBox.addActionListener(this); // to add function
        comboBox.setBounds(700,80,250,100); // set size and coordinates
        comboBox.setFocusable(false); // to remove the dark shade when pressed
        comboBox.setBackground(Color.white); //change the color to white
        comboBox.setFont(new Font("Comic Sans MS",Font.BOLD,35)); // change the font

        //Buttons
        //button[0] is green
        buttons[0] = new JButton();
        buttons[0].setBounds(700,520,250,100); // set size and coordinates
        buttons[0].setBackground(new Color(0x37E675)); // set the color of the button to green
        buttons[0].addActionListener(this); // to add function
        buttons[0].setBorder(BorderFactory.createLineBorder(Color.black)); // add black border for the button

        //button[1] is red
        buttons[1] = new JButton();
        buttons[1].setBounds(700,400,250,100); // set size and coordinates
        buttons[1].setBackground(new Color(0xE63737)); // set the color of the button to red
        buttons[1].addActionListener(this); // to add function
        buttons[1].setBorder(BorderFactory.createLineBorder(Color.black)); // add black border for the button

        //button[2] is blue
        buttons[2] = new JButton();
        buttons[2].setBounds(700,280,250,100); // set size and coordinates
        buttons[2].setBackground(new Color(0x3743E6)); // set the color of the button to blue
        buttons[2].addActionListener(this); // to add function
        buttons[2].setBorder(BorderFactory.createLineBorder(Color.black)); // add black border for the button

        //add the buttons and dropdown menu in the panel so it will be visible
        this.add(comboBox);
        this.add(buttons[0]);
        this.add(buttons[1]);
        this.add(buttons[2]);

        // to see the GUI panel
        this.setVisible(true);

    }

    //method for the function of the buttons and droppdown menu
    public void actionPerformed(ActionEvent e){
        // function of the green button
        if(e.getSource() == buttons[0]){
            color=0; //color = 0 is green
           repaint(); //repaint is to update the GUI panel
        }
        // function of the red button
        if(e.getSource() == buttons[1]){
            color=1; //color = 1 is red
            repaint(); //repaint is to update the GUI panel
        }
        // function of the blue button
        if(e.getSource() == buttons[2]) {
            color = 2; //color = 2 is blue
            repaint(); //repaint is to update the GUI panel
        }
        // function of the dropdown menu
        if(e.getSource()==comboBox){
          shape = comboBox.getSelectedItem().toString(); // when use select "Triangle" the value of shape will change into "Triangle"
          repaint(); //repaint is to update the GUI panel
        }
    }
}

