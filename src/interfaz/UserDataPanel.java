package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class UserDataPanel extends JPanel{
	
	public UserDataPanel () {
		initComponents();
		this.setVisible(true);
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,1));
	}

	private void initComponents() {
		
		
	}
}
