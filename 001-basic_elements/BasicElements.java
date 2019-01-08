import javax.swing.*;

public class BasicElements{

	
	public static void main(String args[]){
		JFrame myFrame = new JFrame("Basic Java GUI");

		JLabel user = new JLabel("Username:");
		user.setBounds(125, 50, 255, 40);
		
		JLabel pass = new JLabel("Password:");
		pass.setBounds(125, 95, 255, 40);

		JTextField myUser = new JTextField();
		myUser.setBounds(200, 50, 280, 40);

		JPasswordField myPass = new JPasswordField();
		myPass.setBounds(200, 95, 280, 40);

		JButton myButton1 = new JButton("Login");
		myButton1.setBounds(200, 150, 130, 50);

		JButton myButton2 = new JButton("Exit");
		myButton2.setBounds(350,150, 130, 50);

		myFrame.setLayout(null);

		myFrame.add(user);
		myFrame.add(pass);
		myFrame.add(myUser);
		myFrame.add(myPass);
		myFrame.add(myButton1);
		myFrame.add(myButton2);

		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(650, 400);

		System.out.println("basic java elements");
	}

}