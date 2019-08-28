package charRepeat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharUtilsTest {

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

}
