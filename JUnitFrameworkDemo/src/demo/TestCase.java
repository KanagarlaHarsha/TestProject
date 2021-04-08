package demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase {
	
	@BeforeClass
	public static void beforeclassmethod()
	{
		System.out.println("Before class");
	}
	
	@Before
	public void beforetestcase()
	{
		System.out.println("Before Testcase");
		
		
		
	}
	

	@Test
	public void test() 
	{


		//assertEquals(5,FindResult.FindMaxNum(new int[] {1,2,3,4,5}));
		assertTrue(FindResult.evenodd(3));
		
	}
	
	@After
	public  void aftertestcase()
	{
		System.out.println("After test case");
	}
	
	@AfterClass
	public static void afterclass()
	{
		System.out.println("After Test class");
	}
	

}
