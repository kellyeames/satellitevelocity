/* Programing Project 3: Velocity of a Satellite Orbiting the Earth
 * Kelly Eames CSC 142 Summer Quarter
 */
import java.util.*;

public class Velocity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double gravConst = 6.67 * Math.pow(10, -11);
		final double massEarth = 5.89 * Math.pow(10, 24);
		
		//declare variables
		double rexp = 0, rcoef, satVelocity = 0, radius;
		
		System.out.print("Enter the coefficient of the radius: ");
		Scanner scanner = new Scanner(System.in);
		
		rcoef = scanner.nextDouble();
		
		System.out.print("Enter the exponent value of the radius: ");
		rexp = scanner.nextDouble();
		
		radius = rcoef * Math.pow(10, rexp);
		System.out.println("The radius entered is: " + radius);
		satVelocity = Math.sqrt( (gravConst * massEarth) / radius);
		
		System.out.print("The satellite velocity m/s is: " + satVelocity);
	}

}
