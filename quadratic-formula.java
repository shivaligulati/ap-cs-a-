import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class Main
{
	public static void main(String[] args) {
	    System.out.println("Quadratic Formula");
	    
        //scanner for user input of a
		Scanner sideInput1 = new Scanner(System.in); 
		System.out.println("Enter the value of a");
		double a = sideInput1. nextDouble();
		
		//scanner for user input of  b
		Scanner sideInput2 = new Scanner(System.in); 
		System.out.println("Enter the value of b");
		double b = sideInput2. nextDouble();
		
		//scanner for user input of c
		Scanner sideInput3 = new Scanner(System.in); 
		System.out.println("Enter the value of c.");
		double c = sideInput3. nextDouble();	
		
		/*finds the discriminant of the quadratic formula. we don't divide by 2a or add/subtract it from -b
		yet because based on the discriminant,the values the user inputed could output 2, 1, or 0 roots.*/
		
		//discriminant
		double discriminant = b * b - 4.0 * a * c;
		
		//values have 2 roots
		if (discriminant > 0.0){
		    
		    //math.pow uses 0.5 since that indicates it is a square root
		    double result1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double result2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + result1 + " and " + result2);
		}
		
		//values have one root
		else if (discriminant == 0.0){
		    double result1 = -b / (2.0 * a);
            System.out.println("The root is " + result1);
		    
		}
		
		//values have no roots
		else {
		  System.out.println("The equation has no real roots.");
		}
    }
}
