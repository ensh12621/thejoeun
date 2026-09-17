package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz3 extends JFrame {

	private static final long serialVersionUID = 1L;

	public static final int CALC_TYPE_NOT_DEFINED = -1;
	public static final int CALC_TYPE_ADD = 1;
	public static final int CALC_TYPE_SUBTRACT = 2;
	public static final int CALC_TYPE_MULTIPLY = 3;

	private int nCalcType = CALC_TYPE_NOT_DEFINED;

	private Double num1, num2;
	private boolean isCalculated = false;
	private boolean isRealNumber = false;

	public Quiz3() {

		setTitle("퀴즈3");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
//		cont.setLayout(new BorderLayout());

		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.YELLOW);
		topPanel.add(new JLabel("수식"));
		JTextField calcText = new JTextField(15);
		topPanel.add(calcText);
		cont.add(topPanel, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4, 4, 3, 3));

		String arr[] = { "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "+/-", "0", ".", "=" };

		JButton[] btns = new JButton[arr.length];

		for (int i = 0; i < arr.length; i++) {
			btns[i] = new JButton((String.valueOf(arr[i])));
			centerPanel.add(btns[i]);
		}

		cont.add(centerPanel, BorderLayout.CENTER);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.ORANGE);
		bottomPanel.add(new JLabel("결과"));
		JTextField outputField = new JTextField(15);
		bottomPanel.add(outputField);
		cont.add(bottomPanel, BorderLayout.SOUTH);

		int[] numBtnArr = { 0, 1, 2, 4, 5, 6, 8, 9, 10, 13 };

		for (int i = 0; i < numBtnArr.length; i++) {
			btns[numBtnArr[i]].addActionListener(e -> {
				if (isCalculated) {
					calcText.setText("");
					isCalculated = false;
				}

				if (nCalcType == -1) {
					// 가감승제 버튼 누르기 전 숫자 입력의 경우
					JButton clicked = (JButton) e.getSource();
					if (num1 == null) {
						num1 = 0.0;
					}
					if (!isRealNumber) {
						String num = String.valueOf(Math.round(num1)) + clicked.getText();
						calcText.setText(calcText.getText() + clicked.getText());
						num1 = Double.parseDouble(num);
					}else {
						// TODO: 소수점있을 때 더하기 구하기
						double num = num1 + Double.parseDouble(clicked.getText());
						calcText.setText(calcText.getText() + clicked.getText());
						num1 = Double.parseDouble(calcText.getText());
					}

				} else {
					// 가감승제 버튼 누른 이후의 숫자 버튼 누른 경우

					if (!isRealNumber) {
						JButton clicked = (JButton) e.getSource();
						if (num2 == null) {
							num2 = 0.0;
						}
						String num = String.valueOf(Math.round(num2)) + clicked.getText();
						int removeFirstZeroPart = Integer.parseInt(num);
						calcText.setText(String.valueOf(removeFirstZeroPart));
						num2 = Double.parseDouble(num);

					}else {
						String strMethod = calcText.getText();
						
						if(strMethod.equals("+") || strMethod.equals("-") || strMethod.equals("x")) {
							calcText.setText("");
						}
						
						JButton clicked = (JButton) e.getSource();
						calcText.setText(calcText.getText() + clicked.getText());
						num2 = Double.parseDouble(calcText.getText());
					}

				}

				System.out.println(num1 + ", " + num2);
			});
		}

		int[] calcBtnArr = { 3, 7, 11 };

		for (int i = 0; i < calcBtnArr.length; i++) {
			btns[calcBtnArr[i]].addActionListener(e -> {

				JButton clicked = (JButton) e.getSource();

				switch (clicked.getText()) {

				case "+":
					nCalcType = Quiz3.CALC_TYPE_ADD;
					calcText.setText("+");
					break;

				case "-":
					nCalcType = Quiz3.CALC_TYPE_SUBTRACT;
					calcText.setText("-");
					break;

				case "x":
					nCalcType = Quiz3.CALC_TYPE_MULTIPLY;
					calcText.setText("x");
					break;
				default:
					break;
				}
			});
		}

		btns[12].addActionListener(e -> {
			// TODO:
			
			if (nCalcType == Quiz3.CALC_TYPE_NOT_DEFINED) {
				if (num1 != null) {
					num1 *= -1;
					if(!isRealNumber) {
						calcText.setText(String.valueOf(Math.round(num1)));
					}else {
						calcText.setText(String.valueOf(num1));	
					}
					
				}

			} else {
				if (num2 != null) {
					num2 *= -1;
					if(!isRealNumber) {
						calcText.setText(String.valueOf(Math.round(num2)));
					}else {
						calcText.setText(String.valueOf(num2));	
					}
					
					
				}

			}
		});
		
		btns[14].addActionListener(e -> {
			isRealNumber = true;
			
			if(isRealNumber) {
				calcText.setText(calcText.getText() + ".");
			}else {
				calcText.setText(calcText.getText().replaceAll(".", ""));
			}
			
		});

		btns[15].addActionListener(e -> {
			if (nCalcType != Quiz3.CALC_TYPE_NOT_DEFINED && num1 != null && num2 != null) {

				double result = 0;

				switch (nCalcType) {

				case Quiz3.CALC_TYPE_ADD:
					result = num1 + num2;

					break;

				case Quiz3.CALC_TYPE_SUBTRACT:
					result = num1 - num2;
					break;

				case Quiz3.CALC_TYPE_MULTIPLY:
					result = num1 * num2;
					break;
				}

				if (!isRealNumber) {
					calcText.setText(String.valueOf(Math.round(result)));
					outputField.setText(String.valueOf(Math.round(result)));
				} else {
					calcText.setText(String.valueOf(result));
					outputField.setText(String.valueOf(result));
				}

				isCalculated = true;
				nCalcType = Quiz3.CALC_TYPE_NOT_DEFINED;
				isRealNumber = false;
				num1 = null;
				num2 = null;
			}
		});

		setLocation(300, 300);
		setSize(300, 450);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz3();
	}
}
