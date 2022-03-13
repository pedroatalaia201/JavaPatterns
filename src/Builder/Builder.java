package Builder;

public class Builder {
	public static void main(String[] args)
	{
		Pizza pizza = new Pizza.Builder(10).chese().tomatoe().bacon().createPizza();
		
		System.out.println(pizza);
	}
}