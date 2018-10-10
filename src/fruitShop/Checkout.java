package fruitShop;


public class Checkout {

	public Checkout(){
		
	}
	
	public double calculatePrice(FruitCart fruitCart){
		double totalPrice = fruitCart.getTotalPrice();
		return totalPrice;
	}
}
