package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz1 extends JFrame {

	public Quiz1() {
		setTitle("컴포넌트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());

		JButton[] btnArr = new JButton[5];
		int[] valArr = new int[5];
		
		for(int i=0; i<btnArr.length; i++) {
			btnArr[i] = new JButton(String.valueOf(valArr[i]));
			cont.add(btnArr[i]);
			
			final int j = i;
			
			btnArr[j].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int val = ++valArr[j];
					btnArr[j].setText(String.valueOf(val));
				}
			});
		}
		
		
		
		

		setLocation(350, 350);
		setSize(450, 100);
		setVisible(true);
	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Quiz1();
	}
}
