import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SignupPage implements ActionListener{
	JFrame frame = new JFrame();
	JLabel UserID = new JLabel("UserId");
	JLabel Password = new JLabel("Password");
	JButton signUpButton = new JButton("Signup");

	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();

	SignupPage(){


		UserID.setBounds(50,100,75,25);
		Password.setBounds(50,150,75,25);

		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);

		signUpButton.setBounds(125,200,100,25);
		signUpButton.setFocusable(false);
		signUpButton.addActionListener(this);





		frame.add(UserID);
		frame.add(Password);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(signUpButton);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		IDandPasswords idandPasswords = new IDandPasswords();
		if(e.getSource()==signUpButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			idandPasswords.IDandPasswords(userID,password);
			LoginPage loginPage=new LoginPage(idandPasswords.getLogininfo());

		}

	}

}
