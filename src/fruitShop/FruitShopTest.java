package fruitShop;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FruitShopTest {

	FruitCart fruitCart2;

	@Before
	public void setUp() throws Exception {
		fruitCart2 = new FruitCart();
		fruitCart2.getFruitsInCart("Apples", 0.25, 3);
		
	}


	@Test
	public void testingTotalPrice() {
		double pricePaid = fruitCart2.getTotalPrice();
		assertEquals(0.75, pricePaid, 0.0001);
		
		
	}
	
	@Test
	public void testingNumberOfFruits() {
		int totalFruits = fruitCart2.getCartSize();
		assertEquals(3, totalFruits, 0.0001);
		
		
	}


}
