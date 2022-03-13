package singleton;

public class Car 
{
	
	private Car()
	{
	}
	
	private static Car instancia = null;
	
	public static synchronized Car getInstancia()
	{
		if(instancia == null)
		{
			instancia = new Car();
			System.out.println("Instancia criada...");
		}
		
		return instancia;
	}
}
