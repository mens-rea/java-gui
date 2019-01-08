import javax.swing.*;

public class BasicElements{
	
	public static void main(String args[]){
		JFrame myFrame = new JFrame("Basic Java GUI");
	
		//Username Box
		JLabel labelusername = new JLabel("Username:");
		labelusername.setBounds(80,70,200,30);
		myFrame.add(labelusername);

		//textfield
		JTextField textf = new JTextField();
		textf.setBounds(150,70, 170, 30);
		myFrame.add(textf);

		//Password
		JLabel labelpassword = new JLabel("Password:");
		labelpassword.setBounds(80,110,200,30);
		myFrame.add(labelpassword);

		//textfield
		JPasswordField textf1 = new JPasswordField();
		textf1.setBounds(150, 110, 170, 30);
		myFrame.add(textf1);

		//Login Button
		JButton myButton = new JButton("Login");
		myButton.setSize(200,50);
		myButton.setBounds(150, 160, 100, 30);
		myFrame.setLayout(null);
		myFrame.add(myButton);

		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(420, 325);

		System.out.println("basic java elements");
	}

}