package projectFiles;

import Email_Send.EmailSend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

public class Make_Bill extends javax.swing.JFrame {
    public Make_Bill() {
        initComponents();
        con = Connections.Connect();
    }
    
    String mStr;
    String Dname,Cname,Dose, Pdate, Edate, EId, EName, BarCode, Qunatity, Total;
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBill = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCEId = new javax.swing.JTextField();
        txtConfirm = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bill  Details");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtBill.setEditable(false);
        txtBill.setColumns(20);
        txtBill.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtBill.setRows(5);
        txtBill.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Bill Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        txtBill.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtBill);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enter Customer Email Id");

        txtCEId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtConfirm.setBackground(new java.awt.Color(51, 153, 255));
        txtConfirm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtConfirm.setText("Bill Will Send To The Above Email-ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Customer Name");

        txtCustName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCustName, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                    .addComponent(txtCEId)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(txtConfirm))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCustName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConfirm)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtCEId.getText().equals("") || !txtConfirm.isSelected()){
            JOptionPane.showMessageDialog(null, "Customer Email Id NOT Entered\nOr\nCheck Boc Not Selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                int v = EmailSend.sendMail(txtCEId.getText(), mStr);
                if(v == 1){
                    JOptionPane.showMessageDialog(null, "Bill is Sended To Entered Customer Email Id");
                    insertSellInfo();
                    clearAll();
                    this.hide();
                    Employee e = new Employee();
                    e.clearPrev(1);
                }
                else
                    JOptionPane.showMessageDialog(null, "Email Transfer Error", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (MessagingException ex) {
                Logger.getLogger(Make_Bill.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Make_Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBill;
    private javax.swing.JTextField txtCEId;
    private javax.swing.JCheckBox txtConfirm;
    private javax.swing.JTextField txtCustName;
    // End of variables declaration//GEN-END:variables

    public void BillDetails(String Eid, String Ename,String Barcode, String Qty, String total){
        EId = Eid;
        EName = Ename;
        BarCode = Barcode;
        Qunatity = Qty;
        Total = total;
        Dname = Cname = Dose = Pdate = Edate = null;
        try {
            String sql = "select Drug_Name, Comp_Name, Dose, Prod_Date, Exp_Date from Drugs where Barcode = '"+Barcode+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                Dname = rs.getString("Drug_Name");
                Cname = rs.getString("Comp_Name");
                Dose = rs.getString("Dose");
                Pdate = rs.getString("Prod_Date");
                Edate = rs.getString("Exp_Date");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Make_Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        String h1 = "\t|------------------------------------------------------|";
        String h2 = "\t|                  EverGreen Pharmacy               |\n"+h1;
//             h1 = "\t|------------------------------------------------------|";
        String h3 = "\t        Employee Id   :  " +Eid;
        String h4 = "\t        Employee Name :  " +Ename;
//             h1 = "\t|------------------------------------------------------|";
        String h5 = "\t        Drug Id                :  "+Barcode;
        String h6 = "\t        Drug Name          :  "+Dname;
        String h7 = "\t        Company Name   :  "+Cname;
        String h8 = "\t        Dosage                 :  "+Dose;
        String h9 = "\t        Production Date   :  "+Pdate;
        String h10 = "\t        Expiry Date          :  "+Edate;
        String h11 = "\t        Quantity               :  "+Qty+"\n"+h1;
//             h1 = "\t|------------------------------------------------------|";
        String h12 = "\t                    Total Amount = " +total+"\n"+h1;   
        String th = "\n\tThank Ypu from EverGreen Pharmacy\n\t            Stay Safe Stay Healthy";
        String str = h1+"\n"+h2+"\n"+h3+"\n"+h4+"\n"+h1+"\n"+h5+"\n"+h6+"\n"+h7+"\n"+h8+"\n"+h9+"\n"+h10+"\n"+h11+"\n"+h12+"\n"+th;
        txtBill.setText(str);
        mStr = str;
    }
    
    public void insertSellInfo(){
        String sellDate = LocalDate.now().toString();
        try {
            String sql = "insert into Sales(Emp_Id,Emp_Name,Drug_Id,Comp_Name,Customer_Name,Cust_EmailId,Sell_Date,Quantity,Total_Amount) values(?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, EId);
            pst.setString(2, EName);
            pst.setString(3, BarCode);
            pst.setString(4, Cname);
            pst.setString(5, txtCustName.getText());
            pst.setString(6, txtCEId.getText());
            pst.setString(7, sellDate);
            pst.setString(8, Qunatity);
            pst.setString(9, Total);
            pst.executeUpdate();
            updateDrugs();
            
        } catch (SQLException ex) {
            Logger.getLogger(Make_Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearAll(){
        txtBill.setText("");
        txtCEId.setText("");
        txtConfirm.setSelected(false);
    }
    
    public void updateDrugs(){  
        int qty = 0;
        try {
            String sql1 = "select Quantity from Drugs where Barcode = ?";
            pst = con.prepareStatement(sql1);
            pst.setString(1, BarCode);
            rs = pst.executeQuery();
            if(rs.next())
                qty = rs.getInt("Quantity");
            
            qty = qty - Integer.parseInt(Qunatity);
            pst = null;
            String sql = "update Drugs set Quantity = ? where Barcode = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, qty);
            pst.setString(2, BarCode);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Make_Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}