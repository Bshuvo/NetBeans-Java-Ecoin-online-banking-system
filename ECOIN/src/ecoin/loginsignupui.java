
package ecoin;

import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class loginsignupui extends javax.swing.JFrame {
    

   
    public loginsignupui() {
       
        initComponents();
        setLocationRelativeTo(null);
        Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
        this.setIconImage(img);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bsignup = new javax.swing.JButton();
        left = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        accnumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        accpin = new javax.swing.JTextField();
        pinreset = new javax.swing.JButton();
        blogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setPreferredSize(new java.awt.Dimension(800, 500));
        panel1.setLayout(null);

        right.setBackground(new java.awt.Color(11, 64, 18));
        right.setPreferredSize(new java.awt.Dimension(400, 500));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image icon/icons8-coin-64.png"))); // NOI18N
        icon.setAlignmentY(0.0F);
        icon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        welcome.setFont(new java.awt.Font("Century Schoolbook", 3, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 204));
        welcome.setText("Welcome to ...");
        welcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("E-COIN");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Don't have account ?");

        bsignup.setBackground(new java.awt.Color(255, 247, 247));
        bsignup.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        bsignup.setText("signup");
        bsignup.setAlignmentY(0.0F);
        bsignup.setBorderPainted(false);
        bsignup.setFocusPainted(false);
        bsignup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(icon)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(bsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        panel1.add(right);
        right.setBounds(0, 0, 400, 500);

        left.setBackground(new java.awt.Color(255, 247, 247));
        left.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 2, 24)); // NOI18N
        jLabel2.setText("Login to your e-coin account");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel3.setText("Account number ");

        accnumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        accnumber.setPreferredSize(new java.awt.Dimension(7, 14));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel4.setText("E-coin pin");

        accpin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        accpin.setPreferredSize(new java.awt.Dimension(7, 14));

        pinreset.setBackground(new java.awt.Color(11, 64, 18));
        pinreset.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        pinreset.setForeground(new java.awt.Color(255, 247, 247));
        pinreset.setText("Reset");
        pinreset.setAlignmentY(0.0F);
        pinreset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pinreset.setBorderPainted(false);
        pinreset.setFocusPainted(false);
        pinreset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        blogin1.setBackground(new java.awt.Color(11, 64, 18));
        blogin1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        blogin1.setForeground(new java.awt.Color(255, 247, 247));
        blogin1.setText("Next");
        blogin1.setAlignmentY(0.0F);
        blogin1.setBorderPainted(false);
        blogin1.setFocusPainted(false);
        blogin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accnumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(accpin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftLayout.createSequentialGroup()
                        .addComponent(pinreset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accpin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinreset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        panel1.add(left);
        left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsignupActionPerformed
       signupui signp = new signupui();
       signp.setVisible(true);
       dispose();
    }//GEN-LAST:event_bsignupActionPerformed

    private void blogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogin1ActionPerformed
        
        
                
        String Mobile = accnumber.getText();
        String Pin = accpin.getText();

        ECOIN ecoin = new ECOIN();
        boolean isValid = ecoin.validateLogin(Mobile, Pin);

        
        if(accnumber.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill out account number");
        }
        else if(accpin.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill out pin");
        }
        else if(isValid)    //(accnumber.getText().contains("admin")&& accpin.getText().contains("admin"))
        {
            
            
            JOptionPane.showMessageDialog(null, "Login successful !");
            dashboard dashp = new dashboard(Mobile);
            dashp.setVisible(true);
            dispose();
           
            
        }
        else
        {
         JOptionPane.showMessageDialog(null, "Wrong account number or pin !","Message",JOptionPane.ERROR_MESSAGE);   
        }
        
   
        accnumber.setText("");
        accpin.setText("");
    }//GEN-LAST:event_blogin1ActionPerformed

    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new loginsignupui().setVisible(true);
         

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnumber;
    private javax.swing.JTextField accpin;
    private javax.swing.JButton blogin1;
    private javax.swing.JButton bsignup;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel left;
    private javax.swing.JPanel panel1;
    private javax.swing.JButton pinreset;
    private javax.swing.JPanel right;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
