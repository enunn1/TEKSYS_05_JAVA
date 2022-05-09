package testing;

import org.junit.Assert;

//import static org.junit.jupiter.api.DynamicTest.dynamicTest;

//import org.junit.jupiter.api.Test;

//import junit.framework.Assert;

import org.junit.Test;

public class ConstructorTest {

	public void test(Integer expectedNumberOfFaces) {

		// given
//		Integer numberOfFacesInteger = 2;
		Integer expectedFaceValue = null;

		// when
		Die die = new Die(expectedNumberOfFaces);
		Integer actualFaceValue = die.getCurrentFaceValue();
		Integer actualNumberOfFaces = die.getNumberOfFaces();

		// then
		Assert.assertEquals(expectedFaceValue, actualFaceValue);
		Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
	}

	public void testRoll(Integer numberOfFaces) {

		// given
//		Integer numberOfFacesInteger = 2;
		Integer unexpected = null;
		Die die = new Die(numberOfFaces);

		// when
		die.roll();
		Integer actual = die.getCurrentFaceValue();
//		Integer actualNumberOfFaces =die.getNumberOfFaces();

		// then
		Assert.assertNotSame(unexpected, actual);
		// assertEquals junit 4
//		Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
	}

	@Test
	public void test0() {
		test(3);
	}

	@Test
	public void test1() {
		test(4);
	}

	@Test
	public void test2() {
		testRoll(6);
	}

	@Test(expected = NullPointerException.class)
	public void testRoll3() {
		testRoll(null);
	}

}