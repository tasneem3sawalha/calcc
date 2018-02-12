package calcc;

import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Controller   {
	
	private String op =" ";
	private String res ="0";
	private double o1 = 0, o2 = 0;
	
	
	private Model m ;
	private View v; 
	Controller(View v1,Model m1 ){
		m=m1;
		v=v1;
		
		ButtonHandler handler= new ButtonHandler();
		v.buttons[3].addActionListener(handler); // /
		v.buttons[7].addActionListener(handler); //*
		v.buttons[11].addActionListener(handler); //+
		v.buttons[13].addActionListener(handler); //=
		v.buttons[14].addActionListener(handler); //-
		v.buttons[0].addActionListener(handler); //7
		v.buttons[1].addActionListener(handler); //8
		v.buttons[2].addActionListener(handler); //9
		v.buttons[4].addActionListener(handler); //4
		v.buttons[5].addActionListener(handler); //5
		v.buttons[6].addActionListener(handler); //6
		v.buttons[8].addActionListener(handler); //1
		v.buttons[9].addActionListener(handler); //2
		v.buttons[10].addActionListener(handler); //3
		v.buttons[12].addActionListener(handler); //0
	
		v.buttons[15].addActionListener(handler);//C
		v.squt.addActionListener(handler);//squt root;
		v.mod.addActionListener(handler);
	}	
	
	
	public String CE(String s){
		// clear element
		String st;
		if(s.length() != 0 && !s.equals("0")){
			st = s.substring(0, s.length() - 1);
			return st;
		}
		else if(s.length() == 0 || s.equals("0"))
			return "0";

		return "0";
	}
	
	
	public boolean check(String s){
		// if the string all zeros "00000" return true

		char c;
		int len = s.length();
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			c = s.charAt(i);
			if(c == '0')
				count++;
		}
		if(count == len)
			return true;
		else
			return false;
	}
	
	
	public String without0(String s){
		// remove all zeros on the left
		char c;
		String sr = s;
		if (check(s))
			return "0";
		for (int i = 0; i < s.length(); i++){
			c = s.charAt(i);
			if (c == '0' && s.charAt(1) != '.'){
				sr = s.substring(i + 1, s.length());
			}
			else
				break;
		}
		return sr;
	}
	
	
	public void ope(){
		String s = v.result.getText();

		if(s.equals("-"))
			s = "0";
		if(op.equals(" ") && !v.result.getText().equals("NaN")){
			o1 = Double.parseDouble(s);
		}
		else
			o2 = Double.parseDouble(s);
	}
	
	private class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent event){
		
		
		String s = v.result.getText();
		if(s.equals("-"))
			s = "0";

			ope();
		
		if( event.getSource()==v.buttons[0]){
			
			if(op.equals(" "))
				res += "7";
			else if(v.result.getText().equals("" + o1)
					&& !(op.equals(" ")))
				res = "" + "7";
			else
				res += "7";
			
		}
			else if( event.getSource()==v.buttons[1]){
				if(op.equals(" "))
					res += "8";
				else if(v.result.getText().equals("" + o1)
						&& !(op.equals(" ")))
					res = "" + "8";
				else
					res += "8";
				
				}
			else if( event.getSource()==v.buttons[2]){
				if(op.equals(" "))
					res += "9";
				else if(v.result.getText().equals("" + o1)
						&& !(op.equals(" ")))
					res = "" + "9";
				else
					res += "9";
				}
			
				
			else if( event.getSource()==v.buttons[4]){
				if(op.equals(" "))
					res += "4";
				else if(v.result.getText().equals("" + o1)
						&& !(op.equals(" ")))
					res = "" + "4";
				else
					res += "4";
				}
			else if( event.getSource()==v.buttons[5]){
				if(op.equals(" "))
					res += "5";
				else if(v.result.getText().equals("" + o1)
						&& !(op.equals(" ")))
					res = "" + "5";
				else
					res += "5";
				}
			else if( event.getSource()==v.buttons[6]){
				if(op.equals(" "))
					res += "6";
				else if(v.result.getText().equals("" + o1)
						&& !(op.equals(" ")))
					res = "" + "6";
				else
					res += "6";
				
				}
			else if( event.getSource()==v.buttons[8]){
				if(op.equals(" "))
					res += "1";
				else if(v.result.getText().equals("" + o1)
						&& !(op.equals(" ")))
					res = "" + "1";
				else
					res += "1";
				}
			else if( event.getSource()==v.buttons[9]){
				if(op.equals(" "))
					res += "2";
				else if(v.result.getText().equals("" + o1)
						&& !(op.equals(" ")))
					res = "" + "2";
				else
					res += "2";
				}
			else if( event.getSource()==v.buttons[10]){
				if(op.equals(" "))
					res += "3";
				else if(v.result.getText().equals("" + o1)
						&& !(op.equals(" ")))
					res = "" + "3";
				else
					res += "3";
				}	
	else if(event.getSource() == v.buttons[12]){

			if(op.equals(" "))
				res += "0";
			else if(v.result.getText().equals("" + o1)
					&& !(op.equals(" ")))
				res = "" + "0";
			else
				res += "0";
		}
		
		
		
	
		else if( event.getSource()==v.buttons[11]){  ///+
			
			res = "";
			if(op.equals(" "))
				op = "+";
			else{
				o1 = m.operations(o1, o2, op);
				op = "+";
				res += o1;
				
			}
		}
	   
else if( event.getSource()==v.mod){  ///+
			
			res = "";
			if(op.equals(" "))
				op = "%";
			else{
				o1 = m.operations(o1, o2, op);
				op = "%";
				res += o1;
				
			}
		}
		
		else if( event.getSource()==v.buttons[14]){ ///-
			
			res = "";
			if(op.equals(" "))
				op = "-";
			else{
				o1 = m.operations(o1, o2, op);
				op = "-";
				res += o1;
			}
		}
		
		else if( event.getSource()==v.buttons[7]){  /// *
			
			res = "";
			if(op.equals(" "))
				op = "*";
			else{
				o1 = m.operations(o1, o2, op);
				op = "*";
				res += o1;
			}
			
		}
		else if( event.getSource()==v.buttons[3]){ /// /
			
			
			res = "";
			if(op.equals(" "))
				op = "/";
			else{
				o1 = m.operations(o1, o2, op);
				op = "/";
				res += o1;
			}
			
		}
		
		else if (event.getSource() == v.buttons[13]){  ///=
			o1 = m.operations(o1, o2, op);
			res = "" + o1;
			op = " ";
			
	
	}
		
else if( event.getSource()==v.squt){ ///      squt root        
			
			res = "";
			if(op.equals(" "))
				op = "squt root";
			else{
				o1 = m.operations(o1, o2, op);
				op = "squt root";
				res += o1;
			}
		}
		
		
		
		else if(event.getSource() == v.buttons[15]){
			// clear
			res = "0";
			o1 = 0;
			o2 = 0;
			op = " ";
		}
	
		v.result.setText(without0(res));
		
	}	
}	
	
	
	
	
	
}




