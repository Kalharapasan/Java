
package Classs;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.ScriptingFunctions.readLine;


public class StudentsDetails {
    
    private static final String FILEPATH = "E:/Software_Project/JAVA/BASICS/JavaApplicationtext1/src/Classs/StudentsData.txt";
    FileWriter fw =null;
    BufferedWriter bw=null;
   
   
    
    public boolean addStudentTextFile(Student student){
        try {
            PrintWriter out=null;
            
            String studentData = student.getStudentId()+","+student.getStudentName()+","+student.getDob()+","+student.getEnrollmentDate()+ ","+student.getAddress()+","+student.getMobsilNumber()+","+student.getDegreeProgram();
            out =new PrintWriter(new BufferedWriter ( new FileWriter(FILEPATH,true)));
            out.println(studentData);
            out.close();
            JOptionPane.showMessageDialog(null, "Details are Add");
            
        } catch (IOException ex) {
            Logger.getLogger(StudentsDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
        
        
    }
    
    public Student searchstudent(String studentId) throws IOException{
        
         Student student=null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
           BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream));
            
           String readLine;
           while ((readLine =bufferedReader.readLine()) != null){
               
               String [] detailsStudent = readLine.split(",");
               if(studentId.equals(detailsStudent[0])){
                   student = new Student();
                   student.setStudentId(detailsStudent[0]);
                   student.setStudentName(detailsStudent[1]);
                   student.setDob(detailsStudent[2]);
                   student.setEnrollmentDate(detailsStudent[3]);
                   student.setAddress(detailsStudent[4]);
                   student.setMobsilNumber(detailsStudent[5]);
                   student.setDegreeProgram(detailsStudent[6]);
                   JOptionPane.showMessageDialog(null, "Match Found");
               }
               
              
  
           }
           
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(StudentsDetails.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        return student;
    
    }

    public Student searchstudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
