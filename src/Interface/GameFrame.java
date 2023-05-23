package Interface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import model.Games;
import model.STATUS;

public class GameFrame extends javax.swing.JFrame {
	private JPanel panel;
	private JLabel jLabel;
	private Games infoP = new Games();

	private int board[][] = new int[3][3];
	private int win = -1;
	String figurePerson = ""; 
	String figurePC = "";

	//REVISAR 
	public GameFrame(Games infoPlayer) {
	    infoP = infoPlayer;
	    figurePerson = infoP.getFigure();
	    figurePC = (figurePerson.equals("X")) ? "O" : "X";
	    if (figurePerson.equals(figurePC)) {
	        figurePC = (figurePerson.equals("X")) ? "O" : "X";
	    }
	    initComponents();
	    this.getContentPane().setBackground(Color.WHITE);
	    ImageIcon icon = new ImageIcon(getClass().getResource("/resources/icono.png"));
	    this.setIconImage(icon.getImage());
	    initGame();
	    window();
	}

	public void turn() {
		if (!(boardFull() || combinations() != -1)) {
			int prim = 0;
			int prim2 = 0;
			int min1 = Integer.MIN_VALUE;
			int to;

			if (board[0][0] == -1) {
				board[0][0] = 1;
				to = min();
				if (to > min1) {
					min1 = to;
					prim = 0;
					prim2 = 0;
				}
				board[0][0] = -1;
			}
			if (board[0][1] == -1) {
				board[0][1] = 1;
				to = min();
				if (to > min1) {
					min1 = to;
					prim = 0;
					prim2 = 1;
				}
				board[0][1] = -1;
			}
			if (board[0][2] == -1) {
				board[0][2] = 1;
				to = min();
				if (to > min1) {
					min1 = to;
					prim = 0;
					prim2 = 2;
				}
				board[0][2] = -1;
			}
			if (board[1][0] == -1) {
				board[1][0] = 1;
				to = min();
				if (to > min1) {
					min1 = to;
					prim = 1;
					prim2 = 0;
				}
				board[1][0] = -1;
			}
			if (board[1][1] == -1) {
				board[1][1] = 1;
				to = min();
				if (to > min1) {
					min1 = to;
					prim = 1;
					prim2 = 1;
				}
				board[1][1] = -1;
			}
			if (board[1][2] == -1) {
				board[1][2] = 1;
				to = min();
				if (to > min1) {
					min1 = to;
					prim = 1;
					prim2 = 2;
				}
				board[1][2] = -1;
			}
			if (board[2][0] == -1) {
				board[2][0] = 1;
				to = min();
				if (to > min1) {
					min1 = to;
					prim = 2;
					prim2 = 0;
				}
				board[2][0] = -1;
			}
			if (board[2][1] == -1) {
				board[2][1] = 1;
				to = min();
				if (to > min1) {
					min1 = to;
					prim = 2;
					prim2 = 1;
				}
				board[2][1] = -1;
			}
			if (board[2][2] == -1) {
				board[2][2] = 1;
				to = min();
				if (to > min1) {
					min1 = to;
					prim = 2;
					prim2 = 2;
				}
				board[2][2] = -1;
			}

			board[prim][prim2] = 1;
		}
		win = combinations();
	}

	private boolean boardFull() {
		if (board[0][0] == -1) {
			return false;
		}
		if (board[0][1] == -1) {
			return false;
		}
		if (board[0][2] == -1) {
			return false;
		}
		if (board[1][0] == -1) {
			return false;
		}
		if (board[1][1] == -1) {
			return false;
		}
		if (board[1][2] == -1) {
			return false;
		}
		if (board[2][0] == -1) {
			return false;
		}
		if (board[2][1] == -1) {
			return false;
		}
		if (board[2][2] == -1) {
			return false;
		}
		return true;
	}

	public void initGame() {
		board[0][0] = -1;
		board[0][1] = -1;
		board[0][2] = -1;
		board[1][0] = -1;
		board[1][1] = -1;
		board[1][2] = -1;
		board[2][0] = -1;
		board[2][1] = -1;
		board[2][2] = -1;
		win = -1;
	}

	private int combinations() {
		if (board[0][0] != -1 && board[0][0] == board[0][1] && board[0][0] == board[0][2]) {
			return board[0][0];
		}
		if (board[1][0] != -1 && board[1][0] == board[1][1] && board[1][0] == board[1][2]) {
			return board[1][0];
		}
		if (board[2][0] != -1 && board[2][0] == board[2][1] && board[2][0] == board[2][2]) {
			return board[2][0];
		}
		if (board[0][0] != -1 && board[0][0] == board[1][0] && board[0][0] == board[2][0]) {
			return board[0][0];
		}
		if (board[0][1] != -1 && board[0][1] == board[1][1] && board[0][1] == board[2][1]) {
			return board[0][1];
		}
		if (board[0][2] != -1 && board[0][2] == board[1][2] && board[0][2] == board[2][2]) {
			return board[0][2];
		}
		if (board[0][0] != -1 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			return board[0][0];
		}
		if (board[0][2] != -1 && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
			return board[0][2];
		}
		return -1;
	}

	public void execute(int p, int q) {
		if (board[p][q] == -1) {
			if (win == -1) {
				board[p][q] = 0;
				win = combinations();
				turn();
			}
		}
	}

	private int min() {
		if (boardFull() || combinations() != -1) {
			if (combinations() != -1) {
				return 1;
			} else {
				return 0;
			}
		}
		int max1 = Integer.MAX_VALUE;
		int to;
		if (board[0][0] == -1) {
			board[0][0] = 0;
			to = max();
			if (to < max1) {
				max1 = to;
			}
			board[0][0] = -1;
		}

		if (board[0][1] == -1) {
			board[0][1] = 0;
			to = max();
			if (to < max1) {
				max1 = to;
			}
			board[0][1] = -1;
		}
		if (board[0][2] == -1) {
			board[0][2] = 0;
			to = max();
			if (to < max1) {
				max1 = to;
			}
			board[0][2] = -1;
		}
		if (board[1][0] == -1) {
			board[1][0] = 0;
			to = max();
			if (to < max1) {
				max1 = to;
			}
			board[1][0] = -1;
		}
		if (board[1][1] == -1) {
			board[1][1] = 0;
			to = max();
			if (to < max1) {
				max1 = to;
			}
			board[1][1] = -1;
		}
		if (board[1][2] == -1) {
			board[1][2] = 0;
			to = max();
			if (to < max1) {
				max1 = to;
			}
			board[1][2] = -1;
		}
		if (board[2][0] == -1) {
			board[2][0] = 0;
			to = max();
			if (to < max1) {
				max1 = to;
			}
			board[2][0] = -1;
		}
		if (board[2][1] == -1) {
			board[2][1] = 0;
			to = max();
			if (to < max1) {
				max1 = to;
			}
			board[2][1] = -1;
		}
		if (board[2][2] == -1) {
			board[2][2] = 0;
			to = max();
			if (to < max1) {
				max1 = to;
			}
			board[2][2] = -1;
		}
		return max1;
	}

	private int max() {
		if (boardFull() || combinations() != -1) {
			if (combinations() != -1) {
				return -1;
			} else {
				return 0;
			}
		}

		int min1 = Integer.MIN_VALUE;
		int to;
		if (board[0][0] == -1) {
			board[0][0] = 1;
			to = min();
			if (to > min1) {
				min1 = to;
			}
			board[0][0] = -1;
		}

		if (board[0][1] == -1) {
			board[0][1] = 1;
			to = min();
			if (to > min1) {
				min1 = to;
			}
			board[0][1] = -1;
		}
		if (board[0][2] == -1) {
			board[0][2] = 1;
			to = min();
			if (to > min1) {
				min1 = to;
			}
			board[0][2] = -1;
		}
		if (board[1][0] == -1) {
			board[1][0] = 1;
			to = min();
			if (to > min1) {
				min1 = to;
			}
			board[1][0] = -1;
		}
		if (board[1][1] == -1) {
			board[1][1] = 1;
			to = min();
			if (to > min1) {
				min1 = to;
			}
			board[1][1] = -1;
		}
		if (board[1][2] == -1) {
			board[1][2] = 1;
			to = min();
			if (to > min1) {
				min1 = to;
			}
			board[1][2] = -1;
		}
		if (board[2][0] == -1) {
			board[2][0] = 1;
			to = min();
			if (to > min1) {
				min1 = to;
			}
			board[2][0] = -1;
		}
		if (board[2][1] == -1) {
			board[2][1] = 1;
			to = min();
			if (to > min1) {
				min1 = to;
			}
			board[2][1] = -1;
		}
		if (board[2][2] == -1) {
			board[2][2] = 1;
			to = min();
			if (to > min1) {
				min1 = to;
			}
			board[2][2] = -1;
		}

		return min1;
	}

	public void showPopup(String message, Color color) {
		JDialog dialog = new JDialog(this, "Resultado", true);
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setSize(300, 200);
		dialog.setLocationRelativeTo(null);

		panel.setBackground(color);
		panel.setLayout(new BorderLayout());

		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel.setVerticalAlignment(SwingConstants.CENTER);
		jLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 25));
		jLabel.setText(message);
		jLabel.setForeground(Color.WHITE);
		panel.add(jLabel, BorderLayout.CENTER);

		JButton button = new JButton("Regresar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartFrame startFrame = new StartFrame();
				startFrame.setVisible(true);
				dialog.dispose();
				dispose();
			}
		});
		panel.add(button, BorderLayout.SOUTH);

		dialog.add(panel);
		dialog.setVisible(true);
	}

	public void winner() {
		switch (win) {
		case 0:
			showPopup(infoP.getNickName() + " Ganaste", Color.GREEN);
			infoP.setStatus(STATUS.WINNER);
			writeTextToFile(infoP.toString(), "src/resources/history_game.txt");
			break;
		case 1:
			showPopup(infoP.getNickName() + " Perdiste", Color.RED);
			infoP.setStatus(STATUS.LOSER);
			writeTextToFile(infoP.toString(), "src/resources/history_game.txt");
			break;
		default:
			if (boardFull()) {
				showPopup(infoP.getNickName() + " Empate", Color.GRAY);
				infoP.setStatus(STATUS.TIE);
				writeTextToFile(infoP.toString(), "src/resources/history_game.txt");
			}
			break;
		}

	}

	public static void writeTextToFile(String text, String filePath) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
			writer.write(text);
			System.out.println("El texto se ha escrito correctamente en el archivo.");
		} catch (IOException e) {
			System.err.println("Ocurrió un error al escribir el texto en el archivo: " + e.getMessage());
		}
	}

	private void window() {
		switch (board[0][0]) {
		case 0:
			b1.setText(figurePerson);
			break;
		case 1:
			b1.setText(figurePC);
			break;
		default:
			b1.setText("");
			break;
		}
		switch (board[0][1]) {
		case 0:
			b2.setText(figurePerson);
			break;
		case 1:
			b2.setText(figurePC);
			break;
		default:
			b2.setText("");
			break;
		}
		switch (board[0][2]) {
		case 0:
			b3.setText(figurePerson);
			break;
		case 1:
			b3.setText(figurePC);
			break;
		default:
			b3.setText("");
			break;
		}
		switch (board[1][0]) {
		case 0:
			b4.setText(figurePerson);
			break;
		case 1:
			b4.setText(figurePC);
			break;
		default:
			b4.setText("");
			break;
		}
		switch (board[1][1]) {
		case 0:
			b5.setText(figurePerson);
			break;
		case 1:
			b5.setText(figurePC);
			break;
		default:
			b5.setText("");
			break;
		}
		switch (board[1][2]) {
		case 0:
			b6.setText(figurePerson);
			break;
		case 1:
			b6.setText(figurePC);
			break;
		default:
			b6.setText("");
			break;
		}
		switch (board[2][0]) {
		case 0:
			b7.setText(figurePerson);
			break;
		case 1:
			b7.setText(figurePC);
			break;
		default:
			b7.setText("");
			break;
		}
		switch (board[2][1]) {
		case 0:
			b8.setText(figurePerson);
			break;
		case 1:
			b8.setText(figurePC);
			break;
		default:
			b8.setText("");
			break;
		}
		switch (board[2][2]) {
		case 0:
			b9.setText(figurePerson);
			break;
		case 1:
			b9.setText(figurePC);
			break;
		default:
			b9.setText("");
			break;
		}
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		panel = new javax.swing.JPanel();
		jLabel = new javax.swing.JLabel();
		labelMessage = new javax.swing.JLabel();
		tabbedPane = new javax.swing.JTabbedPane();
		panel1 = new javax.swing.JPanel();
		gridPanel = new javax.swing.JPanel();
		b1 = new javax.swing.JButton();
		b2 = new javax.swing.JButton();
		b3 = new javax.swing.JButton();
		b4 = new javax.swing.JButton();
		b5 = new javax.swing.JButton();
		b6 = new javax.swing.JButton();
		b7 = new javax.swing.JButton();
		b8 = new javax.swing.JButton();
		b9 = new javax.swing.JButton();
		panel2 = new javax.swing.JPanel();
		labelName = new javax.swing.JLabel();
		labelUserN = new javax.swing.JLabel();
		labelF = new javax.swing.JLabel();
		labelXO = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator2 = new javax.swing.JSeparator();
		panel3 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe Game");
		setResizable(false);

		labelMessage.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
		labelMessage.setText(infoP.getNickName() + " is playing with the machine" + "                            ");

		tabbedPane.setBackground(new java.awt.Color(255, 255, 255));

		panel1.setBackground(new java.awt.Color(255, 255, 255));
		panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		gridPanel.setBackground(new java.awt.Color(255, 255, 255));
		gridPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		gridPanel.setLayout(new java.awt.GridLayout(3, 3));

		b1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
		b1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b1ActionPerformed(evt);
			}
		});
		gridPanel.add(b1);

		b2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
		b2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b2ActionPerformed(evt);
			}
		});
		gridPanel.add(b2);

		b3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
		b3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b3ActionPerformed(evt);
			}
		});
		gridPanel.add(b3);

		b4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
		b4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b4ActionPerformed(evt);
			}
		});
		gridPanel.add(b4);

		b5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
		b5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b5ActionPerformed(evt);
			}
		});
		gridPanel.add(b5);

		b6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
		b6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b6ActionPerformed(evt);
			}
		});
		gridPanel.add(b6);

		b7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
		b7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b7ActionPerformed(evt);
			}
		});
		gridPanel.add(b7);

		b8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
		b8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b8ActionPerformed(evt);
			}
		});
		gridPanel.add(b8);

		b9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
		b9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b9ActionPerformed(evt);
			}
		});
		gridPanel.add(b9);

		javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
		panel1.setLayout(panel1Layout);
		panel1Layout
				.setHorizontalGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(panel1Layout.createSequentialGroup().addGap(43, 43, 43).addComponent(gridPanel,
								javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(43, 43, 43)));
		panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panel1Layout
						.createSequentialGroup().addContainerGap(21, Short.MAX_VALUE).addComponent(gridPanel,
								javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE)));

		tabbedPane.addTab("Tab 1", panel1);

		panel2.setBackground(new java.awt.Color(255, 255, 255));
		panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		labelName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
		labelName.setText("NickName");

		labelUserN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
		labelUserN.setText(infoP.getNickName());

		labelF.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
		labelF.setText("Figure");

		labelXO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
		labelXO.setText(infoP.getFigure());

		jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

		jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

		javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
		panel2.setLayout(panel2Layout);
		panel2Layout.setHorizontalGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						panel2Layout.createSequentialGroup().addContainerGap(75, Short.MAX_VALUE)
								.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(labelF, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(91, 91, 91)
								.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(labelUserN)
										.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(labelXO))
								.addGap(69, 69, 69)));
		panel2Layout.setVerticalGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						panel2Layout.createSequentialGroup().addGap(100, 100, 100)
								.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(labelUserN, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(50, 50, 50)
								.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(labelXO, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(labelF, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(93, Short.MAX_VALUE)));

		tabbedPane.addTab("Tab 2", panel2);

		panel3.setBackground(new java.awt.Color(255, 255, 255));
		panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
		jLabel1.setText("Lunna Karina Sosa Espitia 202213314");

		jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
		jLabel2.setText("Ronald Samir Molinares Sanabria 202213350");

		jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
		jLabel3.setText("UNIVERSIDAD PEDAGÓGICA Y TECNOLÓGICA DE COLOMBIA");

		jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
		jLabel5.setText("INGENIERÍA DE SISTEMAS Y COMPUTACIÓN");

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/UPTC.png"))); // NOI18N

		javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
		panel3.setLayout(panel3Layout);
		panel3Layout.setHorizontalGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						panel3Layout.createSequentialGroup().addContainerGap(80, Short.MAX_VALUE).addComponent(jLabel3)
								.addGap(70, 70, 70))
				.addGroup(panel3Layout.createSequentialGroup().addGap(120, 120, 120)
						.addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel5).addComponent(jLabel2))
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(panel3Layout.createSequentialGroup()
						.addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panel3Layout.createSequentialGroup().addGap(94, 94, 94).addComponent(jLabel6))
								.addGroup(panel3Layout.createSequentialGroup().addGap(147, 147, 147)
										.addComponent(jLabel1)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel3Layout
				.setVerticalGroup(
						panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panel3Layout.createSequentialGroup().addGap(35, 35, 35)
										.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(32, 32, 32)
										.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(32, 32, 32).addComponent(jLabel6)
										.addContainerGap(17, Short.MAX_VALUE)));

		tabbedPane.addTab("Tab 3", panel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(64, 64, 64)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 518,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(labelMessage, javax.swing.GroupLayout.Alignment.TRAILING))
						.addGap(64, 64, 64)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(35, 35, 35).addComponent(labelMessage)
								.addGap(30, 30, 30).addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE,
										375, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(35, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
		execute(0, 0);
		window();
		winner();
	}

	private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
		execute(0, 1);
		window();
		winner();
	}

	private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
		execute(0, 2);
		window();
		winner();
	}

	private void b4ActionPerformed(java.awt.event.ActionEvent evt) {
		execute(1, 0);
		window();
		winner();
	}

	private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
		execute(1, 1);
		window();
		winner();
	}

	private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
		execute(1, 2);
		window();
		winner();
	}

	private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
		execute(2, 0);
		window();
		winner();
	}

	private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
		execute(2, 1);
		window();
		winner();
	}

	private void b9ActionPerformed(java.awt.event.ActionEvent evt) {
		execute(2, 2);
		window();
		winner();
	}

//	public static void main(String args[]) {
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				new GameFrame().setVisible(true);
//			}
//		});
//	}

	// Variables declaration - do not modify
	private javax.swing.JButton b1;
	private javax.swing.JButton b2;
	private javax.swing.JButton b3;
	private javax.swing.JButton b4;
	private javax.swing.JButton b5;
	private javax.swing.JButton b6;
	private javax.swing.JButton b7;
	private javax.swing.JButton b8;
	private javax.swing.JButton b9;
	private javax.swing.JPanel gridPanel;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JLabel labelF;
	private javax.swing.JLabel labelMessage;
	private javax.swing.JLabel labelName;
	private javax.swing.JLabel labelUserN;
	private javax.swing.JLabel labelXO;
	private javax.swing.JPanel panel1;
	private javax.swing.JPanel panel2;
	private javax.swing.JPanel panel3;
	private javax.swing.JTabbedPane tabbedPane;
	private javax.swing.JFrame frame;
	// End of variables declaration

}
