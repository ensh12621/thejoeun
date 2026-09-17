package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListChangeEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public ListChangeEx() {

		setTitle("리스트 추가");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());

		JTextField textField = new JTextField(20);
		
		Vector<String> vector = new Vector<>();
		vector.add("홍길동");
		
		JList<String> list = new JList<>(vector);
		list.setVisibleRowCount(5);
		list.setFixedCellWidth(100);
		
		JScrollPane scroll = new JScrollPane(list);
		
		textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField field = (JTextField)e.getSource();
				vector.add(field.getText());
				list.setListData(vector);
				textField.setText("");
			}
		});

		
		cont.add(textField);
		cont.add(scroll);
		
		
		
		setLocation(300, 300);
		setSize(250, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListChangeEx();
	}
}
