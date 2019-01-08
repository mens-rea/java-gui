import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicElements{
	
	public static void main(String args[]){
		JFrame myFrame = new JFrame("Basic Java GUI");
		JButton myButton = new JButton("Login");
		JButton ExitButton = new JButton("Exit");
		JButton Clear = new JButton("Clear");
		JTextField UsernameTextField = new JTextField();
		JTextField PasswordTextField = new JTextField();
		JLabel UsernameLabel = new JLabel("Username:");
		JLabel PasswordLabel = new JLabel("Password:");
		
		myFrame.setVisible(true);
		myFrame.setSize(500, 200);
		myFrame.setLayout(null);
		
		myFrame.add(myButton);
		myFrame.add(ExitButton);
		myFrame.add(UsernameTextField);
		myFrame.add(PasswordTextField);
		myFrame.add(UsernameLabel);
		myFrame.add(PasswordLabel);
		myFrame.add(Clear);

		myButton.setVisible(true);
		myButton.setSize(20,5);
		myButton.setBounds(150, 100 , 80 , 20);

		ExitButton.setSize(20,5);
		ExitButton.setBounds(269, 100 , 80 , 20);

		Clear.setSize(20,5);
		Clear.setBounds(70, 100 , 80 , 20);
		
		UsernameLabel.setBounds(73,34, 20, 60);
		UsernameLabel.setSize(200, 50);

		PasswordLabel.setBounds(73,54, 20, 60);
		PasswordLabel.setSize(200, 50);

		UsernameTextField.setBounds(150,50, 20, 30);
		UsernameTextField.setSize(200, 20);

		PasswordTextField.setBounds(150,70, 20, 30);
		PasswordTextField.setSize(200, 20);

		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				UsernameTextField.setText("");
				PasswordTextField.setText("");
			}

		});

		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}

		});

		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		System.out.println("basic java elements");
	}

}