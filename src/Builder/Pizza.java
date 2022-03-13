package Builder;

public class Pizza 
{
	private final int size;
	private final boolean chese;
	private final boolean tomatoe;
	private final boolean bacon;
	
	private Pizza(Builder builder)
	{
		size = builder.size;
		chese = builder.chese;
		tomatoe = builder.tomatoe;
		bacon = builder.bacon;
	}
	
	public static class Builder
	{
		private final int size;
		private boolean chese = false;
		private boolean tomatoe = false;
		private boolean bacon = false;
		
		public Builder(int size)
		{
			this.size = size;
		}
		
		public Builder chese()
		{
			chese = true;
			return this;
		}
		
		public Builder tomatoe()
		{
			tomatoe = true;
			return this;
		}
		
		public Builder bacon()
		{
			bacon = true;
			return this;
		}
		
		public Pizza createPizza()
		{
			return new Pizza(this);
		}
	}
}
