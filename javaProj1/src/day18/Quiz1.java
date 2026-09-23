package day18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Quiz1 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Quiz1() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();

		cont.setLayout(new FlowLayout());

		cont.add(new JLabel("학번: "));

		JTextField textField = new JTextField(15);
		cont.add(textField);

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyChar() < '0' || e.getKeyChar() > '9') {
					
					JOptionPane.showMessageDialog(null, e.getKeyChar() + "는 숫자가 아닙니다.", "경고", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		setLocation(350, 350);
		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Quiz1();
	}

}
