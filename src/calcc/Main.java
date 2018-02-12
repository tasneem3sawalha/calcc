package calcc;


public class Main {
	
	 public static void main(String[] args){
		 
		 View v=new View();
		 v.setVisible(true);
		 v.setSize(400,500);
		 Model m= new Model();
	
      Controller c = new Controller(v,m);
   
   
	 }
}


