package day12;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutEx1 extends JFrame {

	private static final long serialVersionUID = 1L;

	public NullLayoutEx1() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();

		cont.setLayout(null);
		
		JButton btn = new JButton("버튼");
//		btn.setSize(200, 50);
//		btn.setLocation(15, 15);
		btn.setBounds(15, 15, 200, 50);
		cont.add(btn);
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullLayoutEx1();
	}
}
