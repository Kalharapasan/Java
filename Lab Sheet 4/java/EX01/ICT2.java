class ICT {
    String regno;
    String indexno;
    
    ICT() {
        regno = "SEU/IS/20/ICT/003";
        indexno = "ICT 150";
    }
}

class Student {
    String regno;
    String indexno;
    
    void insertStudentRecord(String regno, String indexno) {
        this.regno = regno;
        this.indexno = indexno;
    }
    
    void displayStudentDetails() {
        System.out.println("Registration Number: " + regno);
        System.out.println("Index Number: " + indexno);
    }
}

class Main {
    public static void main(String[] args) {
        ICT exam = new ICT();
        
        Student john = new Student();
        john.insertStudentRecord("SEU/IS/20/ICT/001", "ICT 101");
        john.displayStudentDetails();
        
        Student mich = new Student();
        mich.insertStudentRecord("SEU/IS/20/ICT/002", "ICT 102");
        mich.displayStudentDetails();
    }
}
