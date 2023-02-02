package Lab19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;


public class Barcode1 {

  public static void main (String [] args) {
	  
	  // create gui visible

	  JFrame f = new JFrame("Barcode Generator");
	  
	  f.setPreferredSize(new Dimension(500, 200));
	  
	  JTextField t1 = new JTextField("                                      ");
	  
	  JRadioButton r1 = new JRadioButton("Code 128");
	  JRadioButton r2 = new JRadioButton("Code 39");
	  JRadioButton r3 = new JRadioButton("Codabar");
	  
	  ButtonGroup butt1 = new ButtonGroup();
	  butt1.add(r1); butt1.add(r2); butt1.add(r3);
	  
	  JButton b1 = new JButton("Generate");
	 
	  
	  Container c = f.getContentPane();
	  c.setLayout(new FlowLayout());
	  c.add(t1);
	  c.add(r1);
	  c.add(r2);
	  c.add(r3);
	  c.add(b1);
	  
	  JLabel f2 = new JLabel();
	  c.add(f2);
	  
	  // barcode generation?
	  
//	  Barcode barcode;
//	  
//	try {
//		
//		barcode = BarcodeFactory.createCode128B("be the coder");
//		
//		barcode.setBarHeight(60);
//	    barcode.setBarWidth(2);
//	    
//	    JPanel f2 = new JPanel();
//	    f2.add(barcode);
//	    c.add(f2);
//	    
//	} catch (BarcodeException e1) {
//		e1.printStackTrace();
//	}
	    
	  // functionality
	
	
	  
	  b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try{
				if(t1.getText().equals("")) {
					JOptionPane.showMessageDialog(c, "add some input");
				}
				else {
					
					if (r1.isSelected()) {
						Barcode bc = BarcodeFactory.createCode128B(t1.getText());
						ImageIcon icon = new ImageIcon(BarcodeImageHandler.getImage(bc));
						
					    
					   
					    System.out.println(bc);
					    f2.setIcon(icon);
					    
					}
					
					else if (r2.isSelected()) {
						Barcode bc = BarcodeFactory.createCode39(t1.getText(),false);
						ImageIcon icon = new ImageIcon(BarcodeImageHandler.getImage(bc));
						
					    
					   
					    System.out.println(bc);
					    f2.setIcon(icon);
					    
					}
					
					else if (r3.isSelected()) {
						Barcode bc = BarcodeFactory.createCodabar(t1.getText());
						ImageIcon icon = new ImageIcon(BarcodeImageHandler.getImage(bc));
						
					    
					   
					    System.out.println(bc);
					    f2.setIcon(icon);
					    
					}
					 
					else { 
						JOptionPane.showMessageDialog(c, "select a radio button");
						}
				}
				
				
			}catch (BarcodeException | OutputException e1) {
				e1.printStackTrace();
				}
			
			JOptionPane.showMessageDialog(f, "Done!");
			
		}
	});
	  
	  
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  f.pack();
	  f.setVisible(true);

  }
}