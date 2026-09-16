package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {

	private static final long serialVersionUID = 1L;

	private int sum = 0;
	
	public CheckBoxItemEventEx() {

		setTitle("체크박스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
			
		JCheckBox[] fruits = new JCheckBox[3];
		String[] fruitNames = {"사과", "배", "체리"};
		
		cont.add(new JLabel("사과100원, 배500원, 체리20000원"));
		
		JLabel sumLabel = new JLabel("현재 0원입니다.");
		
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(fruitNames[i]);
			fruits[i].addItemListener(new ItemListener() {
				
			
				@Override
				public void itemStateChanged(ItemEvent e) {
					
					if(e.getStateChange() == ItemEvent.SELECTED) {
						System.out.println("체크됨");
						
						if(e.getItem() == fruits[0]) {
							sum += 100;
						}else if(e.getItem() == fruits[1]) {
							sum += 500;
						}else if(e.getItem() == fruits[2]) {
							sum += 20000;
						}
						
					}else {
						System.out.println("해제됨");
						
						if(e.getItem() == fruits[0]) {
							sum -= 100;
						}else if(e.getItem() == fruits[1]) {
							sum -= 500;
						}else if(e.getItem() == fruits[2]) {
							sum -= 20000;
						}
					}
					
					sumLabel.setText("현재 "+sum+"원입니다.");
				}
			});
			cont.add(fruits[i]);
		}
		
		cont.add(sumLabel);
		
		setLocation(300, 300);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
