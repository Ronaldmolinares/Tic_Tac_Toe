package interfaz;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

public class MyFrame extends JFrame{

    private JPanel welcome;
    private ImageIcon icon;

    public MyFrame (){
        initComponents();
		this.setSize(600,380);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
        this.setTitle("Tic Tac Toe");
        icon = new ImageIcon(getClass().getResource("/resources/icono.png"));
		this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setVisible(true);
    }

    public void initComponents(){
    	welcome = new WelcomePanel();
    	//welcome.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
    	this.add(welcome);
    	
    }

    public static void main(String[] args) {
        new MyFrame();
    }


}
