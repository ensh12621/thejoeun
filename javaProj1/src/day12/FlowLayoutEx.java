package day12;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	
	public FlowLayoutEx() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		
		cont.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		JButton btn1 = new JButton("첫번째버튼");
		cont.add(btn1);
		
		JButton btn2 = new JButton("두번째버튼");
		cont.add(btn2);
		
		JButton btn3 = new JButton("세번째버튼");
		cont.add(btn3);
		
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	} 
	
}
