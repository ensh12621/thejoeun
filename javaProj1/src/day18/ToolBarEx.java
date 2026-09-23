package day18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ToolTipManager;

public class ToolBarEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public ToolBarEx() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();

		createToolBar();
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);

		setLocation(350, 350);
		setSize(300, 300);
		setVisible(true);

	}

	private void createToolBar() {
		JToolBar toolBar= new JToolBar("Java Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		JButton btn = new JButton("버튼!");
		btn.setToolTipText("버튼이다");
		toolBar.add(btn);
		
		
		
		toolBar.add(new JButton("버튼"));
		toolBar.addSeparator();
		toolBar.add(new JLabel("Search"));
		toolBar.add(new JTextField("text field"));
		
		
		JComboBox<String> combo = new JComboBox<>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		add(toolBar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolBarEx();
	}

}
