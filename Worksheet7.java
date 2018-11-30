
import java.awt.event.* ;
import java.util.* ;

import javax.swing.* ;

public class Worksheet7 extends JFrame implements Runnable , ActionListener {
	JButton StartBtn , StopBtn ;
	JLabel Shape1Lbl , Shape2Lbl , Shape3Lbl , WinLbl , LoseLbl, lbl3 ;
	JPanel ShapesPanel ;
	Thread ThreadObject001 ;
	static Worksheet7 ClassAObjctA ;
	String [] Options = { "A" , "B" , "C" , "D" , "E", "F", "G", "H" ,"I", "J" } ;
	Random RndmVariable = new Random ( ) ;
	int RndmNumber1 = RndmVariable.nextInt( Options.length ) ;
	int RndmNumber2 = RndmVariable.nextInt( Options.length ) ;
	int RndmNumber3 = RndmVariable.nextInt( Options.length ) ;
	boolean a ;
	int timer=0;
	
	
	public Worksheet7 ( ) {
		setLayout ( null ) ;
		setSize ( 500 , 500 ) ;
		setLocation (700, 400);
		
		Shape1Lbl = new JLabel ( ) ;
		Shape1Lbl.setText ( Options [RndmNumber1] ) ;
		Shape1Lbl.setSize (100, 100 ) ;
		Shape1Lbl.setLocation ( 100 , 300 ) ;
		Shape1Lbl.setVisible ( true ) ;
		getContentPane ( ).add ( Shape1Lbl ) ;
		Shape1Lbl.setFont(Shape1Lbl.getFont().deriveFont(50.0f));
		
		Shape2Lbl = new JLabel ( ) ;
		Shape2Lbl.setText ( Options [RndmNumber2] ) ;
		Shape2Lbl.setSize ( 100 , 100 ) ;
		Shape2Lbl.setLocation ( 300 , 300 ) ;
		Shape2Lbl.setVisible ( true ) ;
		getContentPane ( ).add ( Shape2Lbl ) ;
		Shape2Lbl.setFont(Shape2Lbl.getFont().deriveFont(50.0f));
		
	
		StartBtn = new JButton ( ) ;
		StartBtn.setText( "Start" ) ;
		StartBtn.setSize ( 120 , 40 ) ;
		StartBtn.setLocation ( 160 , 70 ) ;
		StartBtn.setVisible ( true ) ;
		StartBtn.addActionListener ( this ) ;
		getContentPane ( ).add ( StartBtn ) ;
		

		lbl3=new JLabel(" ");
		lbl3.setLocation(200,140);
		lbl3.setSize(100,100);
		lbl3.setFont(lbl3.getFont().deriveFont(50.0f));
		add(lbl3);
		
		setVisible ( true ) ;
		getContentPane ( ) ;
		setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
		
	}
	@Override
	public void run ( ) {
		while ( a ) {
			RndmNumber1 = RndmVariable.nextInt( Options.length ) ;
			RndmNumber2 = RndmVariable.nextInt( Options.length ) ;
			Shape1Lbl.setText ( Options [RndmNumber1] ) ;
			Shape2Lbl.setText ( Options [RndmNumber2] ) ;
			lbl3.setText(Integer.toString(timer));
		    Thread.currentThread();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (RndmNumber1 ==RndmNumber2  ) {
			JOptionPane.showMessageDialog(this, " Current time: "+timer);
			
			break;
			
			
			}
			
		timer++;
		}
		
		/* try {
			 Thread.currentThread().sleep(500);
		 }
		 catch (InterruptedException e) {
			// TODO: handle exception
		}*/
	}
	public static void main ( String [] args ) {

		ClassAObjctA = new Worksheet7 ( ) ;

	}
	@Override
	public void actionPerformed ( ActionEvent e ) {
		ThreadObject001 = new Thread ( ClassAObjctA ) ;
		
		if ( e.getSource ( ).equals ( StartBtn ) ) {
			a = true ;
			
			ThreadObject001.start ( ) ;
					
		}
		
		}
	}


