package day18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public TabbedPaneEx() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();

		JTabbedPane pane = createTabbedPane();
		cont.add(pane, BorderLayout.CENTER);
		
		setLocation(350, 350);
		setSize(500, 600);
		setVisible(true);

	}

	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		pane.addTab("tab1", new JLabel(new ImageIcon("images/RYAN_1.jpg")));
		pane.addTab("tab2", new JButton("버튼"));
		pane.addTab("tab3", new MyPanel());
		return pane;
	}

	public static void main(String[] args) {
		new TabbedPaneEx();
	}

	class MyPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		public MyPanel() {
			this.setBackground(Color.YELLOW);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("tab 3에들어가는JPanel입니다.", 30, 50);
		}

	}
}
