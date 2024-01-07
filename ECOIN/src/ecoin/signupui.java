package ecoin;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class signupui extends javax.swing.JFrame {

    public signupui() {

        initComponents();
        setLocationRelativeTo(null);
        Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
        this.setIconImage(img);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        mobnum = new javax.swing.JTextField();
        nid = new javax.swing.JTextField();
        setpin = new javax.swing.JTextField();
        bsubmit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        blogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGNUP");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        left.setBackground(new java.awt.Color(255, 247, 247));
        left.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel3.setText("Name ");

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel4.setText("Mobile number ");

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel5.setText("Set pin");

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel6.setText("Nid number");

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(11, 64, 18));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Create an account ");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        mobnum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mobnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobnumActionPerformed(evt);
            }
        });

        nid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidActionPerformed(evt);
            }
        });

        setpin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpinActionPerformed(evt);
            }
        });

        bsubmit.setBackground(new java.awt.Color(11, 64, 18));
        bsubmit.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        bsubmit.setForeground(new java.awt.Color(255, 247, 247));
        bsubmit.setText("Submit");
        bsubmit.setAlignmentY(0.0F);
        bsubmit.setBorderPainted(false);
        bsubmit.setFocusPainted(false);
        bsubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 3, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Note : Your mobile number will be your account number ");

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(mobnum, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setpin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(leftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(bsubmit)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobnum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(setpin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        jPanel1.add(left);
        left.setBounds(0, 0, 400, 500);

        right.setBackground(new java.awt.Color(11, 64, 18));
        right.setAlignmentY(0.0F);
        right.setPreferredSize(new java.awt.Dimension(400, 500));

        icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image icon/icons8-coin-64.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Do not share your pin with anyone");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("E-COIN");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("I have account ");

        blogin1.setBackground(new java.awt.Color(255, 247, 247));
        blogin1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        blogin1.setText("Login");
        blogin1.setAlignmentY(0.0F);
        blogin1.setBorderPainted(false);
        blogin1.setFocusPainted(false);
        blogin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
            .addGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(blogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jPanel1.add(right);
        right.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void mobnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobnumActionPerformed

    private void nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidActionPerformed

    private void setpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setpinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setpinActionPerformed

    private void blogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogin1ActionPerformed
        loginsignupui logp = new loginsignupui();
        logp.setVisible(true);
        dispose();
    }//GEN-LAST:event_blogin1ActionPerformed

    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubmitActionPerformed

        ECOIN ecoin = new ECOIN();

        
        String name = Name.getText();
        String mobile = mobnum.getText();
        String nidd = nid.getText();
        String pin = setpin.getText();
        if (Name.getText().equals("") || (mobnum.getText().equals("")) || (nid.getText().equals("")) || setpin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out everything!");
        } else {
            boolean dataInserted = ecoin.insertData(name, mobile, nidd, pin);
            
            if (dataInserted) {
               
                System.out.println("Data inserted successfully!");
            } else {
               
                System.out.println("Failed to insert data.");
            }
            
            
            JOptionPane.showMessageDialog(null, "Signup successful !");
            loginsignupui logsignp = new loginsignupui();
            logsignp.setVisible(true);
            dispose();
        }

        Name.setText("");
        mobnum.setText("");
        nid.setText("");
        setpin.setText("");

       

    }//GEN-LAST:event_bsubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JButton blogin1;
    private javax.swing.JButton bsubmit;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left;
    private javax.swing.JTextField mobnum;
    private javax.swing.JTextField nid;
    private javax.swing.JPanel right;
    private javax.swing.JTextField setpin;
    // End of variables declaration//GEN-END:variables
}
