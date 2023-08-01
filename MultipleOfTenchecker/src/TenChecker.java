import java.util.Scanner;
public class TenChecker {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		checkMultipleofTen(n);
	}


public static void checkMultipleofTen(int n)
{
	if(n%10==0)
	{
		System.out.println("multiple of ten");
	
	}
	else
	{
		System.out.println("multiple not ten");
	}
}
}