public class Calculator{

	private int x;
	private int y;
	public Calculator()
	{
		this.x = 1;
		this.y = 1;
	}
	public Calculator(int m, int n)
	{
		this.x = m;
		this.y = n;
	}
	
	public int add()
	{ 
		return x+y; 
	}
	
	public int addX(int n)
	{ 
		return x+n; 
	}
	
	public int addY(int n)
	{ 
		return y+n; 
	}
	
	/*
	public double add(double x, double y)
	{ 
		return x+y; 
	}*/

	public int subtract(){ 
		return x-y; 
	}
	
	public int subtractX(int n)
	{ 
		return x-n; 
	}
	
	public int subtractY(int n)
	{ 
		return y-n; 
	}
	
	
	/*
	public double subtract(double x, double y){ 
		return x-y; 
	}*/

	public int multiply(){ 
		return x*y; 
	}
	
	/*
	public double multiply(double x, double y){ 
		return x*y; 
	}*/

	
	@SuppressWarnings("finally")
	public double divide(){
		try{ 
			return (double)x/(double)y; 
			}
		catch(ArithmeticException arithmeticException){
			System.out.println("Cannot divide by zero");
			System.exit(-1);
		}
		finally{ 
			return (double)x/(double)y; 
			}
	}
	
	/*
	@SuppressWarnings("finally")
	public static double divide(double x, double y){
		try{ 
			return x/y; 
			}
		catch(ArithmeticException arithmeticException){
			System.out.println("Cannot divide by zero");
			System.exit(-1);
		}
		finally{ 
			return x/y; 
			}
	}*/
}
