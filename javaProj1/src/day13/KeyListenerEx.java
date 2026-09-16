package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{

	private static final long serialVersionUID = 1L;

	public KeyListenerEx() {

		setTitle("키 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		JLabel arr[] = new JLabel[3];
		
		arr[0] = new JLabel("keyCode");
		arr[1] = new JLabel("keyChar");
		arr[2] = new JLabel("getText");
		
		for(int i=0; i<arr.length; i++) {
			cont.add(arr[i]);
			arr[i].setOpaque(true);
			arr[i].setBackground(Color.YELLOW);
		}
		

		cont.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				arr[0].setText(String.valueOf(e.getKeyCode()));
				arr[1].setText(String.valueOf(e.getKeyChar()));
				arr[2].setText(KeyEvent.getKeyText(e.getKeyCode()));
				
				JLabel label = new JLabel("new text");
				cont.add(label);
				
				JButton btn = new JButton("zz");
				cont.add(btn);
			}
		});
		
		
	
		
		setLocation(350,350);
		setSize(300, 300);
		setVisible(true);
		
		cont.setFocusable(true);
		cont.requestFocus();
		
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
