package day13;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {

	public MouseListenerEx() {

		setTitle("마우스 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(null);
		
		JLabel label = new JLabel("Hello");
		label.setBounds(30, 30, 70, 50);
		cont.add(label);
		
		
		cont.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getX() + ", " + e.getY());
				label.setLocation(e.getX(), e.getY());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("마우스 ㅂㅂ");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("마우스 커서 올라옴");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		

		

		setLocation(500, 500);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
