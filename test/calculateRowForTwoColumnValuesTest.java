package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Before;
import org.junit.Test;

public class calculateRowForTwoColumnValuesTest extends DataUtilities {
	Mockery mockingContext = new Mockery();
    final Values2D values = mockingContext.mock(Values2D.class);
	Mockery mockingContext1 = new Mockery();
    final Values2D valuesNull = mockingContext1.mock(Values2D.class);
	@Before
	public void setUp() {
		//There will be two columns and first value of column 1 is 10.5 and 
		//for column 2 will be 5.5
	     mockingContext.checking((ExpectationBuilder) new Expectations() {
	         {
	             one(values).getColumnCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(10.5));
	             one(values).getValue(0, 1);
	             will(returnValue(5.5));
	             
	         }
	     });
	     mockingContext1.checking((ExpectationBuilder) new Expectations() {
	         {
	             one(valuesNull).getColumnCount();
	             will(returnValue(4));
	             one(valuesNull).getValue(0, 0);
	             will(returnValue(10.5));
	             one(valuesNull).getValue(0, 1);
	             will(returnValue(null));
	             one(valuesNull).getValue(0, 2);
	             will(returnValue(5.5));
	             one(valuesNull).getValue(0, 3);
	             will(returnValue(null));
	             
	         }
	     });
	}

	 @Test
	 public void calculateRowForOneColumnValues() {
	     // exercise	
		//Usage of the function with values stated above and using only row zero
		 int[] checkColumn = new int[]{1};
	     double result = DataUtilities.calculateRowTotal(values, 0, checkColumn);
	     // verify
	     
	   //The result should equal 16.0 since 10.5 + 5.5 = 16.0
	     assertEquals(5.5, result, .000000001d);
	     // tear-down: NONE in this test method
	 }
	 @Test(expected = IllegalArgumentException.class)
	 public void calculateRowForOneColumnValuesNullVal() {

		 	int[] checkColumn = new int[]{1};
	    	double result2 = DataUtilities.calculateRowTotal(null, 0, checkColumn);
	    	 

	 }
	 @Test
	 public void calculateRowForOneColumnValueCheckColumn() {

		 
		 	int[] checkColumn = new int[]{};
	    	 double result2 = DataUtilities.calculateRowTotal(values, 0, checkColumn);
	    	 assertEquals(0, result2, .000000001d);
	 }
	 @Test
	 public void calculateRowForOneColumnValueColEqualColCount() {

		 
		 	int[] checkColumn = new int[]{2};
	    	 double result2 = DataUtilities.calculateRowTotal(values, 0, checkColumn);
	    	 assertEquals(0, result2, .000000001d);
	 }
	 
	 @Test
	 public void calculateRowForOneColumnValueWithNullValues() {

		 
		 	int[] checkColumn = new int[]{0,1,2,3};
	    	 double result2 = DataUtilities.calculateRowTotal(valuesNull, 0, checkColumn);
	    	 assertEquals(16, result2, .000000001d);
	 }
}