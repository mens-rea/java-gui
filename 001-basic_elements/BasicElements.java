import javax.swing.*;
import java.awt.FlowLayout;

public class BasicElements{

	static JTextField username, password;

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Log In");
		myFrame.getContentPane().setLayout(new FlowLayout());

		
	    JLabel userlabel = new JLabel("Please enter your username and password");
	    userlabel.setBounds(26, 41, 89, 22);
	    myFrame.getContentPane().add(userlabel);

		username = new JTextField("username",30);
		username.setBounds(200, 110, 150, 500);


		password = new JTextField("password",30);
		password.setBounds(200, 110, 150, 500);


		myFrame.getContentPane().add(username);
		myFrame.getContentPane().add(password);

		
		JButton logIn= new JButton("Login");
		logIn.setSize(200,50);
		logIn.setBounds(267, 124, 136, 43);

		JButton exit= new JButton("Exit");
		exit.setSize(210,50);
		exit.setBounds(267, 178, 136, 43);

		myFrame.getContentPane().add(logIn);
		myFrame.getContentPane().add(exit);
		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(400, 200);

	}

}