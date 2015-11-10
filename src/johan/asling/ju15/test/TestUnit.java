package johan.asling.ju15.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnit {
	
	TestModel testModel = new TestModel();
	int product = 12;
	
	@Test
	public void testMultiply(){
		assertEquals(product, testModel.multiply(3,4));
	}
	
	@Test
	public void testDivide(){
		assertEquals(product, testModel.divide(12, 1));
	}
}
