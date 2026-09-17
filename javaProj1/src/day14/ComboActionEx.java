package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboActionEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public ComboActionEx() {

		setTitle("ComboBox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());

		String[] fruits = { "apple", "banana", "kiwi", "mango", "peach", "berry", "strawberry", "blackberry" };

		JComboBox<String> comboBox = new JComboBox<>(fruits);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox target = (JComboBox)e.getSource();
				System.out.println(target.getSelectedIndex());
				System.out.println(target.getSelectedItem());
				
			}
		});
		cont.add(comboBox);

		setLocation(300, 300);
		setSize(250, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}
}
