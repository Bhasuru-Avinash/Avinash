mport java.util.Scanner;
class Race
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of racer1: ");
		double racer1=sc.nextDouble();
		System.out.print("Enter the value of racer2: ");
		double racer2=sc.nextDouble();
		System.out.print("Enter the value of racer3: ");
		double racer3=sc.nextDouble();
		System.out.print("Enter the value of racer4: ");
		double racer4=sc.nextDouble();
		System.out.print("Enter the value of racer5: ");
		double racer5=sc.nextDouble();
		double total =(racer1+racer2+racer3+racer4+racer5)/5d;
		System.out.print("The speed of the racers >= average speed "+total+" : ");
		if(racer1>total)
		{
			System.out.print(" "+racer1);
		}
		if(racer2>total)
		{
			System.out.print(" "+racer2);
		}
		if(racer3>total)
		{
			System.out.print(" "+racer3);
		}
		if(racer4>total)
		{
			System.out.print(" "+racer4);
		}
		if(racer5>total)
		{
			System.out.print(" "+racer5);
		}
	}
}




