package day13;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx2 extends JFrame {

	private static final long serialVersionUID = 1L;

	public MouseAdapterEx2() {

		//Random random = new Random();

		setTitle("마우스 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(null);

		JLabel label = new JLabel("Hello");
		label.setBounds(30, 30, 70, 50);
		cont.add(label);

		cont.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					label.setLocation(e.getX(), e.getY());
				}
				
				if(e.getButton() == MouseEvent.BUTTON3) {
					label.setLocation(e.getX(), e.getY());
				}
			}
		});

		setLocation(350, 350);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseAdapterEx2();
	}
}
