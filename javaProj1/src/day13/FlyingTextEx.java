package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public FlyingTextEx() {
		setTitle("키 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(null);

		JLabel label = new JLabel("Hello");
		label.setBounds(50, 50, 100, 20);
		cont.add(label);

		final int FLYING_UNIT = 10;

		cont.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
//				System.out.println("키 코드: " + keyCode);
//				System.out.println("상수: " + KeyEvent.VK_RIGHT);

				if (keyCode == KeyEvent.VK_LEFT) {
					int x = label.getX() - FLYING_UNIT;
					label.setLocation(x, label.getY());
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					int x = label.getX() + FLYING_UNIT;
					label.setLocation(x, label.getY());
				} else if (keyCode == KeyEvent.VK_UP) {
					int y = label.getY() - FLYING_UNIT;
					label.setLocation(label.getX(), y);
				} else if (keyCode == KeyEvent.VK_DOWN) {
					int y = label.getY() + FLYING_UNIT;
					label.setLocation(label.getX(), y);
				}
			}
		});

		cont.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cont.requestFocus();
			}
		});

		setLocation(350, 350);
		setSize(300, 300);
		setVisible(true);

		cont.setFocusable(true);
		cont.requestFocus();
	}

	public static void main(String[] args) {
		new FlyingTextEx();
	}
}
