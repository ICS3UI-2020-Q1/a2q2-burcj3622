import java.util.Scanner;
/**
 *lets the user knoe which number is greater
 * @author jason
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // scanner for user input
    Scanner input = new Scanner(System.in);

    // asks user for input
    System.out.println("Please enter an integer:");
    
    //lets user input number
    int number = input.nextInt();

    //asks user for second number 
    System.out.println("Please enter another integer:");

    //lets user input second number 
    int number2 = input.nextInt();

    if(number > number2)
    System.out.println( number +" greater than " + number2);
    else 
    System.out.println(number+ " less than " + number2);

  }
}
