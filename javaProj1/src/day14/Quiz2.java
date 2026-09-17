package day14;

import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private int removeIdx = 1;

	public Quiz2() {

		Random random = new Random();

		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(null);

		playGame(random, cont);

		setSize(700, 700);
		setVisible(true);
	}

	private void playGame(Random random, Container cont) {
		removeIdx = 1;

		for (int j = 0; j < 10; j++) {
			JButton newBtn = new JButton(String.valueOf((j + 1)));
			int locX = random.nextInt(640);
			int locY = random.nextInt(640);
			newBtn.setSize(50, 20);
			newBtn.setLocation(locX, locY);
			cont.add(newBtn);

			newBtn.addActionListener(e -> {
				JButton clicked = (JButton) e.getSource();

				int val = Integer.parseInt(clicked.getText());

				if (val == removeIdx) {
					cont.remove(clicked);
					repaint();
					removeIdx++;
				}

//				System.out.println(removeIdx);
				if (removeIdx == 11) {
					playGame(random, cont);
				}
			});
		}

	}

	public static void main(String[] args) {
		new Quiz2();
	}
}
