package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Before;
import org.junit.Test;

public class createNumberArrayTest extends DataUtilities {
	Number realVals[] = new Number[4];
	@Before
	//Setup all values needed to test the Numbers array at the end 
	public void setUp() {
		realVals[0] = 1.0;
		realVals[1] = 2.0;
		realVals[2] = 3.0;
		realVals[3] = 4.0;
	     
	}

	 @Test
	 public void createNumberArray() {
	     // exercise
		double values[] = new double[4];
		values[0] = 1.0;
		values[1] = 2.0;
		values[2] = 3.0;
		values[3] = 4.0;
		//Setup values to send into the function that is being tested
	    Number result[] = DataUtilities.createNumberArray(values);
	    //Should have made result into a number array with the values above
	     // verify
	     
	    //Tests if the array have equal values
	    assertArrayEquals(realVals, result);
	     // tear-down: NONE in this test method
	 }
}
