package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelEx extends JFrame{

	private static final long serialVersionUID = 1L;

	public JLabelEx() {

		setTitle("이미지 레이블");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		ImageIcon image = new ImageIcon("images/beauty.jpg");
		JLabel label = new JLabel(image);
		cont.add(label);
		
		setLocation(350,350);
		setSize(600, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JLabelEx();
	}
}
