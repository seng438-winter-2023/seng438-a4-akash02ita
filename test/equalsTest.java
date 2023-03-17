package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class equalsTest  extends DataUtilities{

	@Test
	public void test() {
		double[][] realEmpty = new double[][] {};
		double[][] realNull = null;
		double[][] realArr1 = new double[][] {{1.2, 1.3}, {2.2, 2.3}};
		double[][] realArr2 = new double[][] {{1.2, 1.3}, {2.2, 2.3}};
		double[][] realArr3 = new double[][] {{1.2, 1.3}, {2.2, 2.2}};
		boolean checkNull1 = DataUtilities.equal(realNull,realArr1);
		assertFalse(checkNull1);
		boolean checkNull2 = DataUtilities.equal(realArr1,realNull);
		assertFalse(checkNull2);
		boolean checkEmpty1 = DataUtilities.equal(realEmpty,realArr1);
		assertFalse(checkEmpty1);
		boolean checkRealArr = DataUtilities.equal(realArr1, realArr2);
		assertTrue(checkRealArr);
		boolean checkFalseRealArr = DataUtilities.equal(realArr1, realArr3);
		assertFalse(checkFalseRealArr);
	}

}
