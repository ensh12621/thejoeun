package day18;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex17 extends JFrame{

	private static final long serialVersionUID = 1L;

	public Ex17() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		
		
		JButton btn = new JButton("Show Modal Dialog");
		Ex17_dialog dialog = new Ex17_dialog(this, "다이얼로그");
		
		btn.addActionListener(e -> {

			dialog.setVisible(true);
			
			String text = dialog.getInput();
			
			if(text == null) {
				return;
			}
			
			System.out.println(text);
			
			JButton btn1 = (JButton)e.getSource();
			btn1.setText(text);
			
		});
		
		cont.add(btn);
		
		
		
		setLocation(350, 350);
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Ex17();
	} 
	
}
