package singleton;

public class Singleton 
{
	public static void main(String[] args)
	{
		Car car;
		
		for(int i = 0; i < 100; i++)
		{
			System.out.println(i);
			car = Car.getInstancia();
			System.out.println(car);
		}
	}
}
