package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public TextAreaEx() {

		setTitle("체크박스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("입력 후 <Enter> 키를 입력해주세요.");
		JTextField textField = new JTextField(20);
		JTextArea textArea = new JTextArea(7, 20);
		textArea.setEditable(false);
		JScrollPane scroll = new JScrollPane(textArea);
		
		cont.add(label);
		cont.add(textField);
		cont.add(scroll);
		
		textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField field = (JTextField)e.getSource();
				String input = field.getText();
				textArea.append(input + "\n");
				field.setText("");
				
				
			}
		});
		
		
		setLocation(300, 300);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextAreaEx();
	}
}
