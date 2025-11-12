import javax.swing.*;
import java.awt.event.*;  

public class EX02 extends JFrame{

    JFrame f;

    EX02(){


        JButton PrintButton = new JButton("Print");
        PrintButton.setBounds(10,25,65,50);

        
        PrintButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                 System.out.println("Print");  
                }  
        }); 

        add(PrintButton);

        JButton PlayButton = new JButton("Play");
        PlayButton.setBounds(78,25,65,50);

        
        PlayButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                 System.out.println("Play");  
                }  
        }); 

        add(PlayButton);

        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(146,25,65,50);

        ExitButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                 System.out.println("Exit");  
                }  
        });  


        add(ExitButton);




        setSize(250,150);
        setLayout(null);
        setVisible(true);
    }

    public static void main (String []args){

        new EX02();

    }

}