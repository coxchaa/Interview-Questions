package charRepeat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharUtilsTest {

	@Test
	void test() {
		CharUtils charUtils = new CharUtils();
		String test = "test";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 0);
	}
	
	@Test
	void test2() {
		CharUtils charUtils = new CharUtils();
		String test = "lollipop";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 1);
	}
	
	@Test
	void test3() {
		CharUtils charUtils = new CharUtils();
		String test = "lollipppoooooop";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 3);
	}
	
	@Test
	void test4() {
		CharUtils charUtils = new CharUtils();
		String test = "lollipppoooooopppppp";
		int val = charUtils.printNumRepeatCharNoDups(test);
		assertEquals(val, 3);
	}

}
