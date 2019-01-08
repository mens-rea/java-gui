import javax.swing.*;
import java.awt.FlowLayout;

public class BasicElements{

    static JTextField text1, text2;
    
    public static void main(String args[]){

        JFrame myFrame = new JFrame("Basic Java GUI");
        myFrame.getContentPane().setLayout(new FlowLayout());

        text1 = new JTextField("Username",10);
        text2 = new JPasswordField("",10);
        myFrame.getContentPane().add(text1);
        myFrame.getContentPane().add(text2);

        JButton myButton1 = new JButton("Login");
        myButton1.setSize(200,50);
        myButton1.setBounds(300, 300, 120, 28);
        JButton myButton2 = new JButton("Exit");
        myButton2.setBounds(450, 300, 120, 28);

        myFrame.add(myButton1);
        myFrame.add(myButton2);

        myFrame.pack();
        myFrame.setLayout(null);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setSize(400, 100);

        System.out.println("basic java elements");
    }

}
        