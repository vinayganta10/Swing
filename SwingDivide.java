import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingDivide
{
	JTextField t1= new JTextField(10);
	JTextField t2= new JTextField(10);
	JTextField t3 =new JTextField(10);
	JButton b1= new JButton("Compute");
	SwingDivide
	{
		JFrame jfrm = new JFrame("An Event Example" );
		 jfrm.setLayout(new FlowLayout(FlowLayout.CENTER));    
		jfrm.setSize(150,290);
		jfrm.setVisible(true);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1 =new JLabel("Divide a/b : ");
		JLabel l2 =new JLabel("Enter A :");
		JLabel l3 =new JLabel("Enter B :");
		JLabel l4 =new JLabel("Result : ");
		jfrm.add(l1);
		jfrm.add(l2);
		jfrm.add(t1);
		jfrm.add(l3);
		jfrm.add(t2);
		jfrm.add(b1);
		jfrm.add(l4);
		jfrm.add(t3);
		b1.addActionListener(new ActionListener( )
				       {
					public void actionPerformed(ActionEvent ae)
					{
						int c;
						int a = Integer.parseInt(t1.getText( ));
						int b = Integer.parseInt(t2.getText( ));
						c=a/b;
						String s =" "+c;
						t3.setText( );
					}
				      }
				);
	}
	public static void main(String ars[ ])
	{
		SwingUtilities.invokeLater(new Runnable( )
					{	
						public void run( )
						{
							new SwingDemo( );
						}
					}
				      );
	}
}


		