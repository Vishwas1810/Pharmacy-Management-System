package projectFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static projectFiles.Company.txtCI;

public class Drug extends javax.swing.JFrame {
    public Drug() {
        initComponents();
        con = Connections.Connect();
        ClearInput();
        CompanyList();
        DisplayDrugs();
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDrug_Info = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBarCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtDName = new javax.swing.JTextField();
        txtADrug = new javax.swing.JButton();
        txtUDrug = new javax.swing.JButton();
        txtEDrug = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtDrugComp = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDrugType = new javax.swing.JComboBox<>();
        txtQty = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDDrug = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDosage = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Drugs  Details");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtDrug_Info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDrug_Info.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtDrug_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
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
            txtDrug_Info.getColumnModel().getColumn(0).setHeaderValue("Barcode");
            txtDrug_Info.getColumnModel().getColumn(1).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(1).setHeaderValue("Drug_Name");
            txtDrug_Info.getColumnModel().getColumn(2).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(2).setHeaderValue("Comp_Name");
            txtDrug_Info.getColumnModel().getColumn(3).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(3).setHeaderValue("Type");
            txtDrug_Info.getColumnModel().getColumn(4).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(4).setHeaderValue("Dose");
            txtDrug_Info.getColumnModel().getColumn(5).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(5).setHeaderValue("Prod_Date");
            txtDrug_Info.getColumnModel().getColumn(6).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(6).setHeaderValue("Exp_Date");
            txtDrug_Info.getColumnModel().getColumn(7).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(7).setHeaderValue("Qty");
            txtDrug_Info.getColumnModel().getColumn(8).setResizable(false);
            txtDrug_Info.getColumnModel().getColumn(8).setHeaderValue("Price");
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Barcode");

        txtBarCode.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Production Date");

        txtPDate.setDateFormatString("yyyy-MM-dd");
        txtPDate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Drug Name");

        txtDName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        txtADrug.setBackground(new java.awt.Color(204, 204, 255));
        txtADrug.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtADrug.setText("Add Drug");
        txtADrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtADrugActionPerformed(evt);
            }
        });

        txtUDrug.setBackground(new java.awt.Color(204, 204, 255));
        txtUDrug.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtUDrug.setText("Update Drug");
        txtUDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUDrugActionPerformed(evt);
            }
        });

        txtEDrug.setBackground(new java.awt.Color(204, 204, 255));
        txtEDrug.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtEDrug.setText("Expired Drug");
        txtEDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEDrugActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Expiry Date");

        txtEDate.setDateFormatString("yyyy-MM-dd");
        txtEDate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Company Name");

        txtDrugComp.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtDrugComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Company" }));
        txtDrugComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugCompActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Type");

        txtDrugType.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtDrugType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Tablet", "Capsules", "Drops", "Inhalers", "Injections", "Liquid" }));

        txtQty.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Price");

        txtDDrug.setBackground(new java.awt.Color(204, 204, 255));
        txtDDrug.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDDrug.setText("Delete Drug");
        txtDDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDDrugActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Clear Input");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("Return");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Dosage");

        txtDosage.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtBarCode)
                        .addComponent(txtDName)
                        .addComponent(txtDrugComp, 0, 216, Short.MAX_VALUE))
                    .addComponent(txtDrugType, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(txtEDrug)
                            .addGap(40, 40, 40)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 76, 76))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(171, 171, 171)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtADrug, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtUDrug)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtADrug, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtBarCode, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDrugComp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDrugType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ClearInput();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ClearInput();
        this.hide();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtADrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtADrugActionPerformed
        String BarCode = txtBarCode.getText();
        String DName = txtDName.getText();
        String DrugComp = txtDrugComp.getSelectedItem().toString();
        String DrugType = txtDrugType.getSelectedItem().toString();
        String Dosage = txtDosage.getText();
        String PDate = ((JTextField)txtPDate.getDateEditor().getUiComponent()).getText();
        String EDate = ((JTextField)txtEDate.getDateEditor().getUiComponent()).getText();
        String Qty = txtQty.getText();
        String Price = txtPrice.getText();
        
        if(BarCode.equals("") || DName.equals("") || DrugComp.equals("") || DrugType.equals("") || Dosage.equals("") || PDate.equals("") || EDate.equals("") || Qty.equals("") || Price.equals("")){
            JOptionPane.showMessageDialog(null, "Complete Drug Information Needed", "Missing Information", JOptionPane.ERROR_MESSAGE);
        }
        else if(DrugComp.equals("Select Company") || DrugType.equals("Select Type")){
            JOptionPane.showMessageDialog(null, "Please Select Company And Type", "Missing Information", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String sql = "insert into Drugs(Barcode,Drug_Name,Comp_Name,Type,Dose,Prod_Date,Exp_Date,Quantity,Price) values(?,?,?,?,?,?,?,?,?)";
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, BarCode);
                pst.setString(2, DName);
                pst.setString(3, DrugComp);
                pst.setString(4, DrugType);
                pst.setString(5, Dosage);
                pst.setString(6, PDate);
                pst.setString(7, EDate);
                pst.setString(8, Qty);
                pst.setString(9, Price);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "New Drug Details are Added Successfully");
                ClearInput();
                DisplayDrugs();
            } catch (SQLException ex) {
                Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtADrugActionPerformed

    private void txtDrugCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugCompActionPerformed

    private void txtDrug_InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDrug_InfoMouseClicked
        DefaultTableModel dtm = (DefaultTableModel)txtDrug_Info.getModel();
        int selectIndex = txtDrug_Info.getSelectedRow();
        
        txtBarCode.setText(dtm.getValueAt(selectIndex, 0).toString());
        txtDName.setText(dtm.getValueAt(selectIndex, 1).toString());
        txtDrugComp.setSelectedItem(dtm.getValueAt(selectIndex, 2).toString());
        txtDrugType.setSelectedItem(dtm.getValueAt(selectIndex, 3).toString());
        txtDosage.setText(dtm.getValueAt(selectIndex, 4).toString());
        
        try {
            txtPDate.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(dtm.getValueAt(selectIndex, 5).toString()));
            txtEDate.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(dtm.getValueAt(selectIndex, 6).toString()));
        } catch (ParseException ex) {
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtQty.setText(dtm.getValueAt(selectIndex, 7).toString());
        txtPrice.setText(dtm.getValueAt(selectIndex, 8).toString());
        
    }//GEN-LAST:event_txtDrug_InfoMouseClicked

    private void txtEDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEDrugActionPerformed
        int flag=0;
        
        try {
            String sql = "select Exp_Date from Drugs";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                String date = rs.getDate("Exp_Date").toString();
                int v = Exp_Date_Check(date);
                if(v >= 0){
                    Exp_Drug ed = new Exp_Drug();
                    this.hide();
                    ed.setVisible(true);
                    flag = 1;
                    break;
                }
                else
                    flag = 0;
            }
            
            if(flag == 0)
                JOptionPane.showMessageDialog(null, "No Expiry Drug Available", "No Expiry", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtEDrugActionPerformed

    private void txtUDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUDrugActionPerformed
        String BarCode = txtBarCode.getText();
        String DName = txtDName.getText();
        String DrugComp = txtDrugComp.getSelectedItem().toString();
        String DrugType = txtDrugType.getSelectedItem().toString();
        String Dosage = txtDosage.getText();
        String PDate = ((JTextField)txtPDate.getDateEditor().getUiComponent()).getText();
        String EDate = ((JTextField)txtEDate.getDateEditor().getUiComponent()).getText();
        String Qty = txtQty.getText();
        String Price = txtPrice.getText();
        
        if(BarCode.equals("") || DName.equals("") || DrugComp.equals("") || DrugType.equals("") || Dosage.equals("") || PDate.equals("") || EDate.equals("") || Qty.equals("") || Price.equals("")){
            JOptionPane.showMessageDialog(null, "Complete Drug Information Needed", "Missing Information", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                String sql = "update Drugs set Drug_Name=?,Comp_Name=?,Type=?,Dose=?,Prod_Date=?,Exp_Date=?,Quantity=?,Price=? where Barcode = ?";
                pst = con.prepareStatement(sql);
                pst.setString(1, DName);
                pst.setString(2, DrugComp);
                pst.setString(3, DrugType);
                pst.setString(4, Dosage);
                pst.setString(5, PDate);
                pst.setString(6, EDate);
                pst.setString(7, Qty);
                pst.setString(8, Price);
                pst.setString(9, BarCode);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Drug Details Updated Successfully");
                ClearInput();
                DisplayDrugs();
            } catch (SQLException ex) {
                Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtUDrugActionPerformed

    private void txtDDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDDrugActionPerformed
        String barCode = txtBarCode.getText();
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
                ClearInput();
                DisplayDrugs();
            } catch (SQLException ex) {
                Logger.getLogger(Exp_Drug.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtDDrugActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drug().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JButton txtADrug;
    public static javax.swing.JTextField txtBarCode;
    public static javax.swing.JButton txtDDrug;
    public static javax.swing.JTextField txtDName;
    public static javax.swing.JTextField txtDosage;
    public static javax.swing.JComboBox<String> txtDrugComp;
    public static javax.swing.JComboBox<String> txtDrugType;
    private javax.swing.JTable txtDrug_Info;
    public static com.toedter.calendar.JDateChooser txtEDate;
    public static javax.swing.JButton txtEDrug;
    public static com.toedter.calendar.JDateChooser txtPDate;
    public static javax.swing.JTextField txtPrice;
    public static javax.swing.JTextField txtQty;
    public static javax.swing.JButton txtUDrug;
    // End of variables declaration//GEN-END:variables

    void ClearInput(){
        txtBarCode.setText("");
        txtDName.setText("");
        txtDrugComp.setSelectedIndex(0);
        txtDrugType.setSelectedItem(0);
        txtDosage.setText("");
        txtPDate.setDate(null);
        txtEDate.setDate(null);
        txtQty.setText("");
        txtPrice.setText("");
    }
    
    void DisplayDrugs(){
        try {
            String sql = "select * from Drugs";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            txtDrug_Info.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void CompanyList(){
        try {
            pst = con.prepareStatement("select Comp_Name from Company");
            rs = pst.executeQuery();
            while(rs.next()){
                txtDrugComp.addItem(rs.getString("Comp_Name"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int Exp_Date_Check(String sDate){
        LocalDate currentdate = LocalDate.now();
        int d1 = currentdate.getDayOfMonth();
        int m1 = currentdate.getMonthValue();
        int y1 = currentdate.getYear();
        String str = new String(y1+"-"+m1+"-"+d1);
        
        if(str.length() == 9){
            str = new String(y1+"-0"+m1+"-"+d1);
        }
        int val = str.compareTo(sDate);
        return val;
    }
}

//int y2 = Integer.parseInt(rs.getDate("Exp_Date").toString().substring(0, 4));
//int m2 = Integer.parseInt(rs.getDate("Exp_Date").toString().substring(5, 7));
//int d2 = Integer.parseInt(rs.getDate("Exp_Date").toString().substring(8, 10));