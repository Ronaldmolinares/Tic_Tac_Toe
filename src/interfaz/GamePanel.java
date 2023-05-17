package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;

public class GamePanel extends JPanel{

	public GamePanel() {
		initComponents();
		this.setVisible(true);
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(20, 40, 50, 40),
				BorderFactory.createLineBorder(Color.BLACK, 0)
				));
	}

	public void initComponents() {
		tabbeds();
	}

	public void tabbeds() {
		setLayout(new BorderLayout());

		JLabel messageLabel = new JLabel("The player user is playing with the machine. It is the user turn");
		messageLabel.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(20, 0, 30, 20),
				BorderFactory.createLineBorder(Color.BLACK, 0)
				));
		messageLabel.setFont(new Font("Arial Rounded MT",Font.BOLD, 16));

		add(messageLabel, BorderLayout.NORTH);
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setFont(new Font("Arial Rounded MT",Font.BOLD, 12));

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		tabbedPane.addTab("Tab 1", panel1);
		tabbedPane.addTab("Tab 2", panel2);
		tabbedPane.addTab("Tab 3", panel3);

		add(tabbedPane, BorderLayout.CENTER);

	}

}
