import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicElements{
	
	public static void main(String args[]){
		JFrame frame = new JFrame("Login");

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
      

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);
        panel.setBackground(Color.blue);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(100, 60, 80, 25);
        userLabel.setForeground(Color.white);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(200, 60, 160, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(100, 110, 80, 25);
        passwordLabel.setForeground(Color.white);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(200, 110, 160, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(280, 180, 80, 25);
        panel.add(loginButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(100, 180, 80, 25);
        panel.add(clearButton);

        clearButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	userText.setText("");
            	passwordText.setText("");
        	}
        }); 
    }
}