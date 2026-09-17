package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz1 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Quiz1() {

		setTitle("ComboBox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();

		JPanel north = new JPanel();
		north.setBackground(Color.YELLOW);
		north.add(new JLabel("금액"));
		JTextField priceField = new JTextField(10);
		north.add(priceField);
		JButton calculateBtn = new JButton("계산");

		north.add(calculateBtn);
		cont.add(north, BorderLayout.NORTH);

		String[] labelArr = { "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
		JTextField[] fieldArr = new JTextField[labelArr.length];
		JCheckBox[] chkArr = new JCheckBox[labelArr.length - 1];

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(labelArr.length, 3));
		center.setBackground(Color.YELLOW);

		for (int i = 0; i < labelArr.length; i++) {
			center.add(new JLabel(labelArr[i]));
			fieldArr[i] = new JTextField(5);
			center.add(fieldArr[i]);

			if (i < chkArr.length) {
				chkArr[i] = new JCheckBox();
				chkArr[i].setBackground(Color.YELLOW);
				center.add(chkArr[i]);
			}

		}

		cont.add(center, BorderLayout.CENTER);

		calculateBtn.addActionListener(e -> {
			calculate(priceField.getText(), fieldArr, chkArr);
		});

		priceField.addActionListener(e -> {
			calculate(priceField.getText(), fieldArr, chkArr);
		});

		setLocation(300, 300);
		setSize(250, 250);
		setVisible(true);
	}

	private void calculate(String inputPrice, JTextField[] fieldArr, JCheckBox[] chkArr) {

		int nInputPrice = Integer.parseInt(inputPrice);

		// System.out.println(nInputPrice);

		int calc1 = nInputPrice;
		int midValue = nInputPrice;

		if (chkArr[0].isSelected()) {
			calc1 = nInputPrice / 50000;
			midValue = nInputPrice - (calc1 * 50000);
			fieldArr[0].setText(String.valueOf(calc1));
//			debug(midValue, calc1);	
		}

		if (chkArr[1].isSelected()) {
			int calc2 = midValue / 10000;
			midValue = midValue - (calc2 * 10000);
			fieldArr[1].setText(String.valueOf(calc2));
			// debug(midValue, calc2);
		}

		if (chkArr[2].isSelected()) {
			int calc3 = midValue / 1000;
			midValue = midValue - (calc3 * 1000);
			fieldArr[2].setText(String.valueOf(calc3));
//			debug(midValue, calc3);
		}

		if (chkArr[3].isSelected()) {
			int calc4 = midValue / 500;
			midValue = midValue - (calc4 * 500);
			fieldArr[3].setText(String.valueOf(calc4));
//			debug(midValue, calc4);

		}

		if (chkArr[4].isSelected()) {
			int calc5 = midValue / 100;
			midValue = midValue - (calc5 * 100);
			fieldArr[4].setText(String.valueOf(calc5));
//			debug(midValue, calc5);

		}

		if (chkArr[5].isSelected()) {
			int calc6 = midValue / 50;
			midValue = midValue - (calc6 * 50);
			fieldArr[5].setText(String.valueOf(calc6));
//			debug(midValue, calc6);	
		}

		if (chkArr[6].isSelected()) {
			int calc7 = midValue / 10;
			midValue = midValue - (calc7 * 10);
			fieldArr[6].setText(String.valueOf(calc7));
//			debug(midValue, calc7);	
		}

		int calc8 = midValue / 1;
		midValue = midValue - (calc8 * 1);
		fieldArr[7].setText(String.valueOf(calc8));
//		debug(midValue, calc8);	
	}

//	private void debug(int midValue, int calc1) {
//		System.out.println("mid(" + midValue + ") (" + calc1 + ")");
//	}

	public static void main(String[] args) {
		new Quiz1();
	}
}
