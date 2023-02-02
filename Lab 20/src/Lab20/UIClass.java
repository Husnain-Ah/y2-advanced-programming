package Lab20;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class UIClass {
	
	public static void main (String [] args) {
		  
		  // create gui visible

		  JFrame f = new JFrame("Plastic bags");
		  
		  f.setPreferredSize(new Dimension(400, 150));
		  
		  JTextField t1 = new JTextField("");
		
		  JButton b1 = new JButton("Search");
		 
		  
		  Container c = f.getContentPane();
		  c.setLayout(new FlowLayout());
		  c.add(t1).setPreferredSize(new Dimension(300,35));
		  c.add(b1);
		  
		  JLabel f2 = new JLabel();
		  c.add(f2);
		    
		  // functionality
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String UserText = t1.getText();
				JOptionPane.showMessageDialog(c, UserText);
				//pass usertext to database method
			}
			
			
		});

		  
		  
		  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  f.pack();
		  f.setVisible(true);

	  }

}
