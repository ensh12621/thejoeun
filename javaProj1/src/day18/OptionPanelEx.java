package day18;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OptionPanelEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public OptionPanelEx() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());

		JButton inputBtn = new JButton("INPUT");
		JButton confirmBtn = new JButton("CONFIRM");
		JButton messageBtn = new JButton("MESSAGE");
		JTextField textField = new JTextField(15);

		cont.add(inputBtn);
		cont.add(confirmBtn);
		cont.add(messageBtn);
		cont.add(textField);

		inputBtn.addActionListener(e -> {
			String input = JOptionPane.showInputDialog("아무거나 입력!");
			if (input != null) {
				textField.setText(input);
			}
		});
		
		confirmBtn.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, 
					"정말 삭제?", "Confirm", 
					JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.CLOSED_OPTION) {
				textField.setText("닫았음");
			}else if(result == JOptionPane.YES_OPTION){
				textField.setText("YES 선택함");
			}else {
				textField.setText("NO 선택함");
			}
		});
		
		messageBtn.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
		});
		

		setLocation(350, 350);
		setSize(600, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new OptionPanelEx();
	}

}
