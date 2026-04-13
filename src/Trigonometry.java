import java.util.*;
public class Trigonometry 
{
    public static double sine(double n)
	{
		return Math.sin(n);
    }
	
	public static double cosine(double n)
	{
		return Math.cos(n);
    }
    
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
		System.out.println("Sine: "+sine(n*Math.PI/180));
		System.out.println("Cosine: "+cosine(n*Math.PI/180));
    }
    
}
