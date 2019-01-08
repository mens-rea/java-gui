import javax.swing.*;
import java.awt.*;
public class BasicElements{
	
	public static void main(String args[]){
		JFrame myFrame = new JFrame("Basic Java GUI");
		JButton myButton = new JButton("Login");
		JButton myButton1 = new JButton("Sign up");
		JLabel mytext = new JLabel ();
		JLabel mytext1 = new JLabel ();
		JLabel mytext2 = new JLabel ();
		JTextField myUser = new JTextField();
		JPasswordField myPass = new JPasswordField();

		myFrame.getContentPane().setBackground (Color.orange);
		myFrame.add(myButton);
		myButton.setSize(100,50);
		myButton.setLocation(455, 300);

		myFrame.add(myButton1);
		myButton1.setSize(100,50);
		myButton1.setLocation(350, 300);

		myFrame.add(mytext);
		mytext.setText("Username");
		mytext.setVisible(true);
		mytext.setBounds(255, 200, 200, 25);

		myFrame.add(mytext1);
		mytext1.setText("Password");
		mytext1.setVisible(true);
		mytext1.setBounds(255, 250, 200, 25);

		myFrame.add(myUser);
		myUser.setSize(360,30);
		myUser.setBounds(350, 200, 200, 25);
		

		myFrame.add(myPass);
		myPass.setSize(360,30);
		myPass.setBounds(350, 250, 200, 25);



		myFrame.setLayout(null);

		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(900, 600);
		myFrame.setResizable(false);


		System.out.println("basic java elements");
	}

}