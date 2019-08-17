import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main
{
    double userDegree;
	public static void main(String[] args) {
	    System.out.println("Temperature Convertor Application");
	    
	    //scanner for user input of degree
		Scanner userInput = new Scanner(System.in); 
		System.out.println("Enter a degree"); 
		
		//converts userInput to a double
		double userDegree = userInput .nextDouble();
		
		//scanner for user input of c or f
		Scanner userChoice = new Scanner(System.in);
		System.out.println("Enter C to convert to Celcius or F to convert to Farenheit.");
		String userFC = userChoice.nextLine();
 		
 		//extra credit: checks if conversion is scientificaly valid
 		 // 
		if ( userDegree == 459.67 && (userFC.equals("C") || userFC.equals("c")) ){
		    System.out.println("You have entered a temperature at absolute zero. A conversion would not be scientifically valid.");
 		}
 		else if ( userDegree < 459.67 && (userFC.equals("C") || userFC.equals("c"))){
		    System.out.println("You have entered a temperature below absolute zero. A conversion would not be scientifically valid.");
 		}
 		else if ( userDegree == -273.15 && (userFC.equals("F") || userFC.equals("f")) ){
		    System.out.println("You have entered a temperature at absolute zero. A conversion would not be scientifically valid.");
 		}
 		else if ( userDegree < -273.15 (userFC.equals("F") || userFC.equals("f")) ){
		    System.out.println("You have entered a temperature below absolute zero. A conversion would not be scientifically valid.");
 		}
 		
 		
 		//reads which conversion to do from the user
 		if (userFC.equals("C") || userFC.equals("c")) {
 		    double userResultF = ((userDegree - 32)*5)/9;
		    System.out.println(userDegree + "F " + "is equal to " + userResultF +  "C " );
 		}
 		else if (userFC.equals("F") || userFC.equals("f") ){
 		    double userResultC = 1.8*userDegree + 32;
		    System.out.println(userDegree +  "C " + "is equal to " + userResultC + "F ");
 		} else {
 		    System.out.println("Invalid input. Try again.");
 		}
	}
}
