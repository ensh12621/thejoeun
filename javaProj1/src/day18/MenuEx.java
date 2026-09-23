package day18;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public MenuEx() {
		setTitle("첫 번째 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		createMenu();
		setLocation(350, 350);
		setSize(300, 300);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		
		JMenuItem load= new JMenuItem("load");
		screenMenu.add(load);
		
		JMenuItem hide = new JMenuItem("hide");
		screenMenu.add(hide);
		
		JMenuItem reShow = new JMenuItem("ReShow");
		screenMenu.add(reShow);
		
		screenMenu.addSeparator(); 
		
		JMenuItem exit= new JMenuItem("Exit");
		screenMenu.add(exit);
		
		menuBar.add(screenMenu);
		
		menuBar.add(new JMenu("Edit")); 
		menuBar.add(new JMenu("Source"));
		menuBar.add(new JMenu("Project"));
		menuBar.add(new JMenu("Run"));
		
		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		new MenuEx();
	}

}
