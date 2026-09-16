package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerMotionEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public MouseListenerMotionEx() {

		setTitle("마우스 모션");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());

		JLabel label = new JLabel("Mouse Event!");
		cont.add(label);

		cont.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				label.setText("mouseDragged! " + e.getX() + ", " + e.getY());
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				label.setText("mouseMoved!" + e.getX() + ", " + e.getY());
			}
		});
		
		cont.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText("드래그 끝!");
			}
		});

		setLocation(350, 350);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListenerMotionEx();
	}

}
