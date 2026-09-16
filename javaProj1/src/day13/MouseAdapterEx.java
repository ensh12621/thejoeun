package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame{

	private static final long serialVersionUID = 1L;

	public MouseAdapterEx() {

		Random random = new Random();

		setTitle("마우스 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(null);
		
		JLabel label = new JLabel("Hello");
		label.setBounds(30, 30, 70, 50);
		cont.add(label);
		
		cont.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				label.setLocation(e.getX(), e.getY());
				
				int r = random.nextInt(255) + 1;
				int g = random.nextInt(255) + 1;
				int b = random.nextInt(255) + 1;
				
				cont.setBackground(new Color(r, g, b));
			}
		});

		setLocation(350,350);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseAdapterEx();
	}
}
