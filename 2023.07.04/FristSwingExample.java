import javax.swing.*;
public class FristSwingExample{

    public static void main(String []args){
        JFrame f = new JFrame();//creating instance of JFrame

        JButton b = new JButton("click");//creating instance of JButton

        b.setBounds(130,100,100,40);//x axis,y axis,width,height

        f.add(b);//Adding  button in Jframe

        f.setSize(400,500);//400 width and 500 height

        f.setLayout(null);//using no layout manager

        f.setVisible(true);//Making the frame visible

   
    }

}