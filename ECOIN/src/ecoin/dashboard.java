package ecoin;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class dashboard extends javax.swing.JFrame {

    private ECOIN ecoin = new ECOIN();
    private String loggedInUserMobile;

    public dashboard(String Mobile) {
        this.loggedInUserMobile = Mobile;
        initComponents();
        setLocationRelativeTo(null);
        displayUserData();
        Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
        this.setIconImage(img);

    }

    private void displayUserData() {

        String userName = ecoin.UserName(loggedInUserMobile); 
        double balance = ecoin.UserBalance(loggedInUserMobile); 
        String accn = ecoin.Useracc(loggedInUserMobile);
        
        showname.setText(userName);
        abalance.setText("" + balance);
        accountpro.setText(accn);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        showname = new javax.swing.JLabel();
        abalance = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        accountpro = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        blogoout = new javax.swing.JButton();
        history = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sendmoney = new javax.swing.JPanel();
        samount = new javax.swing.JTextField();
        smobnum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sendM1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        aamount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        sendmoney1 = new javax.swing.JPanel();
        pamount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        payb = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DASHBOARD");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(11, 64, 18));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 500));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image icon/icons8-test-account-60.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Hello..!");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("--------------------------------------------------------------");

        jPanel4.setBackground(new java.awt.Color(0, 51, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 50));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        showname.setBackground(new java.awt.Color(11, 64, 18));
        showname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        showname.setForeground(new java.awt.Color(255, 255, 204));

        abalance.setBackground(new java.awt.Color(11, 64, 18));
        abalance.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        abalance.setForeground(new java.awt.Color(255, 255, 204));

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Available balance :");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image icon/icons8-money-50.png"))); // NOI18N

        accountpro.setBackground(new java.awt.Color(11, 64, 18));
        accountpro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        accountpro.setForeground(new java.awt.Color(255, 255, 204));

        jLabel15.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Account number :");

        Home.setBackground(new java.awt.Color(11, 64, 18));
        Home.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image icon/icons8-home-30.png"))); // NOI18N
        Home.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Home.setBorderPainted(false);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Home");

        jLabel17.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Logout");

        blogoout.setBackground(new java.awt.Color(11, 64, 18));
        blogoout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image icon/icons8-logout-50.png"))); // NOI18N
        blogoout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        blogoout.setBorderPainted(false);
        blogoout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogooutActionPerformed(evt);
            }
        });

        history.setBackground(new java.awt.Color(11, 64, 18));
        history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image icon/icons8-history-38.png"))); // NOI18N
        history.setBorderPainted(false);
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("History");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(showname, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(abalance, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(accountpro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(blogoout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showname, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountpro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abalance, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(Home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blogoout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 250, 500);

        jPanel3.setBackground(new java.awt.Color(255, 247, 247));

        sendmoney.setBackground(new java.awt.Color(204, 255, 204));
        sendmoney.setForeground(new java.awt.Color(0, 51, 51));
        sendmoney.setPreferredSize(new java.awt.Dimension(225, 230));
        sendmoney.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        samount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        samount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samountActionPerformed(evt);
            }
        });
        sendmoney.add(samount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 40));

        smobnum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sendmoney.add(smobnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 40));

        jLabel11.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel11.setText("Enter accuont number :");
        sendmoney.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        sendM1.setBackground(new java.awt.Color(11, 64, 18));
        sendM1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sendM1.setForeground(new java.awt.Color(255, 247, 247));
        sendM1.setText("Send");
        sendM1.setAlignmentY(0.0F);
        sendM1.setBorderPainted(false);
        sendM1.setFocusPainted(false);
        sendM1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sendM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendM1ActionPerformed(evt);
            }
        });
        sendmoney.add(sendM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel21.setText("Enter amount :");
        sendmoney.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SEND MONEY");

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PAY BILL");

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        aamount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        aamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aamountActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel9.setText("Enter amount :");

        add.setBackground(new java.awt.Color(11, 64, 18));
        add.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 247, 247));
        add.setText("Add");
        add.setAlignmentY(0.0F);
        add.setBorderPainted(false);
        add.setFocusPainted(false);
        add.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jComboBox.setBackground(new java.awt.Color(204, 255, 204));
        jComboBox.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Card to ecoin", "Bank to ecoin" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel18.setText("Add from  :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(aamount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(89, 89, 89))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aamount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add)
                .addContainerGap())
        );

        sendmoney1.setBackground(new java.awt.Color(204, 255, 204));
        sendmoney1.setForeground(new java.awt.Color(0, 51, 51));
        sendmoney1.setPreferredSize(new java.awt.Dimension(225, 230));

        pamount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel10.setText("Enter biller id  :");

        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel12.setText("Enter amount :");

        payb.setBackground(new java.awt.Color(11, 64, 18));
        payb.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        payb.setForeground(new java.awt.Color(255, 247, 247));
        payb.setText("pay");
        payb.setAlignmentY(0.0F);
        payb.setBorderPainted(false);
        payb.setFocusPainted(false);
        payb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        payb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(204, 255, 204));
        jComboBox1.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISTITION-[112]", "IIUC CAFE-[203]", "IIUC PRINT-[908]", "CAFETERIA-[670]" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sendmoney1Layout = new javax.swing.GroupLayout(sendmoney1);
        sendmoney1.setLayout(sendmoney1Layout);
        sendmoney1Layout.setHorizontalGroup(
            sendmoney1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendmoney1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(sendmoney1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payb)
                    .addGroup(sendmoney1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel10)
                        .addComponent(pamount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        sendmoney1Layout.setVerticalGroup(
            sendmoney1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendmoney1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pamount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADD MONEY");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image icon/icons8-coin-64.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("E-coin trusted and sequre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(sendmoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendmoney1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel7)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendmoney1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(250, 0, 550, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blogooutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogooutActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Confirmaton", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Logout Cancelled");
        }
    }//GEN-LAST:event_blogooutActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void samountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_samountActionPerformed

    private void sendM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendM1ActionPerformed
        // TODO add your handling code here:

        String recipientMobile = smobnum.getText(); 
        double amount = Double.parseDouble(samount.getText()); 
        
         String to = smobnum.getText();
         double tamount = Double.parseDouble(samount.getText()); 
        
        
        
        boolean sent = ecoin.sendMoney(loggedInUserMobile, recipientMobile, amount);
        if (sent) {
            ecoin.history(loggedInUserMobile, to, tamount);
            JOptionPane.showMessageDialog(null, "Amount sent successfully.");

            displayUserData();

        } else {
            JOptionPane.showMessageDialog(null, "Failed to send amount. Insufficient balance or other issue.");
        }

        smobnum.setText("");
        samount.setText("");

    }//GEN-LAST:event_sendM1ActionPerformed

    private void aamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aamountActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        String amountStr = aamount.getText(); 
        double amount = Double.parseDouble(amountStr); 

        boolean added = ecoin.addMoney(loggedInUserMobile, amount);
        if (added) {
            JOptionPane.showMessageDialog(null, "Amount added successfully.");
            
            displayUserData();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add amount. Please try again.");
        }
        aamount.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        loginsignupui logsignp = new loginsignupui();
        logsignp.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void paybActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybActionPerformed
        // TODO add your handling code here:

        double amount = Double.parseDouble(pamount.getText()); 

        boolean sent = ecoin.paybill(loggedInUserMobile, amount);
        if (sent) {
            JOptionPane.showMessageDialog(null, "Payment successfull.");
            
            displayUserData();
        } else {
            JOptionPane.showMessageDialog(null, "Failed payment.Insufficient balance or other issue.");
        }

        pamount.setText("");
    }//GEN-LAST:event_paybActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed

        historyui historyUI = new historyui(loggedInUserMobile);
        historyUI.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_historyActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JTextField aamount;
    private javax.swing.JLabel abalance;
    private javax.swing.JLabel accountpro;
    private javax.swing.JButton add;
    private javax.swing.JButton blogoout;
    private javax.swing.JButton history;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField pamount;
    private javax.swing.JButton payb;
    private javax.swing.JTextField samount;
    private javax.swing.JButton sendM1;
    private javax.swing.JPanel sendmoney;
    private javax.swing.JPanel sendmoney1;
    private javax.swing.JLabel showname;
    private javax.swing.JTextField smobnum;
    // End of variables declaration//GEN-END:variables
}
