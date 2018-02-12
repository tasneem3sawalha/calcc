package calcc;

public class Model {
	
	
	public double operations(double o1, double o2, String op){
		     if (op.equals("+"))
			return o1 + o2;
		else if (op.equals("-"))
			return o1 - o2;
		else if (op.equals("*"))
			return o1 * o2;
		else if (op.equals("/"))
			return o1 / o2;
		else if(op.equals("squt root"))
			return Math.sqrt(o1);
		else if (op.equals("%"))
			return o1 % o2;    
		else     
			return 0;
		     
	}
	
	
}
