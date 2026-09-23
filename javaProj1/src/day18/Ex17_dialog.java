package day18;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ex17_dialog extends JDialog{

	private static final long serialVersionUID = 1L;

	private JTextField tf;
	
	public Ex17_dialog(JFrame frame, String title) {
		super(frame, title, true);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		tf = new JTextField("Press Me");
		cont.add(tf);
		
		JButton btn = new JButton("Press Me!");
		cont.add(btn);
		
		setLocation(350, 350);
		setSize(300, 300);
	}
	
	public String getInput() {
		if(tf.getText().length() == 0) {
			return null;
		}
		return tf.getText();
	}
}
