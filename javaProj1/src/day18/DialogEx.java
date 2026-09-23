package day18;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DialogEx extends JFrame{

	private static final long serialVersionUID = 1L;

	public DialogEx() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		
		JButton btn = new JButton("다이얼로그 호출!");
		cont.add(btn);

		MyDialog dialog = new MyDialog(this, "타이틀!!");
		
		
		btn.addActionListener( e -> {
			dialog.setVisible(true);
		});
		
		setLocation(350, 350);
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new DialogEx();
	} 
	
}
