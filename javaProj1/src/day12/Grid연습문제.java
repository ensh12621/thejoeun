package day12;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid연습문제 extends JFrame{

	private static final long serialVersionUID = 1L;

	public Grid연습문제() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();

		cont.setLayout(new GridLayout(4, 3));
		
		String arr[] = {"7", "8", "9", "x", 
						"4", "5", "6", "-",
						"1", "2", "3", "+",
						"+/-", "0", ".", "="};
		
		for(int i=0; i<arr.length; i++) {
			JButton btn = new JButton((String.valueOf(arr[i])));
			cont.add(btn);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Grid연습문제();
	}
}
