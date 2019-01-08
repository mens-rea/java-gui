import javax.swing.*;

public class BasicElements{

	public static void main (String[] args){
		JFrame myFrame = new JFrame("Basic java Gui");
		JButton myButton = new JButton("Login");
		JTextField myTextField = new JTextField("Username");
		JTextField myTextField2 = new JTextField("Password");



		myTextField.setBounds(150, 50, 150, 30);
		myTextField.setVisible(true);
		myTextField.setLayout(null);

		myTextField2.setBounds(150, 100, 150, 30);
		myTextField2.setVisible(true);
		myTextField2.setLayout(null);
		
		myButton.setBounds(150, 150, 150, 50);

		myFrame.setLayout(null);
		myFrame.add(myButton);
		myFrame.add(myTextField);
		myFrame.add(myTextField2);
		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(500, 300);

		System.out.println("basic java elements");

	}
}