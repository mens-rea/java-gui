import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BasicElements{
	
	public static void main(String args[]){
		JFrame myFrame = new JFrame("Basic Java GUI");
		JButton myButton = new JButton("Login");
		JLabel myUsername = new JLabel("Username:");
		JLabel myPassword = new JLabel("Password:");
		JTextField user = new JTextField(15);
		JTextField pword = new JTextField(15);

		myButton.setSize(200,50);
		myUsername.setSize(200,50);
		myPassword.setSize(200,50);


		myFrame.setLayout(null);
		myButton.setLayout(null);
		myUsername.setLayout(null);
		myPassword.setLayout(null);

		myFrame.add(myButton);
		myFrame.add(myUsername);
		myFrame.add(myPassword);
		myFrame.add(user);
		myFrame.add(pword);

		
 		myUsername.setBounds(80, 70, 200, 30);
  		myPassword.setBounds(80, 110, 200, 30);
  		myButton.setBounds(150, 160, 100, 30);
  		pword.setBounds(150, 110, 200, 30);
  		user.setBounds(150, 70, 200, 30);
 
		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(400, 400);



		System.out.println("basic java elements");
	}

}
