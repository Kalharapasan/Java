import javax.swing.*;

public class EX04 extends JFrame{

    JFrame f;

    EX04(){


        JButton PrintButton = new JButton("Print");
        PrintButton.setBounds(10,10,65,50);
        add(PrintButton);

        JButton PlayButton = new JButton("Play");
        PlayButton.setBounds(10,62,65,50);
        add(PlayButton);

        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(10,113,65,50);
        add(ExitButton);




        setSize(70,210);
        setLayout(null);
        setVisible(true);
    }

    public static void main (String []args){

        new EX04();

    }

}