
package Classs;


public class Student {
    String studentId;
    String studentName;
    String dob;
    String enrollmentDate;
    String address;
    String mobsilNumber;
    String degreeProgram;

    public Student(String studentId, String studentName, String dob, String enrollmentDate, String address, String mobsilNumber, String degreeProgram) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dob = dob;
        this.enrollmentDate = enrollmentDate;
        this.address = address;
        this.mobsilNumber = mobsilNumber;
        this.degreeProgram = degreeProgram;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

   
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobsilNumber() {
        return mobsilNumber;
    }

    public void setMobsilNumber(String mobsilNumber) {
        this.mobsilNumber = mobsilNumber;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }
    
    
}
