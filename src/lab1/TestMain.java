package lab1;


import org.junit.Assert;

import org.junit.Test;

public class TestMain {

	@Test(timeout = 1000)
	public void testSizeCost() {
		Doublecost cst = new Doublecost(0.0);	
		
		Main.main(new String[]{"Decaf Mocha","large"},cst);
		Assert.assertEquals(1.8, cst.valu, 0);
		Main.main(new String[]{"Mocha","Small"},cst);
		Assert.assertEquals(1.7, cst.valu, 0);
		Main.main(new String[]{"espresso","Medium","Milk"},cst);
		Assert.assertEquals(2.0, cst.valu, 0);
		Main.main(new String[]{"houseblend","Grant","Whip"},cst);
		Assert.assertEquals(2.4, cst.valu, 0);
		Main.main(new String[]{"latte","large","Jasmine"},cst);
		Assert.assertEquals(2.8, cst.valu, 0);
		Main.main(new String[]{"green tea","large","Jasmine"},cst);
		Assert.assertEquals(2.2, cst.valu, 0);
		Main.main(new String[]{"red tea","large","Jasmine"},cst);
		Assert.assertEquals(2.0, cst.valu, 0);
		Main.main(new String[]{"white tea","large","Jasmine"},cst);
		Assert.assertEquals(2.2, cst.valu, 0);
		Main.main(new String[]{"flower tea","large","Jasmine"},cst);
		Assert.assertEquals(2.7, cst.valu, 0);
		Main.main(new String[]{"ginger tea","large","Jasmine"},cst);
		Assert.assertEquals(2.8, cst.valu, 0);
	}

}
