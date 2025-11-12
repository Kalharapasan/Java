import javax.swing.*;

public class Simple1 extends JFrame{

    JFrame f;

    Simple1(){
        JButton b = new JButton("Click");
        b.setBounds(130,100,100,50);
        add(b);
        setSize(1000,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main (String []args){

        new Simple1();

    }

}