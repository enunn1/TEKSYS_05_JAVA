package unitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTest {
	// Slide 9, 11-14
	// All from JUnit 5
	// runs once before any other method in the class. Method must be static
//	@BeforeAll
	
	// runs once after any other test methods in the class. Method must be static
//	@AfterAll
	
	// runs before every test
//	@BeforeEach
	
	// runs after every test
//	@AfterEach
	
	@BeforeAll
	public static void setUpBefore() throws Exception {
		System.out.println("Before Class");
	}
	
	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Run Before each test method?");
	}
	
	// the Test Method
	@Test
	public void testFindMax() {
		System.out.println("Testing find max");
		assertEquals(4, TestingSomething.findMax(new int[] {1, 3, 4, 2}));
		assertEquals(-1, TestingSomething.findMax(new int[] {-12, -3, -4, -2, -1}));
		
	}
	
	@Test
	public void testCubeMethod() {
		System.out.println("Testing cube method");
		assertEquals(27, TestingSomething.cube(3));
		
	}
	
	@Test
	public void reverseStringTest() {
		System.out.println("Test Case for reverse string");
		assertEquals("olleh", TestingSomething.reverseString("hello"));
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("After Tests");
	}
	
	@AfterAll
	public static void classTearDown() throws Exception {
		System.out.println("After the class");
	}
}
