package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioEx1 extends JFrame {

	private static final long serialVersionUID = 1L;

	public RadioEx1() {
		setTitle("라디오 버튼");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리");
		
		group.add(apple);
		group.add(pear);
		group.add(cherry);
		
		cont.add(apple);
		cont.add(pear);
		cont.add(cherry);
		
		setLocation(300, 300);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioEx1();
	}
}
