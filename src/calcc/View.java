package calcc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View extends JFrame{
	
	protected JButton[] buttons;
	
	protected static final String[] names={"7","8","9","/","4","5","6","*","1","2","3","+",
			"0","=","-","C"};
	
	protected JTextField result ;
	protected JPanel keys;
	protected JButton squt=new JButton("squt root");
	
	protected JButton mod=new JButton("%");
	
	public View(){
		
		super("Calculator");
		keys =new JPanel();
		
		keys.setLayout(new GridLayout(5,4));
		buttons=new JButton[names.length];
		for(int i=0;i<names.length; i++){
			
			buttons[i]=	new JButton(names[i]);
			buttons[i].setBackground(Color.black);
			buttons[i].setFont(new Font(null, Font.PLAIN, 38));

			buttons[i].setForeground(Color.YELLOW);
			keys.add(buttons[i]);	
		}
		//squt.setLocation(0,300);
		//squt.setSize(300,70);
		squt.setBackground(Color.black);
		squt.setFont(new Font(null, Font.PLAIN, 16));
		squt.setForeground(Color.YELLOW);

	    keys.add(squt);
	    keys.add(mod);
	    mod.setBackground(Color.black);
	    mod.setFont(new Font(null, Font.PLAIN, 38));
		mod.setForeground(Color.YELLOW);
		
		
		result= new JTextField("0");
		result.setSize(55,50);
		result.setSize(100, 100);
		result.setForeground(Color.YELLOW);
		result.setBackground(Color.GRAY);
		result.setFont(new Font(null, Font.PLAIN, 38));
		//result.setBackground(Color.green);
		//result.setEditable(false);
		
		result.setHorizontalAlignment(JTextField.RIGHT);
		
		add(result,BorderLayout.NORTH);
		add(keys,BorderLayout.CENTER);

		
		
	}//end constructor
	
}//end Frame
