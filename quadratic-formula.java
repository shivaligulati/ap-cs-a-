import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class Main
{
	public static void main(String[] args) {
	    System.out.println("Quadratic Formula");
	    
        //scanner for user input of a
		Scanner sideInput1 = new Scanner(System.in); 
		System.out.println("Enter the value of a from ax^2 + bx + c");
		double a = sideInput1. nextDouble();
		
		//scanner for user input of  b
		Scanner sideInput2 = new Scanner(System.in); 
		System.out.println("Enter the value of b from ax^2 + bx + c");
		double b = sideInput2. nextDouble();
		
		//scanner for user input of c
		Scanner sideInput3 = new Scanner(System.in); 
		System.out.println("Enter the value of c from ax^2 + bx + c");
		double c = sideInput3. nextDouble();	
		
		/*finds the discriminant of the quadratic formula. we don't divide by 2a or add/subtract it from -b
		yet because based on the discriminant,the values the user inputed could output 2, 1, or 0 roots.*/
		
		//discriminant
		double discriminant = b * b - 4.0 * a * c;
		
		
		//values have 2 roots
		if (discriminant > 0.0){
		    double real1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double real2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + real1 + " and " + real2);
		}
		
		//values have one root
		else if (discriminant == 0.0){
		    double real3 = -b / (2.0 * a);
            System.out.println("The root is " + real3);
		    
		}
		//imaginary numbers
		else if (discriminant < 0) {
		    //math.sqrt square roots negative discriminant 
		    //have to do -b/2a seperately to tell the computer these are two seperate values that you can't add because part of it is imaginary
		    
		    System.out.println("Roots are " + -b/(2*a) + " + " + Math.sqrt(-discriminant)/(2*a) + "i" + " and " + -b/(2*a) + " - " + Math.sqrt(-discriminant)/(2*a) + "i");
		}
		//values have no roots
		else {
		  System.out.println("The equation has no real roots.");
		}
    }
}


