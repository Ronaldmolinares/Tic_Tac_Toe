package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class WelcomePanel extends JPanel implements ActionListener{

	public WelcomePanel() {
		initComponents();
		this.setVisible(true);
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,1));
	}

	private void initComponents() {
		textMessage();
		startGame();
		showHistory();
	}

	public void textMessage() {
		JLabel welcomeLabel = new JLabel("¡Bienvenido!", SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Arial", Font.BOLD,34));
		welcomeLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
		add(welcomeLabel);
	}

	private void startGame() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

	    JButton playButton = new JButton("Play");
	    playButton.setPreferredSize(new Dimension(140, 32));
	    playButton.setFont(new Font("Arial", Font.BOLD, 20));
	    playButton.setBackground(new Color(245, 163, 27));
	    playButton.setBorder(BorderFactory.createLineBorder(Color.white, 0));
	    
	    panel.add(playButton);
	    panel.setOpaque(false);
	    add(panel, BorderLayout.CENTER);
	}

	private void showHistory() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
	    JButton historyButton = new JButton("Show History");
	    historyButton.setPreferredSize(new Dimension(140, 32));
	    historyButton.setFont(new Font("Arial", Font.BOLD, 20));
	    historyButton.setBackground(new Color(245, 163, 27));
	    historyButton.setBorder(BorderFactory.createLineBorder(Color.white, 0));
	    
	    panel.add(historyButton);
	    panel.setOpaque(false);
	    add(panel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}