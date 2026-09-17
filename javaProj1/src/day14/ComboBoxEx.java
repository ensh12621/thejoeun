package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public ComboBoxEx() {


		setTitle("ComboBox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		String[] fruits = {"apple", "banana", "kiwi", "mango", "peach" , "berry", "strawberry", "blackberry"};
		JComboBox<String> comboBox = new JComboBox<>(fruits);
		cont.add(comboBox);
		
		JComboBox<String> comboBox2 = new JComboBox<>();
		for(String fruit : fruits) {
			comboBox2.addItem(fruit);
		}
		cont.add(comboBox2);
		
		
		setLocation(300, 300);
		setSize(250, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxEx();
	}
}
