import javax.swing.*;
import java.awt.*;

public class BasicElements extends JFrame{
	
	public static void main(String args[]){
		JFrame myFrame = new JFrame("GUI Login Interface");
		JButton myButton = new JButton("Login");
		JTextField username = new JTextField("Username: ");
		JTextField password = new JTextField("Password: ");
		
		myButton.setBounds(100,130,100,40);
		myButton.setSize(199,50);
		
		myFrame.add(myButton);
		myFrame.add(username);
		myFrame.add(password);
		myFrame.setLayout(null);

		username.setBounds(100,10,100,40);
		username.setSize(200, 50);
		username.setVisible(true);

		password.setBounds(100,65,100,40);
		password.setSize(200, 50);
		password.setVisible(true);

		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(415, 250);

		System.out.println("basic java elements");

	}

}