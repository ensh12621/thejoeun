package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Repaint extends JFrame {

	private static final long serialVersionUID = 1L;

	public Repaint() {

		setTitle("첫번쨰 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(null);
		
		cont.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				JLabel label = new JLabel("hello");
				label.setSize(50, 30);
				label.setLocation(30, 30);
				cont.add(label);
				cont.revalidate();
				cont.repaint();
			}
		});
		
		
	
		
		setLocation(350,350);
		setSize(300, 300);
		setVisible(true);
		
		cont.setFocusable(true);
		cont.requestFocus();
	}

	public static void main(String[] args) {

		new Repaint();
	}
}
