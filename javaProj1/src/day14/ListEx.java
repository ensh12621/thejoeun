package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public ListEx() {
		setTitle("리스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		String[] fruits = {"apple", "banana", "kiwi", "mango", "peach" , "berry", "strawberry", "blackberry"};
		JList<String> list = new JList<>(fruits);
		JScrollPane scroll = new JScrollPane(list);
		cont.add(scroll);
		
		fruits[fruits.length-1] = "zzz";
		
		setLocation(300, 300);
		setSize(250, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListEx();
	}
}
