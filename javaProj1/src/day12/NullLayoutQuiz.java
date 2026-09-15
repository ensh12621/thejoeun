package day12;

import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutQuiz extends JFrame {

	private static final long serialVersionUID = 1L;

	public NullLayoutQuiz() {

		Random random = new Random();
		
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(null);
		
		for(int i=0; i<10; i++) {
			JButton btn = new JButton(String.valueOf((i+1)));
			
			int locX = random.nextInt(640);
			int locY = random.nextInt(640);
			
			btn.setSize(50, 20);
			btn.setLocation(locX, locY);
			cont.add(btn);
		}
		
		cont.setLayout(null);

		setSize(700, 700);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullLayoutQuiz();
	}
}
