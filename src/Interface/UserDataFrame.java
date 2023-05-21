package Interface;

import java.awt.Color;
import javax.swing.ImageIcon;

public class UserDataFrame extends javax.swing.JFrame {

    public UserDataFrame() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/icono.png"));
        this.setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
                        
    private void initComponents() {

        PanelData = new javax.swing.JPanel();
        labelMessage = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        labelNickname = new javax.swing.JLabel();
        textFieldNickName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        labelFigure = new javax.swing.JLabel();
        rbuttonX = new javax.swing.JRadioButton();
        rbuttonO = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        continueButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe User Data");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        PanelData.setBackground(new java.awt.Color(255, 255, 255));
        PanelData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        PanelData.setForeground(new java.awt.Color(0, 153, 255));

        labelMessage.setBackground(new java.awt.Color(255, 255, 255));
        labelMessage.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        labelMessage.setForeground(new java.awt.Color(0, 102, 204));
        labelMessage.setText("Register PLayer");

        jSeparator.setForeground(new java.awt.Color(0, 0, 0));

        labelNickname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelNickname.setForeground(new java.awt.Color(0, 102, 204));
        labelNickname.setText("NickName");

        textFieldNickName.setColumns(10);
        textFieldNickName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        textFieldNickName.setForeground(new java.awt.Color(153, 153, 153));
        textFieldNickName.setText("Enter your Nickname");
        textFieldNickName.setBorder(null);
        textFieldNickName.setMaximumSize(new java.awt.Dimension(92, 21));
        textFieldNickName.setMinimumSize(new java.awt.Dimension(92, 21));
        textFieldNickName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNickNameActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        labelFigure.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelFigure.setForeground(new java.awt.Color(0, 102, 204));
        labelFigure.setText("Choose a Figure");
        labelFigure.setPreferredSize(new java.awt.Dimension(92, 21));

        rbuttonX.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        rbuttonX.setText("  X");
        rbuttonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbuttonXActionPerformed(evt);
            }
        });

        rbuttonO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        rbuttonO.setText("  O");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        continueButton.setBackground(new java.awt.Color(255, 204, 51));
        continueButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        continueButton.setForeground(new java.awt.Color(0, 51, 102));
        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 204, 51));
        backButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 51, 153));
        backButton.setText("Back");
        backButton.setPreferredSize(new java.awt.Dimension(77, 23));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDataLayout = new javax.swing.GroupLayout(PanelData);
        PanelData.setLayout(PanelDataLayout);
        PanelDataLayout.setHorizontalGroup(
            PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDataLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMessage)
                .addGap(194, 194, 194))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDataLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelFigure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PanelDataLayout.createSequentialGroup()
                            .addComponent(rbuttonX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbuttonO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PanelDataLayout.setVerticalGroup(
            PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDataLayout.createSequentialGroup()
                        .addComponent(textFieldNickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(30, 30, 30)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelFigure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbuttonX)
                        .addComponent(rbuttonO)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(PanelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(PanelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        GameFrame game = new GameFrame();
        game.setVisible(true);
        this.dispose();
    }                                              

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        StartFrame userData = new StartFrame();
        userData.setVisible(true);
        this.dispose();
    }                                          

    private void textFieldNickNameActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void rbuttonXActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

  
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDataFrame().setVisible(true);
            }
        });
    }
                  
    private javax.swing.JPanel PanelData;
    private javax.swing.JButton backButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelFigure;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JLabel labelNickname;
    private javax.swing.JRadioButton rbuttonO;
    private javax.swing.JRadioButton rbuttonX;
    private javax.swing.JTextField textFieldNickName;
                  
}

