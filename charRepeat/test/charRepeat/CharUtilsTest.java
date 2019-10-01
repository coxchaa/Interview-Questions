package charRepeat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/* Instructions:
 * Can you write an algorithm that returns the count of distinct characters 
 * that appear more than once in a row?
 *
 * String example1 = "lollipop"; // expect 1
 * String example2 = "lollipooooop"; // expect 2
 * String example3 = "lollippppooooopppp"; // expect 3
*/

class CharUtilsTest {

	static String longString = "abcd";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append(longString);
		for(int i=0;i<20;i++) {
			sb.append(sb.toString());
		}
		longString = sb.toString();
	}
	
	@Test
	void charRepeatTest_LongStringTest() {
		CharUtils charUtils = new CharUtils();
		String test = longString;
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 0);
	}
	
	@Test
	void charRepeatTest_ZeroMatch() {
		CharUtils charUtils = new CharUtils();
		String test = "test";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 0);
	}
	
	@Test
	void charRepeatTest_OneMatch() {
		CharUtils charUtils = new CharUtils();
		String test = "lollipop";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 1);
	}
	
	@Test
	void charRepeatTest_MultiMatchDistinct() {
		CharUtils charUtils = new CharUtils();
		String test = "lollipppoooooop";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 3);
	}
	
	@Test
	void charRepeatTest_MultiMatchNonDistinct() {
		CharUtils charUtils = new CharUtils();
		String test = "lollipppoooooopppppp";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 3);
	}
	
	@Test
	void charRepeatTest_EmptyString() {
		CharUtils charUtils = new CharUtils();
		String test = "";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 0);
	}
	
	@Test
	void charRepeatTest_NullInput() {
		CharUtils charUtils = new CharUtils();
		String test = null;
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 0);
	}
	
	@Test
	void charRepeatTest_OneChar() {
		CharUtils charUtils = new CharUtils();
		String test = "a";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 0);
	}

}
