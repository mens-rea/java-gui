import javax.swing.*;

public class BasicElements{

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Basic Java GUI");
		JButton myButton = new JButton("Login");
		JTextField myField = new JTextField("Username");
		JTextField myField2 = new JTextField("Password");
		JTextField fieldClear = new JTextField();

		myField.setSize(300, 100);
		myField.setVisible(true);
		myField.setLayout(null);
		myField.setBounds(200, 50, 100, 30);

		myField2.setSize(300, 100);
		myField2.setVisible(true);
		myField2.setLayout(null);
		myField2.setBounds(200, 100, 100, 30);

		myButton.setSize(200, 50);
		myButton.setVisible(true);
		myButton.setLayout(null);
		myButton.setBounds(200, 150, 100, 30);

		myFrame.setLayout(null);
		myFrame.add(myButton);
		myFrame.add(myField);
		myFrame.add(myField2);
		myFrame. setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(500, 300);

		System.out.println("basic java elements");

	}

}