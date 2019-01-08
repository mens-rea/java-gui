import javax.swing.*;
import java.awt.Color;
public class BasicElements{
	
	public static void main(String args[]){
		JFrame myFrame = new JFrame("Basic java GUI");
		JButton myButton = new JButton("LOGIN");
		JTextField myTextField = new JTextField("Username");
		JTextField myTextField2 = new JTextField("Password");

		myButton.setBounds(50, 50, 100, 100);
        myButton.setBackground(Color.pink);
		myButton.setSize(75, 50);
		myButton.setVisible(true);

		myTextField.setBounds(130, 50, 100, 100);
		myTextField.setSize(200, 25);
		myTextField.setVisible(true);

		myTextField2.setBounds(130, 75, 100, 100);
		myTextField2.setSize(200, 25);
		myTextField2.setVisible(true);

		myFrame.setLayout(null);

		myFrame.add(myButton);
		myFrame.add(myTextField);
		myFrame.add(myTextField2);

		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(400, 200);

		System.out.println("basic java elements");
	}

}