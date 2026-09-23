package day18;

import java.awt.Container;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	public MyFrame() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		
		setLocation(350, 350);
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	} 
	
}
