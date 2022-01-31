package projectFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static projectFiles.Drug.txtBarCode;
import static projectFiles.Drug.txtDName;

public class Exp_Drug extends javax.swing.JFrame {
    public Exp_Drug() {
        initComponents();
        con = Connections.Connect();
        DisplayExpiry();
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String barCode = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDrug_Info = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Expired Drug Details");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtDrug_Info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDrug_Info.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtDrug_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Drug_Name", "Comp_Name", "Type", "Dose", "Prod_Date", "Exp_Date", "Qty", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        txtDrug_Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDrug_InfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtDrug_Info);
        if (txtDrug_Info.getColumnModel().getColumnCount() > 0) {
            txtDrug_Info.getColumnModel().getColumn(0).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(1).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(2).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(3).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(4).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(5).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(6).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Delete Drug");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDrug_InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDrug_InfoMouseClicked
        DefaultTableModel dtm = (DefaultTableModel)txtDrug_Info.getModel();
        int selectIndex = txtDrug_Info.getSelectedRow();
        
        barCode = dtm.getValueAt(selectIndex, 0).toString();
    }//GEN-LAST:event_txtDrug_InfoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Drug d = new Drug();
        this.hide();
        d.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(barCode.equals("")){
            JOptionPane.showMessageDialog(null, "Select any Drug's Row", "Empty Selection", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                String sql = "delete from Drugs where Barcode = ?";
                pst = con.prepareStatement(sql);
                pst.setString(1, barCode);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Drug Details Deleted Successfully");
                DisplayExpiry();
            } catch (SQLException ex) {
                Logger.getLogger(Exp_Drug.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exp_Drug().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable txtDrug_Info;
    // End of variables declaration//GEN-END:variables
    
    private void DisplayExpiry(){
        try {
            String sql = "select Barcode,Drug_Name,Comp_Name,Type,Dose,Prod_Date,Exp_Date,Quantity,Price from Drugs";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                String date = rs.getDate("Exp_Date").toString();
                int v = checkExpiry(date);
                if(v < 0){
                    txtDrug_Info.setModel(DbUtils.resultSetToTableModel(rs));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Exp_Drug.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public int checkExpiry(String sDate){
//        LocalDate currentdate = LocalDate.now();
//        int d1 = currentdate.getDayOfMonth();
//        int m1 = currentdate.getMonthValue();
//        int y1 = currentdate.getYear();
//        String str = new String(y1+"-"+m1+"-"+d1);
//        
//        if(str.length() == 9){
//            str = new String(y1+"-0"+m1+"-"+d1);
//        }
//        int val = str.compareTo(sDate);
//        return val;
        
        int v;
        String curDate = LocalDate.now().toString();
        
        v = curDate.compareTo(sDate);
        return v;
    }
}
