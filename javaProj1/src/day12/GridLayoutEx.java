package day12;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public GridLayoutEx() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();

		cont.setLayout(new GridLayout(4, 2, 5, 5));
		
		cont.add(new JLabel("이름"));
		cont.add(new JTextField());
		cont.add(new JLabel("학번"));
		cont.add(new JTextField());
		cont.add(new JLabel("학과"));
		cont.add(new JTextField());
		cont.add(new JLabel("과목"));
		cont.add(new JTextField());
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {

		new GridLayoutEx();
	}
}
