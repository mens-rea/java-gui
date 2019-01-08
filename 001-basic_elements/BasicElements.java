import javax.swing.*;
import java.awt.*;

public class BasicElements{

	
	public static void main(String args[]){
		JFrame myFrame = new JFrame();
		JButton myButton = new JButton("Login");
		JTextField myTextField = new JTextField();
		JPasswordField myPassword = new JPasswordField();
		JLabel myLabel = new JLabel();
		JLabel myLabel1 = new JLabel();

		myFrame.getContentPane().setBackground( Color.pink );
		myFrame.setLayout(null);
		myFrame.add(myButton);
		myFrame.add(myLabel);
		myFrame.add(myLabel1);
		myFrame.add(myTextField);
		myFrame.add(myPassword);

		myButton.setSize(200, 50);
		myButton.setLocation(350, 280);
  
		myTextField.setSize(250, 40);
		myTextField.setLocation(350, 160);

		myPassword.setSize(250, 40);
		myPassword.setLocation(350, 210);

		myLabel.setSize(500, 100);
		myLabel.setText("USERNAME:");
		myLabel.setVisible(true);
		myLabel.setLocation(270, 130);

		myLabel1.setSize(650, 200);
		myLabel1.setLocation(270, 130);
		myLabel1.setText("PASSWORD:");
		myLabel1.setVisible(true);

		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(900, 600);
		myFrame.setResizable(false);

		System.out.println("basic java elements");
	}

}