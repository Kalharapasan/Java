class Student {
    int studentNumber;
    String name;
    
    Student(int studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }
    
    void display() {
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Name: " + name);
    }
}

class ITStudent extends Student {
    int mark1;
    int mark2;
    
    ITStudent(int studentNumber, String name, int mark1, int mark2) {
        super(studentNumber, name);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    
    void calculation() {
        int total = mark1 + mark2;
        double average = total / 2.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
    
    void display() {
        super.display();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        calculation();
    }
}

class TestStudent {
    public static void main(String[] args) {
        ITStudent obj1 = new ITStudent(12345, "John Doe", 80, 90);
        obj1.display();
    }
}
