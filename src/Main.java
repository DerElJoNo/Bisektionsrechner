public class Main
{
	static int counter = 0;
	static float result;
	static float a = 0;
	static float b = 32;
	
	public static void main(String[] args)
	{
		int rekursionstiefe = 50;
		
		if(f(a)*f(b)>0)return;
		if(f(b)<f(a))
		{
			float c = a;
			a = b;
			b = c;
		}
		
		
		rechneBisektion(rekursionstiefe);
	}
	
	public static float f(float x)
	{
		float fx = (float)Math.pow(2.0,x)*(float)Math.pow(x,1.0/2.0)-42;
		
		return fx;
	}
	
	public static boolean rechneBisektion(int tiefe)
	{
		result = (a+b)/(float)2;
		
		if(f(result)== (float)0)
		{
			return true;
		}
		else if(f(result)>(float)0)
		{
			b = result;
		}
		else
		{
			a = result;
		}
		
		if(a<b)System.out.println("(" + a + ", " +b +")");
		else System.out.println("(" + b + ", " +a +")");
		
		if(counter < tiefe)
		{
			System.out.println(counter+1);
			
			counter++;
			rechneBisektion(tiefe);
		}
		
		return true;
	}
}
