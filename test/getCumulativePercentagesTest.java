package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Before;
import org.junit.Test;

public class getCumulativePercentagesTest extends DataUtilities {
	
    DefaultKeyedValues testValues = new DefaultKeyedValues();
	@Before
	//Setup all the keyed values that will be fed into the function being tested
	public void setUp() {
		testValues.setValue("0", 5.0);
		testValues.setValue("1", 9.0);
		testValues.setValue("2", 2.0);

	}

	 @Test
	 public void getCumulativePercentages() {
	     // exercise
		 
	     // verify
		//Feeds the function with the keyed values so we can get cumulative percentages
	    KeyedValues results = DataUtilities.getCumulativePercentages(testValues);
	    //Should have done the math and returned as a KeyedValues type
	    
	    //Tests if the values from above function match up with manually calculated values
	    assertEquals(0.3125, results.getValue(0)); //expected value  0.3125 (5 / 16)
	    assertEquals(0.875, results.getValue(1)); // expected value 0.875 ((5 + 9) / 16)
	    assertEquals(1.0, results.getValue(2)); //expected value 1.0 ((5 + 9 + 2) / 16)
	    
	     // tear-down: NONE in this test method
	 }
}
