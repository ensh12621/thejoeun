package day12;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{

	public BorderLayoutEx() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		Container cont = getContentPane();
		
		cont.setLayout(new BorderLayout(10, 5));
		
		cont.add(new JButton("상단"), BorderLayout.NORTH);
		cont.add(new JButton("하단"), BorderLayout.SOUTH);
		cont.add(new JButton("중앙"), BorderLayout.CENTER);
		cont.add(new JButton("왼쪽"), BorderLayout.WEST);
		cont.add(new JButton("오른쪽"), BorderLayout.EAST);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
