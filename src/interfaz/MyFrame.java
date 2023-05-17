package interfaz;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	private JPanel welcome;
	private JPanel userData;
	private JPanel game;
	private ImageIcon icon;

	public MyFrame (){
		initComponents();
		this.setSize(800,580);
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
		this.add(welcome);

//		userData = new UserDataPanel();
//		this.add(userData);

//		game = new GamePanel();
//		this.add(game);

	}

	public static void main(String[] args) {
		new MyFrame();
	}


}
