package day12;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {

	private static final long serialVersionUID = 1L;

	public AnonymousClassListener() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());

		JButton btn = new JButton("클릭");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("클릭 됨!");
				if (btn.getText().equals("클릭")) {
					btn.setText("Action");
				} else {
					btn.setText("클릭");
				}
			}
		});
		cont.add(btn);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}
}
