package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Before;
import org.junit.Test;

public class createNumberArray2DTest extends DataUtilities {
	Number realVals[][] = new Number[2][4];
	@Before
	//Setup all values that is needed to test at the end
	public void setUp() {
		realVals[0][0] = 1.0;
		realVals[0][1] = 2.0;
		realVals[0][2] = 3.0;
		realVals[0][3] = 4.0;
		realVals[1][0] = 5.0;
		realVals[1][1] = 6.0;
		realVals[1][2] = 7.0;
		realVals[1][3] = 8.0;
	     
	}

	 @Test
	 public void create2DNumberArray() {
	     // exercise
		double values[][] = new double[2][4];
		values[0][0] = 1.0;
		values[0][1] = 2.0;
		values[0][2] = 3.0;
		values[0][3] = 4.0;
		
		values[1][0] = 5.0;
		values[1][1] = 6.0;
		values[1][2] = 7.0;
		values[1][3] = 8.0;
		//Setup all values as a 2D double array to feed into the function being tested
	    Number result[][] = DataUtilities.createNumberArray2D(values);
	    //Usage of the function is question and should have made a 2D array of Numbers
	     // verify
	     
	    //Checks if all the values are the same
	    assertArrayEquals(realVals, result);
	     // tear-down: NONE in this test method
	 }
}
