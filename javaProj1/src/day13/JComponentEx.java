package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public JComponentEx() {
		setTitle("컴포넌트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		
		cont.add(btn1);
		cont.add(btn2);
		cont.add(btn3);

		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.MAGENTA);
		btn1.setFont(new Font("궁서", Font.ITALIC, 20));
		
		btn2.setEnabled(false);
		
		setLocation(350, 350);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComponentEx();
	}
}
