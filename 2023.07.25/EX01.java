import javax.swing.*;

public class EX01 extends JFrame{

    JFrame f;

    EX01(){


        JButton PrintButton = new JButton("Print");
        PrintButton.setBounds(10,25,65,50);
        add(PrintButton);

        JButton PlayButton = new JButton("Play");
        PlayButton.setBounds(78,25,65,50);
        add(PlayButton);

        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(146,25,65,50);
        add(ExitButton);




        setSize(250,150);
        setLayout(null);
        setVisible(true);
    }

    public static void main (String []args){

        new EX01();

    }

}