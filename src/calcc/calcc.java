package calcc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calcc {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void test() {
	//fail("Not yet implemented");
	
	 double result = new Model().operations(5, 8, "+");
   // assertThat(result);
	 assertEquals(result,13.0,0);
	 
	
	 
	}

	@Test
	public void test1() {
	//fail("Not yet implemented");
	
	 double result11 = new Model().operations(5, 8, "-");
   // assertThat(result);
	 assertEquals(result11,-3.0,0);

	}
	
	@Test
	public void test2() {
	//fail("Not yet implemented");
	
	 double result11 = new Model().operations(5, 0, "*");
   // assertThat(result);
	 assertEquals(result11,0,0);

	}
	@Test
	public	void test3() {
	//fail("Not yet implemented");
	
	 double result11 = new Model().operations(25,5, "/");
   // assertThat(result);
	 assertEquals(result11,5,0);

	}
	
	
	@Test
	public void test7() {
	//fail("Not yet implemented");
	
	 double result11 = new Model().operations(25,0, "/");
	 assertTrue(String.valueOf(result11).equals("Infinity"));
	
//////
	}
	
	@Test
	public void test4() {
	//fail("Not yet implemented");
	
	 double result11 = new Model().operations(26, 5, "%");
	 //System.out.println(result11);
   // assertThat(result);
	 assertEquals(result11,1,0);

	}
	
	@Test 
public	void  test5() {
		//fail("Not yet implemented");
		
		 double result11 = new Model().operations(9, 1,"squt root");
		 //System.out.println(result11);
	  
		 assertEquals(result11,3,0);

		}

	@Test 
	public void test8() {
		//fail("Not yet implemented");
		////////////////////
		 double result11 = new Model().operations(-9, 1,"squt root");
		
		 assertTrue(String.valueOf(result11).equals("NaN"));
		// assertEquals(String.valueOf(result11),"NaN",0);

		}
	
	@Test
	public void testExceptionMessage() {
	    try {
	    		    	 double result11 = new Model().operations(Double.parseDouble("aa"), 1,"squt root");
			 
		  
			 assertEquals(String.valueOf(result11),"NaN",0);

	        
	    } catch (Exception a) {
	    	System.out.println(a);      
	    
	    }
	}
	
	


}
