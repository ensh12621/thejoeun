package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI복습1 extends JFrame{

	public GUI복습1() {

		setTitle("복습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cont = getContentPane();
		
//		cont.setLayout(new FlowLayout());
		cont.setLayout(null);
		
		JButton btn = new JButton("버튼");
//		btn.setSize(100, 20);
//		btn.setLocation(30, 30);
		btn.setBounds(30, 30, 100, 20);
		cont.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cont.setBackground(Color.cyan);
				
			}
		});
		
		
		setLocation(500,500);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GUI복습1();
		
	}
}
