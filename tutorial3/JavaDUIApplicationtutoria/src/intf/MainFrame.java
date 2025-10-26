
package intf;

import code.XDBconnect;
import code.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class MainFrame extends javax.swing.JFrame {

    Connection conn =null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    public MainFrame() {
        initComponents();
        conn = DBconnect.ConnecDB();
        tableload();
    }
    public void tableload(){
        try {
            String sql = "SELECT id AS ID,fname AS FRISTNAME,lname AS LASTNAME,age AS AGE,grade AS GRADE,adders AS ADDERS,pnumber AS PHONENUMBER FROM students";
            pst=conn.prepareCall(sql);
            rs=pst.executeQuery();
            sdataTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void tabeldataselect(){
        int r = sdataTable.getSelectedRow();
        String id = sdataTable.getValueAt(r,0).toString();
        String fname = sdataTable.getValueAt(r,1).toString();
        String lname = sdataTable.getValueAt(r,2).toString();
        String age = sdataTable.getValueAt(r,3).toString();
        String grade = sdataTable.getValueAt(r,4).toString();
        String adders = sdataTable.getValueAt(r,5).toString();
        String pnumber = sdataTable.getValueAt(r,6).toString();
        
        idText.setText(id);
        fnameText.setText(fname);
        lnameText.setText(lname);
        ageText.setText(age);
        gardeComboBox.setSelectedItem(grade);
        addersText.setText(adders);
        pnumberText.setText(pnumber);
            
        
        
    }
    
    public void searchdata(){
        
        String search = searchText.getText();
        try{
            String sql = "SELECT * FROM students WHERE  fname LIKE '%"+search+"%' OR id LIKE '%"+search+"%'  ";
            pst=conn.prepareCall(sql);
            rs=pst.executeQuery();
            sdataTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void updatedata(){
       
        
       String Id = idText.getText();
       String  Fname = fnameText.getText();
       String Lname = lnameText.getText();
       String  Age = ageText.getText();
       String  Grade=gardeComboBox.getSelectedItem().toString();
       String Adders = addersText.getText();
       String Pnumber= pnumberText.getText();
       try{
            String sql = "UPDATE students SET fname='"+Fname+"',lname='"+Lname+"',age='"+Age+"',grade='"+Grade+"',adders='"+Adders+"',pnumber='"+Pnumber+"' WHERE id='"+Id+"'";
            pst =conn.prepareStatement(sql);
            pst.execute();
            tableload();
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void clear(){
        searchText.setText("");
        idText.setText("");
        fnameText.setText("");
        lnameText.setText("");
        ageText.setText("");
        gardeComboBox.setSelectedIndex(0);
        addersText.setText("");
        pnumberText.setText("");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        searchText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnumberText = new javax.swing.JTextField();
        fnameText = new javax.swing.JTextField();
        lnameText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        addersText = new javax.swing.JTextField();
        gardeComboBox = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        idText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sdataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 102))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchText.setToolTipText("");
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });
        jPanel3.add(searchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 60));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Enter"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Phone Number");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Frist Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Age");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Grade");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Adderas");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, 20));
        jPanel4.add(pnumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, -1));

        fnameText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(fnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 170, -1));

        lnameText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(lnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));

        ageText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });
        jPanel4.add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, -1));
        jPanel4.add(addersText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, -1));

        gardeComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gardeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        gardeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gardeComboBoxActionPerformed(evt);
            }
        });
        jPanel4.add(gardeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 150, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, 290));

        jPanel6.setBackground(new java.awt.Color(255, 255, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, -1));

        InsertButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        InsertButton.setText("Insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });
        jPanel6.add(InsertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateButton.setText("Update");
        jPanel6.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel6.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 70, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 230, 110));
        jPanel2.add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 50, 20));

        jLabel8.setText("ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 30, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 560));

        sdataTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        sdataTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sdataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        sdataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdataTableMouseClicked(evt);
            }
        });
        sdataTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sdataTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sdataTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(sdataTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 490, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gardeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gardeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gardeComboBoxActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        clear();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int check =JOptionPane.showConfirmDialog(null,"Do you went to delete");
        if (check == 0){
            
             String Id = idText.getText();
        try{
            
            String sql = "DELETE FROM students WHERE id='"+Id+"'";
            pst =conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Delete");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        tableload();
        clear();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        
       String  Fname;
       String  Lname;
       int  Age;
       int Grade;
       String Adders;
       int Pnumber;
       
       Fname = fnameText.getText();
       Lname = lnameText.getText();
       Age = Integer.parseInt(ageText.getText());
       Grade=Integer.parseInt(gardeComboBox.getSelectedItem().toString());
       Adders = addersText.getText();
       Pnumber=Integer.parseInt( pnumberText.getText());
       
        try {
            String sql ="INSERT INTO students(fname,lname,age,grade,adders,pnumber)VALUES('"+Fname+"','"+Lname+"','"+Age+"','"+Grade+"','"+Adders+"','"+Pnumber+"')";
            pst =conn.prepareStatement(sql);
            pst.execute();
            tableload();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        clear();
        
        
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void sdataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdataTableMouseClicked
        tabeldataselect();
        
        
    }//GEN-LAST:event_sdataTableMouseClicked

    private void sdataTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdataTableKeyPressed
        tabeldataselect();
    }//GEN-LAST:event_sdataTableKeyPressed

    private void sdataTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdataTableKeyReleased
       
        tabeldataselect();
    }//GEN-LAST:event_sdataTableKeyReleased

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
       
        searchdata();
        
    }//GEN-LAST:event_searchTextKeyReleased

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton InsertButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField addersText;
    private javax.swing.JTextField ageText;
    private javax.swing.JTextField fnameText;
    private javax.swing.JComboBox<String> gardeComboBox;
    private javax.swing.JLabel idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnameText;
    private javax.swing.JTextField pnumberText;
    private javax.swing.JTable sdataTable;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}
