import javax.swing.*;

public class BasicElements{
	
	public static void main(String args[]){
		JFrame myFrame = new JFrame("Login");

		JLabel txtUser = new JLabel ("Username");
		myFrame.add(txtUser);
		txtUser.setSize(150, 50);
		txtUser.setLocation(150, 90);

		JLabel txtPassword = new JLabel ("Password");
		myFrame.add(txtPassword);
		txtPassword.setSize(150, 50);
		txtPassword.setLocation(150, 130);

		JTextField txtUsername = new JTextField();
		myFrame.add(txtUsername);
		txtUsername.setSize(150, 25);
		txtUsername.setLocation(250, 100);

		JPasswordField txtPass = new JPasswordField();
		myFrame.add(txtPass);
		txtPass.setSize(150, 25);
		txtPass.setLocation(250, 140);

		JButton myButton = new JButton("Login");
		myFrame.add(myButton);
		myButton.setSize(150, 50);
		myButton.setLocation(250, 175);

		myFrame.setLayout(null);
		myFrame.setSize(600, 350);
		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}	
}