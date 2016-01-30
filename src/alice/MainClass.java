package alice;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.UnsupportedLookAndFeelException;

public class MainClass extends JFrame  {
	private static final long serialVersionUID = 1L;

	MainClass()
	{
		super("Sender");
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
	}

	public static void main(String[] args) {
       
		 try {
				javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (ClassNotFoundException e) {
				// 
				e.printStackTrace();
			} catch (InstantiationException e) {
				// 
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// 
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}
		MainClass sender = new MainClass();
		AlicePanel apanel = new AlicePanel();
		sender.add(apanel);
		sender.setSize(00, 738);
		sender.setVisible(true);
		sender.setLocationRelativeTo(null);
		sender.setResizable(false);
		sender.setLocation(0, 0);
		sender.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
