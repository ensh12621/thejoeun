package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MakeButton extends JFrame {

	private static final long serialVersionUID = 1L;

	public MakeButton() {

		Random random = new Random();
		
		setTitle("첫번쨰 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(null);

		cont.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				//System.out.println(e.getKeyCode());
				
				if(e.getKeyCode() == KeyEvent.VK_F1) {
					JButton btn = new JButton("버튼");
					int x = random.nextInt(300 - 100) +1;
					int y = random.nextInt(300 - 30) +1;
					btn.setLocation(x, y);
					btn.setSize(100, 30);
					cont.add(btn);
					cont.revalidate();
					cont.repaint();
				}
			}
		});
	
		
		setLocation(350,350);
		setSize(300, 300);
		setVisible(true);
		
		cont.setFocusable(true);
		cont.requestFocus();
	}
	
	public static void main(String[] args) {
		new MakeButton();
	}
}
