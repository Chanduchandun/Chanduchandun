
public class Jon {

	public static void main(String[] args) {
		Jon journeyCalculator = new Jon();

		double res=journeyCalculator.calculateDistance(60.0, 1.5);
System.out.printf("%.2f\n",res);
	}
	public double calculateDistance(double speed, double time)
	{
		return speed*time;
	}

}