import java.util.Scanner;
public class PlantExplorerApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius");
		double res=scan.nextDouble();
		PlanetExplorer explorer=new PlanetExplorer();
		System.out.printf("%.2f",explorer.calulateSurfaceArea(res));
	}

}
