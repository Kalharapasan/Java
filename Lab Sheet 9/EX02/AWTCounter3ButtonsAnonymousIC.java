import javax.swing.*;
import java.awt.event.*;

class GUI {
  
  int num =0;
  String text;

  void  Count_up(){
    num =num+1;
    text =String.valueOf(num);
    
  }
  void Count_Dwon(){
    num =num-1;
    text =String.valueOf(num);
   
  }
  GUI (){
    


   JFrame Frame= new JFrame("AWT Counter");
  
   JLabel Label=new JLabel("Counter");
   Label.setBounds(10,15, 50,30);

   JTextField text_Box=new JTextField("0");
   text_Box.setBounds(65,20, 80,20);
   

   JButton  Count_up_Button=new JButton("Count up");
    Count_up_Button.setBounds(150,15,100,30);
   
   Count_up_Button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          Count_up();  
          text_Box.setText(text);

            
        } 
      });

   JButton  Count_Dwon_Button=new JButton("Count Dwon");
   Count_Dwon_Button.setBounds(260,15,130,30);

   Count_Dwon_Button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){

          Count_Dwon();
          text_Box.setText(text);

            
        } 
      });

   JButton Reset_Button=new JButton("Reset");
   Reset_Button.setBounds(400,15,100,30);
   Reset_Button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){  
          num =0;
          text_Box.setText("0");

            
        } 
      });
  

  Frame.add(Label); 
  Frame.add(text_Box);
  Frame.add(Count_up_Button);
  Frame.add(Count_Dwon_Button);
  Frame.add(Reset_Button);

  Frame.setSize(550,100);

  Frame.setLayout(null);

  Frame.setVisible(true);
 

  }
  
 
}

class  AWTCounter3ButtonsAnonymousIC extends GUI{
 public static void main(String[] args) {
  AWTCounter3ButtonsAnonymousIC  JFrame =new AWTCounter3ButtonsAnonymousIC ();
 }
}
