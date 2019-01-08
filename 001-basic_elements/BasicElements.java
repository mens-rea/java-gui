import javax.swing.*;
import java.awt.*;

public class BasicElements{
    
    public static void main(String args[]){

        JFrame myFrame = new JFrame("Basic Java GUI");
    	
        JLabel labelcorpo = new JLabel("LacsaDios©");
        labelcorpo.setBounds(300,200,200,30);
        myFrame.add(labelcorpo);

        JLabel labelusername = new JLabel("Username:");
        labelusername.setBounds(80,70,200,30);
        myFrame.add(labelusername);

        JTextField textf = new JTextField();
        textf.setBounds(150,70, 170, 30);
        myFrame.add(textf);

        JLabel labelpassword = new JLabel("Password:");
        labelpassword.setBounds(80,110,200,30);
        myFrame.add(labelpassword);

        JPasswordField textf1 = new JPasswordField();
        textf1.setBounds(150, 110, 170, 30);
        myFrame.add(textf1);

        JButton myButton = new JButton("Login");
        myButton.setSize(200,50);
        myButton.setBounds(150, 160, 100, 30);
        myFrame.setLayout(null);
        myFrame.add(myButton);
        myFrame.getContentPane().setBackground (Color.pink);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setSize(420, 325);

        System.out.println("basic java elements");
    }

}