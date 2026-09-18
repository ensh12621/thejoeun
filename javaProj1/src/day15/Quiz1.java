package day15;

import java.awt.Container;

import javax.swing.JFrame;

public class Quiz1 extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public Quiz1() {
		setTitle("퀴즈");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		
		setLocation(300, 300);
		setSize(250, 300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Quiz1();
	}
}
