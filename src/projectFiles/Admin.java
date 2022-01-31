package projectFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

public class Admin extends javax.swing.JFrame {
    Company comp;
    Drug drug;
    Purchase purc;
    Employee_Info empi;
    
    public Admin() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Admin.class.getResource("/Images/Dr1.png")));
        con = Connections.Connect();
        initComponents();
        txtType.setText("");
        jPanel1.setVisible(false);
        TimeDate();
        HideAll();
        
        comp = new Company();
        drug = new Drug();
        purc = new Purchase();
        empi = new Employee_Info();
    }

    Date d;
    SimpleDateFormat dd;
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtType = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLN = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        txtDay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsgInfo = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtCompany = new javax.swing.JButton();
        txtDrugs = new javax.swing.JButton();
        txtSales = new javax.swing.JButton();
        txtPurchase = new javax.swing.JButton();
        txtEmployee = new javax.swing.JButton();
        txtCA = new javax.swing.JButton();
        txtCU = new javax.swing.JButton();
        txtCD = new javax.swing.JButton();
        txtDA = new javax.swing.JButton();
        txtDU = new javax.swing.JButton();
        txtDD = new javax.swing.JButton();
        txtSI = new javax.swing.JButton();
        txtEA = new javax.swing.JButton();
        txtEU = new javax.swing.JButton();
        txtED = new javax.swing.JButton();
        txtBD = new javax.swing.JButton();
        txtAD = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy Management");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("(Administration)");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gnome_logout.png"))); // NOI18N
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images (1).jpg"))); // NOI18N
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings1.png"))); // NOI18N
        jButton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton6MouseMoved(evt);
            }
        });
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtType.setForeground(new java.awt.Color(255, 0, 0));
        txtType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtType.setText("Settings");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("Login As     :");

        txtLA.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtLA.setForeground(new java.awt.Color(255, 0, 51));
        txtLA.setText("Priority");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("User Name :");

        txtLN.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtLN.setForeground(new java.awt.Color(255, 0, 51));
        txtLN.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pharmacy Management System");

        txtTime.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTime.setForeground(new java.awt.Color(204, 0, 0));
        txtTime.setText(" 00 : 00 : 00");

        txtDate.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDate.setForeground(new java.awt.Color(204, 0, 0));
        txtDate.setText(" 00-00-0000");

        txtDay.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDay.setForeground(new java.awt.Color(204, 0, 0));
        txtDay.setText(" Day");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Time :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Date :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Day  :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLA, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(txtLN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtType, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        txtMsgInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp_Id", "Emp_Name", "Type", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(txtMsgInfo);
        if (txtMsgInfo.getColumnModel().getColumnCount() > 0) {
            txtMsgInfo.getColumnModel().getColumn(0).setResizable(false);
            txtMsgInfo.getColumnModel().getColumn(1).setResizable(false);
            txtMsgInfo.getColumnModel().getColumn(2).setResizable(false);
            txtMsgInfo.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(0, 10, 534, 400);

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCompany.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtCompany.setText("Company");
        txtCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyActionPerformed(evt);
            }
        });

        txtDrugs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDrugs.setText("    Drugs   ");
        txtDrugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugsActionPerformed(evt);
            }
        });

        txtSales.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSales.setText("Sales");
        txtSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalesActionPerformed(evt);
            }
        });

        txtPurchase.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPurchase.setText("Purchase");
        txtPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurchaseActionPerformed(evt);
            }
        });

        txtEmployee.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtEmployee.setText("Employee");
        txtEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeActionPerformed(evt);
            }
        });

        txtCA.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtCA.setText("Add");
        txtCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCAActionPerformed(evt);
            }
        });

        txtCU.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtCU.setText("Update");
        txtCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCUActionPerformed(evt);
            }
        });

        txtCD.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtCD.setText("Delete");
        txtCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCDActionPerformed(evt);
            }
        });

        txtDA.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtDA.setText("Add Drug");
        txtDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDAActionPerformed(evt);
            }
        });

        txtDU.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtDU.setText("Update Drug");
        txtDU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDUActionPerformed(evt);
            }
        });

        txtDD.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtDD.setText("Delete Drug");
        txtDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDDActionPerformed(evt);
            }
        });

        txtSI.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSI.setText("Sale Info");
        txtSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSIActionPerformed(evt);
            }
        });

        txtEA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtEA.setText("Add Emp");
        txtEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEAActionPerformed(evt);
            }
        });

        txtEU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtEU.setText("Update Emp");
        txtEU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEUActionPerformed(evt);
            }
        });

        txtED.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtED.setText("Delete Emp");
        txtED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEDActionPerformed(evt);
            }
        });

        txtBD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtBD.setText("Buy Drug");
        txtBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBDActionPerformed(evt);
            }
        });

        txtAD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAD.setText("All Deals");
        txtAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtADActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCA, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompany)
                    .addComponent(txtCU, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCD, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDrugs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                    .addComponent(txtDD, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtED, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSI, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtAD, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEU))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBD, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDrugs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDU, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCU, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtED, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(540, 10, 750, 400);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PMSM31.jpg"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(-10, 0, 1300, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1321, 592));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Login l = new Login();
        this.hide();
        l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        txtType.setText("Log Out");
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        txtType.setText("");
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved
        txtType.setText("Message");
    }//GEN-LAST:event_jButton3MouseMoved

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        txtType.setText("");
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DisplayMsg();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        txtType.setText("");
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseMoved
        txtType.setText("Settings");
    }//GEN-LAST:event_jButton6MouseMoved

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Settings s = new Settings();
        this.hide();
        s.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyActionPerformed
        txtCompany.setEnabled(false);
        txtCA.setVisible(true);
        txtCU.setVisible(true);
        txtCD.setVisible(true);
        HideReq(1);
    }//GEN-LAST:event_txtCompanyActionPerformed

    private void txtDrugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugsActionPerformed
        txtDrugs.setEnabled(false);
        txtDA.setVisible(true);
        txtDU.setVisible(true);
        txtDD.setVisible(true);
        HideReq(2);
    }//GEN-LAST:event_txtDrugsActionPerformed

    private void txtSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalesActionPerformed
        txtSales.setEnabled(false);
        txtSI.setVisible(true);
        HideReq(3);
    }//GEN-LAST:event_txtSalesActionPerformed

    private void txtPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurchaseActionPerformed
        txtPurchase.setEnabled(false);
        txtBD.setVisible(true);
        txtAD.setVisible(true);
        HideReq(4);
    }//GEN-LAST:event_txtPurchaseActionPerformed

    private void txtEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeActionPerformed
        txtEmployee.setEnabled(false);
        txtEA.setVisible(true);
        txtED.setVisible(true);
        txtEU.setVisible(true);
        HideReq(5);
    }//GEN-LAST:event_txtEmployeeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCAActionPerformed
        comp.txtAComp.setEnabled(true);
        comp.txtUComp.setEnabled(false);
        comp.txtDComp.setEnabled(false);
        comp.setVisible(true);
    }//GEN-LAST:event_txtCAActionPerformed

    private void txtCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCUActionPerformed
       comp.txtAComp.setEnabled(false);
       comp.txtUComp.setEnabled(true);
       comp.txtDComp.setEnabled(false);
       
       comp.txtCI.setEditable(false);
       
       comp.setVisible(true);
    }//GEN-LAST:event_txtCUActionPerformed

    private void txtCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCDActionPerformed
        comp.txtAComp.setEnabled(false);
        comp.txtUComp.setEnabled(false);
        comp.txtDComp.setEnabled(true);
        
        comp.txtCI.setEditable(false);
        comp.txtCN.setEditable(false);
        comp.txtCA.setEditable(false);
        comp.txtCP.setEditable(false);
        
        comp.setVisible(true);
    }//GEN-LAST:event_txtCDActionPerformed

    private void txtDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDAActionPerformed
       drug.txtADrug.setEnabled(true);
       drug.txtUDrug.setEnabled(false);
       drug.txtDDrug.setEnabled(false);
       drug.txtEDrug.setEnabled(true);
       
       drug.setVisible(true);
    }//GEN-LAST:event_txtDAActionPerformed

    private void txtDUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDUActionPerformed
        drug.txtADrug.setEnabled(false);
        drug.txtUDrug.setEnabled(true);
        drug.txtDDrug.setEnabled(false);
        drug.txtEDrug.setEnabled(true);

        drug.txtBarCode.setEditable(false);
        drug.txtQty.setEditable(false);
        
        drug.setVisible(true);
    }//GEN-LAST:event_txtDUActionPerformed

    private void txtDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDDActionPerformed
        drug.txtADrug.setEnabled(false);
        drug.txtUDrug.setEnabled(false);
        drug.txtDDrug.setEnabled(true);
        drug.txtEDrug.setEnabled(true);

        drug.txtBarCode.setEditable(false);
        drug.txtDName.setEditable(false);
        drug.txtDrugComp.setEnabled(false);
        drug.txtDrugType.setEnabled(false);
        drug.txtDosage.setEditable(false);
        drug.txtPDate.setEnabled(false);
        drug.txtEDate.setEnabled(false);
        drug.txtQty.setEditable(false);
        drug.txtPrice.setEditable(false);
        
        drug.setVisible(true);
    }//GEN-LAST:event_txtDDActionPerformed

    private void txtADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtADActionPerformed
        Purchase_Info pi = new Purchase_Info();
        pi.setVisible(true);
    }//GEN-LAST:event_txtADActionPerformed

    private void txtEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEAActionPerformed
        empi.txtEA.setEnabled(true);
        empi.txtEU.setEnabled(false);
        empi.txtED.setEnabled(false);
        
        this.hide();
        empi.setVisible(true);
    }//GEN-LAST:event_txtEAActionPerformed

    private void txtBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBDActionPerformed
        Purchase p = new Purchase();
        this.hide();
        p.setVisible(true);
    }//GEN-LAST:event_txtBDActionPerformed

    private void txtEUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEUActionPerformed
        empi.txtEA.setEnabled(false);
        empi.txtEU.setEnabled(true);
        empi.txtED.setEnabled(false);
        
        this.hide();
        empi.setVisible(true);
    }//GEN-LAST:event_txtEUActionPerformed

    private void txtEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEDActionPerformed
        empi.txtEA.setEnabled(false);
        empi.txtEU.setEnabled(false);
        empi.txtED.setEnabled(true);
        
        empi.txtEI.setEditable(false);
        empi.txtEName.setEditable(false);
        empi.txtEPass.setEditable(false);
        empi.txtEAdd.setEditable(false);
        empi.txtEmail.setEditable(false);
        empi.txtEPhone.setEditable(false);
        empi.txtESal.setEditable(false);
        
        this.hide();
        empi.setVisible(true);
    }//GEN-LAST:event_txtEDActionPerformed

    private void txtSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSIActionPerformed
        Sell_Info si = new Sell_Info();
        si.setVisible(true);
        this.hide();
    }//GEN-LAST:event_txtSIActionPerformed

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtAD;
    private javax.swing.JButton txtBD;
    private javax.swing.JButton txtCA;
    private javax.swing.JButton txtCD;
    private javax.swing.JButton txtCU;
    private javax.swing.JButton txtCompany;
    private javax.swing.JButton txtDA;
    private javax.swing.JButton txtDD;
    private javax.swing.JButton txtDU;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtDay;
    private javax.swing.JButton txtDrugs;
    private javax.swing.JButton txtEA;
    private javax.swing.JButton txtED;
    private javax.swing.JButton txtEU;
    private javax.swing.JButton txtEmployee;
    private javax.swing.JLabel txtLA;
    private javax.swing.JLabel txtLN;
    private javax.swing.JTable txtMsgInfo;
    private javax.swing.JButton txtPurchase;
    private javax.swing.JButton txtSI;
    private javax.swing.JButton txtSales;
    private javax.swing.JLabel txtTime;
    private javax.swing.JLabel txtType;
    // End of variables declaration//GEN-END:variables
    
    public void TimeDate() {
               
        
        d = new Date();
        dd = new SimpleDateFormat("dd-MM-yyyy");
        txtDate.setText(dd.format(d));
        
        new Timer(0, (ActionEvent ae) -> {
            Date d1 = new Date();
            SimpleDateFormat dd1 = new SimpleDateFormat("hh:mm:ss a");
            txtTime.setText(dd1.format(d1));
        }).start();
        
        Date d2 = new Date();
        String dayWeekText = new SimpleDateFormat("EEEE").format(d);
        txtDay.setText("" +dayWeekText);
    }
    
    public void LoginAs(String uname){
        txtLA.setText("Admin");
        txtLN.setText(uname);
    }
    
    public void HideAll() {
        txtCA.setVisible(false);
        txtCU.setVisible(false);
        txtCD.setVisible(false);
        
        txtDA.setVisible(false);
        txtDU.setVisible(false);
        txtDD.setVisible(false);
        
        txtSI.setVisible(false);
        
        txtBD.setVisible(false);
        txtAD.setVisible(false);
        
        txtEA.setVisible(false);
        txtED.setVisible(false);
        txtEU.setVisible(false);
    }
    
    public void HideReq(int ch){
        switch(ch){
            case 1: txtDrugs.setEnabled(true);
                    txtDA.setVisible(false);
                    txtDU.setVisible(false);
                    txtDD.setVisible(false);
                    
                    txtSales.setEnabled(true);
                    txtSI.setVisible(false);
                    
                    txtPurchase.setEnabled(true);
                    txtBD.setVisible(false);
                    txtAD.setVisible(false);
                    
                    txtEmployee.setEnabled(true);
                    txtEA.setVisible(false);
                    txtED.setVisible(false);
                    txtEU.setVisible(false);
                    break;
            case 2: txtCompany.setEnabled(true);
                    txtCA.setVisible(false);
                    txtCU.setVisible(false);
                    txtCD.setVisible(false);
                    
                    
                    txtSales.setEnabled(true);
                    txtSI.setVisible(false);
                    
                    txtPurchase.setEnabled(true);
                    txtBD.setVisible(false);
                    txtAD.setVisible(false);
                    
                    txtEmployee.setEnabled(true);
                    txtEA.setVisible(false);
                    txtED.setVisible(false);
                    txtEU.setVisible(false);
                    break;
            case 3: txtCompany.setEnabled(true);
                    txtCA.setVisible(false);
                    txtCU.setVisible(false);
                    txtCD.setVisible(false);
                    
                    txtDrugs.setEnabled(true);
                    txtDA.setVisible(false);
                    txtDU.setVisible(false);
                    txtDD.setVisible(false);
                    
                    txtPurchase.setEnabled(true);
                    txtBD.setVisible(false);
                    txtAD.setVisible(false);
                    
                    txtEmployee.setEnabled(true);
                    txtEA.setVisible(false);
                    txtED.setVisible(false);
                    txtEU.setVisible(false);
                    break;
            case 4: txtCompany.setEnabled(true);
                    txtCA.setVisible(false);
                    txtCU.setVisible(false);
                    txtCD.setVisible(false);
                    
                    txtDrugs.setEnabled(true);
                    txtDA.setVisible(false);
                    txtDU.setVisible(false);
                    txtDD.setVisible(false);
                    
                    txtSales.setEnabled(true);
                    txtSI.setVisible(false);
                    
                    txtEmployee.setEnabled(true);
                    txtEA.setVisible(false);
                    txtED.setVisible(false);
                    txtEU.setVisible(false);
                    break;
            case 5: txtCompany.setEnabled(true);
                    txtCA.setVisible(false);
                    txtCU.setVisible(false);
                    txtCD.setVisible(false);
                    
                    txtDrugs.setEnabled(true);
                    txtDA.setVisible(false);
                    txtDU.setVisible(false);
                    txtDD.setVisible(false);
                    
                    txtSales.setEnabled(true);
                    txtSI.setVisible(false);
                    
                    txtPurchase.setEnabled(true);
                    txtBD.setVisible(false);
                    txtAD.setVisible(false);
                    break;
        }
    }
    
    public void DisplayMsg(){
        jPanel1.setVisible(true);
        try {
            String sql = "select * from Sell_Info";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            txtMsgInfo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
