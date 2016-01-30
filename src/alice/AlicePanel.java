package alice;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AlicePanel extends JPanel {
	
	private ImageIcon imageIcon = new ImageIcon("Icon/background.jpg");
	private Image image = imageIcon.getImage();
	
	JButton exit = new JButton("EXIT");
	JLabel alice = new JLabel("alice");
	
	public AlicePanel() {
		// TODO Auto-generated constructor stub
		
		add(alice);
		add(exit);
		
		
		
		class MenuItemListener implements ActionListener
		{

			@Override
			public void actionPerformed(final ActionEvent arg0) {
				// 
				alice.setText("Works !");
				//System.exit(0);
			}
			
		}
		final ActionListener abort = new MenuItemListener();
		
		exit.addActionListener(abort);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//g.drawImage(image,0,0, getWidth(), getHeight(), this);//background image paint
		
		exit.setSize(200, 40);
		
		exit.setLocation(600, 600);
	}

}

