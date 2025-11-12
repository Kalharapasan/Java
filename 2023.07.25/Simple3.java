import javax.swing.*;

public class Simple3 extends JFrame{

    JFrame f;

    Simple3(){
        JButton b = new JButton("Click");
        b.setBounds(130,100,100,50);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(false);
    }

    public static void main (String []args){

        new Simple3();

    }

}