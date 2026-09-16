package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckboxEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public CheckboxEx() {

		setTitle("체크박스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout( new FlowLayout());
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		
		ImageIcon img1 = new ImageIcon("images/cherry.jpg");
		ImageIcon img2 = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox cherry = new JCheckBox("체리", img1);
		cherry.setSelectedIcon(img2);
		cherry.setBorderPainted(true);
		cont.add(cherry);
		
		
		
		
		cont.add(apple);
		cont.add(pear);
		
		
		
		setLocation(300, 300);
		setSize(350, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckboxEx();
	}
}
