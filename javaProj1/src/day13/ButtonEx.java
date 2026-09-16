package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public ButtonEx() {

		setTitle("이미지 레이블");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		ImageIcon img1 = new ImageIcon("images/RYAN_1.jpg");
		ImageIcon img2 = new ImageIcon("images/RYAN_2.jpg");
		ImageIcon img3 = new ImageIcon("images/RYAN_3.jpg");
		
		Image resizeImg1 = img1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		Image resizeImg2 = img2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		Image resizeImg3 = img3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		
		img1 = new ImageIcon(resizeImg1);
		img2 = new ImageIcon(resizeImg2);
		img3 = new ImageIcon(resizeImg3);
		
		JButton btn = new JButton(img1);
		btn.setRolloverIcon(img2);
		btn.setPressedIcon(img3);
		cont.add(btn);
		
		setLocation(300, 300);
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}
