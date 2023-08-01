import java.util.Scanner;
public class Purchase {

	public static void checkDiscount(double purchaseAmount)
	{
	if(purchaseAmount>100)	
	{
		System.out.println("Dissount Applicable");
	}
	else
	{
		System.out.println("Dissount not Applicable");
	}
	}
	

   public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter purchaseAmount");
	double purchaseAmount=scan.nextDouble();
	checkDiscount(purchaseAmount);
}
}