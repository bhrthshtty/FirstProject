package com.Infosys.MyMaven.MyMavenProject;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class FirstTestClassWithTestNGAnnotation_Test extends BaseFile {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void stringCompareTest1() {
		System.out.println("========'stringCompareTest1' started==========");
		String actualResultStr = "Chicago";
		String expectedValueStr = "Chicago";
		Assert.assertEquals(actualResultStr, expectedValueStr,
				"Test Fail. Both the strings are not equal. \n ========'stringCompareTest2' completed==========\"");
		System.out.println("Test Pass. Both the strings are equal.");
		System.out.println("========'stringCompareTest1' completed==========");
	}

	
}
