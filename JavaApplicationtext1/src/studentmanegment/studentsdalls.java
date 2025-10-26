
package studentmanegment;

import Classs.Student;
import Classs.StudentsDetails;
import gui.DatePicker;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class studentsdalls extends javax.swing.JFrame {

   
    public studentsdalls() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentidtext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        studentsnametext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        brithdaytext = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        enrollmentdatetext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addresstext = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mobailnumbertext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmddegreeprogramComboBox = new javax.swing.JComboBox<>();
        selectbrithbutton = new javax.swing.JButton();
        selectenrollmentdatebutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        adddatabutton = new javax.swing.JButton();
        searchstudentbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(569, 385));
        setMinimumSize(new java.awt.Dimension(569, 385));
        setResizable(false);
        setSize(new java.awt.Dimension(690, 385));

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setFont(new java.awt.Font("CAC Futura Casual Bold", 1, 24)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
        jLabel1.setText("Student ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 86, 125, 23));

        studentidtext.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        studentidtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidtextActionPerformed(evt);
            }
        });
        jPanel1.add(studentidtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 82, 225, 30));

        jLabel2.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
        jLabel2.setText("Student Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 126, 125, 23));

        studentsnametext.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        jPanel1.add(studentsnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 123, 225, 32));

        jLabel3.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
        jLabel3.setText("Date Brith");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 166, 125, 23));

        brithdaytext.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        jPanel1.add(brithdaytext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 161, 225, 32));

        jLabel4.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
        jLabel4.setText("Enrollment Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 199, 132, 23));

        enrollmentdatetext.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        jPanel1.add(enrollmentdatetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 199, 225, 26));

        jLabel5.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 123, 23));

        addresstext.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        jPanel1.add(addresstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 225, 225, 32));

        jLabel6.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
        jLabel6.setText("Mobail Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 293, 123, 23));

        mobailnumbertext.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        jPanel1.add(mobailnumbertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 285, 225, 31));

        jLabel8.setFont(new java.awt.Font("Arabic Typesetting", 1, 24)); // NOI18N
        jLabel8.setText("Degree Program");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 23));

        cmddegreeprogramComboBox.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        cmddegreeprogramComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Degree Program", "computer Science", "Software Engineering", "Cyber Security", "Interactive Media", "Networking" }));
        jPanel1.add(cmddegreeprogramComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 334, 225, 28));

        selectbrithbutton.setFont(new java.awt.Font("augie", 1, 11)); // NOI18N
        selectbrithbutton.setText("Select Date");
        selectbrithbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbrithbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(selectbrithbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 164, -1, -1));

        selectenrollmentdatebutton.setFont(new java.awt.Font("augie", 1, 11)); // NOI18N
        selectenrollmentdatebutton.setText("Select Date");
        selectenrollmentdatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectenrollmentdatebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(selectenrollmentdatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 0));
        jLabel7.setText("Students Dalsl Form");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 11, 371, 29));

        adddatabutton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        adddatabutton.setText("Add Data");
        adddatabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddatabuttonActionPerformed(evt);
            }
        });
        jPanel1.add(adddatabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 374, 119, 26));

        searchstudentbutton.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 12)); // NOI18N
        searchstudentbutton.setText("Search Student ");
        searchstudentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchstudentbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(searchstudentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 377, 141, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentidtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidtextActionPerformed
        
    }//GEN-LAST:event_studentidtextActionPerformed

    private void selectbrithbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbrithbuttonActionPerformed
        DatePicker datePicker =new DatePicker(this);
        brithdaytext.setText(datePicker.setPickedDate());
        


        
    }//GEN-LAST:event_selectbrithbuttonActionPerformed

    private void selectenrollmentdatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectenrollmentdatebuttonActionPerformed
      DatePicker datePicker =new DatePicker(this);
      enrollmentdatetext.setText(datePicker.setPickedDate());
          
    }//GEN-LAST:event_selectenrollmentdatebuttonActionPerformed

    private void adddatabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddatabuttonActionPerformed
        String studentid=studentidtext.getText();
        String studentname=studentsnametext.getText();
        String brithday=brithdaytext.getText();
        String enrollmentdate=enrollmentdatetext.getText();
        String address=addresstext.getText();
        String mobailnumber =mobailnumbertext.getText();
        String degreeprogram=cmddegreeprogramComboBox.getSelectedItem().toString();
        
        Student student=new Student(studentid, studentname,brithday,enrollmentdate,address,mobailnumber,degreeprogram);
        
        StudentsDetails studentDetails =new StudentsDetails();
        
        studentDetails.addStudentTextFile(student);
        
        
    }//GEN-LAST:event_adddatabuttonActionPerformed

    private void searchstudentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchstudentbuttonActionPerformed
        try {
            String studentId = studentidtext.getText();
            StudentsDetails studentDetails =new StudentsDetails();        
            Student student = studentDetails.searchstudent(studentId);
            studentidtext.setText(student.getStudentId());
            studentsnametext.setText(student.getStudentName());
            brithdaytext.setText(student.getDob());
            enrollmentdatetext.setText(student.getEnrollmentDate());
            addresstext.setText(student.getAddress());
            mobailnumbertext.setText(student.getMobsilNumber());
            
            if(student.getDegreeProgram().equals("computer Science")){
                
                cmddegreeprogramComboBox.setSelectedIndex(2);
                
            }
            else if(student.getDegreeProgram().equals("Software Engineering")){
                
                cmddegreeprogramComboBox.setSelectedIndex(3);
                
            }
            else if(student.getDegreeProgram().equals("Cyber Security")){
                
                cmddegreeprogramComboBox.setSelectedIndex(4);
                
            }
            else if(student.getDegreeProgram().equals("Interactive Media")){
                
                cmddegreeprogramComboBox.setSelectedIndex(5);
                
            }
            else if(student.getDegreeProgram().equals("Networking")){
                
                cmddegreeprogramComboBox.setSelectedIndex(6);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(studentsdalls.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_searchstudentbuttonActionPerformed

    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentsdalls().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddatabutton;
    private javax.swing.JTextField addresstext;
    private javax.swing.JTextField brithdaytext;
    private javax.swing.JComboBox<String> cmddegreeprogramComboBox;
    private javax.swing.JTextField enrollmentdatetext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mobailnumbertext;
    private javax.swing.JButton searchstudentbutton;
    private javax.swing.JButton selectbrithbutton;
    private javax.swing.JButton selectenrollmentdatebutton;
    private javax.swing.JTextField studentidtext;
    private javax.swing.JTextField studentsnametext;
    // End of variables declaration//GEN-END:variables
}
