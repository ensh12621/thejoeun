package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx1 extends JFrame {

	private static final long serialVersionUID = 1L;

	public PanelEx1() {

		setTitle("PanelEx1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());

		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		panel2.setLayout(new GridLayout(2, 1));
		
		panel1.setBackground(Color.YELLOW);
		panel2.setBackground(Color.CYAN);

		panel1.add(new JButton("버튼1"));
		panel1.add(new JButton("버튼2"));

		panel2.add(new JButton("버튼3"));
		panel2.add(new JButton("버튼4"));
		
		
		cont.add(panel1);
		cont.add(panel2);
		
		setLocation(300, 300);
		setSize(250, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new PanelEx1();
	}
}
