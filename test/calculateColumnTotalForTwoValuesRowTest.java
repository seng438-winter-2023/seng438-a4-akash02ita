package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Before;
import org.junit.Test;

public class calculateColumnTotalForTwoValuesRowTest extends DataUtilities {
	Mockery mockingContext = new Mockery();
    final Values2D values = mockingContext.mock(Values2D.class);
	@Before
	public void setUp() {
			//There will be two rows and first value of row 1 is 10.5 and for row 2 will be 5.5
	     mockingContext.checking((ExpectationBuilder) new Expectations() {
	         {
	             one(values).getRowCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(10.5));
	             one(values).getValue(1, 0);
	             will(returnValue(5.5));
	         }
	     });
	}

	 @Test
	 public void calculateColumnTotalForRowTwoValues() {
	     // setup
	     
	     // exercise
		 //Usage of the function with values stated above and using only column zero
		 
	     try {
	    	 int[] checkRow = new int[]{1};
	    	 double result = DataUtilities.calculateColumnTotal(values, 0, checkRow);
	    	 assertEquals(5.5, result, .000000001d);
	     }catch(Exception e){
	    	 System.out.println("calculateColumnTotal with 1 valid row array failed");
	     }
	     // tear-down: NONE in this test method
	 }
}
