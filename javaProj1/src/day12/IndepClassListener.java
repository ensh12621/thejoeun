package day12;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭 됨!");
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("클릭")) {
			btn.setText("Action");
		}else {
			btn.setText("클릭");
		}
	}
	
}

public class IndepClassListener extends JFrame {

	private static final long serialVersionUID = 1L;

	public IndepClassListener() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		JButton btn = new JButton("클릭");
		btn.addActionListener(new MyActionListener());
		cont.add(btn);
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
	}

}
