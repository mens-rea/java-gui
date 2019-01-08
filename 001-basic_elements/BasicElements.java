import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class BasicElements 
{
		public static void main(String[]args)
		{
			JFrame frame = new JFrame("SIMPLE GUI");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setSize(700, 400);
		 //================FRAME^=================================//
			
			//=============BUTTON==================================//
			JButton button = new JButton("Login");
			button.setVisible(true);
			button.setSize(200,25);
			button.setText("Login");
			frame.add(button);
			frame.setLayout(new FlowLayout());
			
			JLabel label = new JLabel();
			label.setVisible(true);
			label.setLayout(null);
			label.setBounds(200,100,100,30);
			label.setSize(200,50);
			label.setText("Username");
			frame.add(label);
			
			//=======================================================
			JTextField text = new JTextField();
			text.setText("Username");
			
			text.setBounds(100,50,100, 100);
			text.setVisible(true);
			text.setLayout(null);
			text.setSize(200, 2);
			frame.add(text);

			JLabel label2 = new JLabel();
			label2.setVisible(true);
			text.setLayout(null);
			label2.setBounds(200,150,100,30);
			label2.setSize(200, 50);
			label2.setText("Password");
			
			frame.add(label2);
			//=============================================================//
			JTextField text2 = new JTextField();
			text2.setText("Password");
			text2.setBounds(200,150,100, 30);
			text2.setVisible(true);
			text2.setSize(400, 100);
			frame.add(text2);
		    
			
			
		
		}
		

}
