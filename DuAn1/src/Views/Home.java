package Views;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/Image/Background.png");
            public void paintComponent(Graphics g){

                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, this);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        lblSoftwareName = new javax.swing.JLabel();
        lblRun = new javax.swing.JLabel();
        btnEmployeesManagement = new javax.swing.JButton();
        btnRevenue = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnData = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnSale = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giao Diện Hệ Thống");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblSoftwareName.setFont(new java.awt.Font("Times New Roman", 0, 38)); // NOI18N
        lblSoftwareName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoftwareName.setText("Phần Mềm Quản Lý Cửa Hàng");

        lblRun.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblRun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRun.setText("Phần Mềm Quản Lý Số 1 Việt Nam :>");

        btnEmployeesManagement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEmployeesManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Account.png"))); // NOI18N
        btnEmployeesManagement.setText("Cập Nhật Nhân Viên");
        btnEmployeesManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmployeesManagement.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEmployeesManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmployeesManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeesManagementActionPerformed(evt);
            }
        });

        btnRevenue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRevenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Payroll.png"))); // NOI18N
        btnRevenue.setText("Thống Kê");
        btnRevenue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRevenue.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRevenue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevenueActionPerformed(evt);
            }
        });

        btnProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OIP.jpg"))); // NOI18N
        btnProduct.setText("Cập Nhật Sản Phẩm");
        btnProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduct.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        btnData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Database.png"))); // NOI18N
        btnData.setText("Cập Nhật Thông Tin");
        btnData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnData.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnData.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search.png"))); // NOI18N
        btnFind.setText("Tìm Kiếm");
        btnFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFind.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnFind.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Change PasssWord.png"))); // NOI18N
        btnAccount.setText("Cập Nhật Tài Khoản");
        btnAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccount.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });

        btnOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cart.png"))); // NOI18N
        btnOrders.setText("Cập Nhật Hóa Đơn");
        btnOrders.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrders.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnOrders.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LogOut.png"))); // NOI18N
        btnLogOut.setText("Đăng Xuất");
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogOut.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sale.png"))); // NOI18N
        btnSale.setText("Bán Hàng");
        btnSale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSale.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSale.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSoftwareName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(67, 67, 67)
                                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEmployeesManagement)
                                .addGap(67, 67, 67)
                                .addComponent(btnData, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSoftwareName)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSale, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmployeesManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRevenue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFind, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addComponent(lblRun)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Thoát Hệ Thống");
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEmployeesManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeesManagementActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Bạn Đã Vào Hệ Thống Nhân Viên");
        new EmployeesManagement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEmployeesManagementActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Đăng Xuất Thành Công");
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Bạn Đang Vào Hệ Thống Bán Hàng");
        new ViewBanHang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSaleActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Bạn Đang Vào Hệ Thống Sản Phẩm");
        new UpdateProducts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Bạn Đang Vào Hệ Thống Thông Tin");
        new UpdateProducts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDataActionPerformed

    private void btnRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevenueActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Bạn Đang Vào Hệ Thống Kê");
        new Revenue().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRevenueActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Bạn Đang Vào Hệ Thống Tìm Kiếm");
        new Find().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Bạn Đang Vào Hệ Thống Tài Khoản");
        new Account().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Bạn Đang Vào Hệ Thống Hóa Đơn");
        new UpdateReceipt().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnOrdersActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnData;
    private javax.swing.JButton btnEmployeesManagement;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnRevenue;
    private javax.swing.JButton btnSale;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRun;
    private javax.swing.JLabel lblSoftwareName;
    // End of variables declaration//GEN-END:variables
}
