
public class Calculator {

	public static void main(String[] args) {

		JourenyCalculator journeyCalculator = new JourenyCalculator();

		double res=journeyCalculator.calculateDistance(60.0, 1.5);
System.out.printf("%.2f\n",res);

	}

}
