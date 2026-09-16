package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUIQuiz extends JFrame {

	private static final long serialVersionUID = 1L;

	public GUIQuiz() {

		setTitle("체크박스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("이름:");
		cont.add(label1);
		
		JTextField textField1 = new JTextField(15);
		cont.add(textField1);
		
		JLabel label2 = new JLabel("주소:");
		cont.add(label2);
		
		JTextField textField2 = new JTextField(15);
		cont.add(textField2);
		
		JLabel label3 = new JLabel("취미:");
		cont.add(label3);
		
		JCheckBox[] chkArr = new JCheckBox[4];
		String[] labelArr = {"게임", "영화감상", "독서", "코딩"};
		
		for(int i=0; i<chkArr.length; i++) {
			chkArr[i] = new JCheckBox(labelArr[i]);
			cont.add(chkArr[i]);
		}
				
		JLabel label4 = new JLabel("성별:");
		cont.add(label4);
		
		JRadioButton genderRadioMale = new JRadioButton("남");
		JRadioButton genderRadioFemale = new JRadioButton("여");
		ButtonGroup group = new ButtonGroup();
		group.add(genderRadioMale);
		group.add(genderRadioFemale);
		
		cont.add(genderRadioMale);
		cont.add(genderRadioFemale);
		
		setLocation(300, 300);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUIQuiz();
	}
}
