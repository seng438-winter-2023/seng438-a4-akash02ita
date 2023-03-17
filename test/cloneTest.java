package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class cloneTest  extends DataUtilities{

	@Test
	public void test() {
		double[][] realArr = new double[][] {{1.2, 1.3}, {2.2, 2.3}};
		double[][] checkClone = DataUtilities.clone(realArr);
		assertArrayEquals(realArr, checkClone);
	}

}
