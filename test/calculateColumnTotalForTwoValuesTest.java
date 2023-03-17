package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Before;
import org.junit.Test;

public class calculateColumnTotalForTwoValuesTest extends DataUtilities {
	Mockery mockingContext = new Mockery();
    final Values2D values = mockingContext.mock(Values2D.class);
    Mockery mockingContext1 = new Mockery();
    final Values2D values1 = mockingContext1.mock(Values2D.class);
    Mockery mockingContext2 = new Mockery();
    final Values2D valuesNull = mockingContext2.mock(Values2D.class);
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
	     
	     mockingContext1.checking((ExpectationBuilder) new Expectations() {
	         {
	             one(values1).getRowCount();
	             will(returnValue(0));
	             one(values1).getValue(0, 0);
	             will(returnValue(10.5));
	             one(values1).getValue(1, 0);
	             will(returnValue(5.5));
	         }
	     });
	     mockingContext2.checking((ExpectationBuilder) new Expectations() {
	         {
	             one(valuesNull).getRowCount();
	             will(returnValue(4));
	             one(valuesNull).getValue(0, 0);
	             will(returnValue(10.5));
	             one(valuesNull).getValue(1, 0);
	             will(returnValue(null));
	             one(valuesNull).getValue(2, 0);
	             will(returnValue(5.5));
	             one(valuesNull).getValue(3, 0);
	             will(returnValue(null));
	         }
	     });
	     
	}

	 @Test
	 public void calculateColumnTotalForTwoValues() {
		 //Usage of the function with values stated above and using only column zero
		 try {
	     double result = DataUtilities.calculateColumnTotal(values, 0);
	     // verify
	     //The result should equal 16.0 since 10.5 + 5.5 = 16.0
	     assertEquals(16.0, result, .000000001d);
		 }catch(Exception e) {
			 System.out.println("calculateColumnTotal with no valid row array failed");
		 }
	 }
	 
	 /* below a4 new test cases to improve mutation coverage */
	 @Test(expected = IllegalArgumentException.class)
	 public void calculateColumnTotalForTwoValuesNullParam() {
	     DataUtilities.calculateColumnTotal(null, 0);
	 }
	 
	 
	 @Test
	 public void calculateColumntotalForTwoValuesWithNullValues() {
	    	 double result2 = DataUtilities.calculateColumnTotal(valuesNull, 0);
	    	 assertEquals(16, result2, .000000001d);
	 }
	 
	 
	 
	 
}
