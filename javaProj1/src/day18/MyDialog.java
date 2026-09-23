package day18;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyDialog extends JDialog{

	private static final long serialVersionUID = 1L;
	
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");

	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		
		setTitle("첫 번째 화면");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		add(tf);
		add(okButton);
		
		okButton.addActionListener( e -> {
			setVisible(false);
		});
		
		setLocation(350, 350);
		setSize(300, 300);
	}
}
