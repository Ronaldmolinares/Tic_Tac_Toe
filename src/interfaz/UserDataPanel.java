package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UserDataPanel extends JPanel{

	public UserDataPanel () {
		initComponents();
		this.setVisible(true);
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(40, 60, 40, 60),
				BorderFactory.createLineBorder(Color.BLACK, 1)
				));
	}

	private void initComponents() {
		panelMessage();
		form();
		buttons();
	}

	public void panelMessage() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel etiqueta = new JLabel("Model");
		etiqueta.setFont(new Font("Consolas",Font.BOLD, 15));
		etiqueta.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(10, 60, 0, 60),
				BorderFactory.createLineBorder(Color.BLACK, 0)
				));
		etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
		etiqueta.setAlignmentY(Component.CENTER_ALIGNMENT);

		JLabel etiqueta1 = new JLabel("Register Player");
		etiqueta1.setFont(new Font("Consolas",Font.BOLD, 15));
		etiqueta1.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(0, 60, 10, 60),
				BorderFactory.createLineBorder(Color.BLACK, 0)
				));
		etiqueta1.setAlignmentX(Component.CENTER_ALIGNMENT);
		etiqueta1.setAlignmentY(Component.CENTER_ALIGNMENT);

		add(etiqueta);
		add(etiqueta1);

		JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
		separator.setForeground(Color.BLACK);
		separator.setPreferredSize(new Dimension(200, 1));
		add(separator);

	}
	
	public void form() {
	    JLabel nickNameLabel = new JLabel("NickName:");
	    JTextField nickNameField = new JTextField(30); 
	    nickNameField.setMaximumSize(nickNameField.getPreferredSize()); 
	    nickNameField.setHorizontalAlignment(JTextField.LEFT);
		    
	    JLabel figureLabel = new JLabel("Choose a Figure:");
	    JTextField figureField = new JTextField(30);
	    figureField.setMaximumSize(figureField.getPreferredSize());
	    figureField.setHorizontalAlignment(JTextField.LEFT);
		    
	    JPanel panel = new JPanel();
	    panel.setLayout(new FlowLayout()); 
	    panel.setBackground(Color.orange);
	    panel.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 60)); 
	    panel.add(nickNameLabel);
	    panel.add(nickNameField);
	    panel.add(Box.createVerticalStrut(10)); 
	    panel.add(figureLabel);
	    panel.add(figureField);
	    panel.add(Box.createVerticalStrut(10)); 
	    panel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    panel.setAlignmentY(Component.CENTER_ALIGNMENT);

	    add(panel);
	}
	
	public void buttons() {
	    JButton continueButton = new JButton("Continue");
	    JButton backButton = new JButton("Back");

	    JPanel buttonPanel = new JPanel();
	    buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
	    buttonPanel.setBackground(Color.WHITE);
	    buttonPanel.add(Box.createHorizontalGlue());
	    buttonPanel.add(backButton);
	    buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
	    buttonPanel.add(continueButton);
	    buttonPanel.add(Box.createHorizontalGlue());

	    JPanel mainPanel = new JPanel();
	    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	    mainPanel.setBackground(Color.WHITE);
	    mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 60));
	    mainPanel.add(buttonPanel);
	    mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    mainPanel.setAlignmentY(Component.CENTER_ALIGNMENT);

	    add(mainPanel);
		
	}

}
