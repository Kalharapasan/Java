import javax.swing.*;

public class Simple2 extends JFrame{

    JFrame f;

    Simple2(){
        JButton b = new JButton("Click");
        b.setBounds(130,100,100,50);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main (String []args){

        new Simple2();

    }

}