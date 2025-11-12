package tutorialGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class from1 {

	private JFrame frame;
	//private JFrame  label ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					from1 window = new from1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public from1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 564, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 35));
		label.setBounds(23, 11, 504, 121);
		frame.getContentPane().add(label);
		////////////////////////////////////////clickButton////////////////////////////////////////////
		JButton clickButton = new JButton("ClickME");
		clickButton.setFont(new Font("Tahoma", Font.BOLD, 46));
		clickButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"My frist java Aplication");
				System.out.println("My frist java Aplication");
				label.setText("My frist java Aplication");
			}
		});
		
		clickButton.setBounds(172, 143, 248, 78);
		frame.getContentPane().add(clickButton);
		
		
	}
}
