
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class WelcomePage implements ActionListener {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
	JButton logoutButton = new JButton("Logout");
	
	WelcomePage(String userID){
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Hello "+userID);
		
		logoutButton.setBounds(125,200,100,25);
		logoutButton.setFocusable(false);
		logoutButton.addActionListener(this);
		
		
		frame.add(welcomeLabel);
		frame.add(logoutButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		IDandPasswords idandPasswords = new IDandPasswords();
		if(e.getSource()==logoutButton) {
			frame.dispose(); 
			LoginPage loginPage=new LoginPage(idandPasswords.getLogininfo());  
		
			 
			
			
		}
		
	}
	
}