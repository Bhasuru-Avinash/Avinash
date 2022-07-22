
import java.util.Scanner;
class Quadratic_Equation
{
	public static void main(String[]args)
	{
		int a,b,c;
		float root1,root2,root,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Given quadratic equation : ax^2 + bx + c");
		System.out.print("Enter a : ");
		a = sc.nextInt();
		System.out.print("Enter b : ");
		b = sc.nextInt();
		System.out.print("Enter c : ");
		c = sc.nextInt();
		d = (b*b-4*a*c);
		System.out.println("Given quadratic equation : "+ a+"x^2 + "+b+"x + "+c);
		if(d==0)
		{
			System.out.println("Roots are real and equal");
			root=-c/a;
			System.out.println("Root : "+root);
		}
		else if(d>0)
		{
			double e=Math.sqrt(d);
			System.out.println("Roots are real and unequal");
			root1=(-b+d)/2*a;
			root2=(-b-d)/2*a;
			System.out.println("First root is : "+root1);
			System.out.println("Second root is : "+root2);
		}
		else
		{
			System.out.println("Roots are imaginary");
		}
	}
	
}


