package com.Infosys.MyMaven.MyMavenProject;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class SecondTestClassWithTestNGAnnotation extends BaseFile {
	/**
	 * Rigorous Test :-)
	 */
	

	@Test
	public void stringCompareTest2() {
		System.out.println("========'stringCompareTest2' started==========");
		String actualResultStr = "Chicago";
		String expectedValueStr = "Chicago";
		Assert.assertEquals(actualResultStr, expectedValueStr,
				"Test Fail. Both the strings are not equal. \n ========'stringCompareTest2' completed==========");
		System.out.println("========'stringCompareTest2' completed==========");
	}

	@Test
	public void stringCompareTest3() {
		System.out.println("========'stringCompareTest3' started==========");
		String actualResultStr = "Boston";
		String expectedValueStr = "Chicago";
		Assert.assertNotEquals(actualResultStr, expectedValueStr,
				"Test fail. Both the strings are equal. \n ========'stringCompareTest3' completed==========");
		System.out.println("Test Pass. Both the strings are not equal.");
		System.out.println("========'stringCompareTest3' completed==========");
	}
}
