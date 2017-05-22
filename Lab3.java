//COSC 2331
//LAB 3
//Patricia Guereca

package lab3;

import java.util.Scanner;

/**
 *
 * @author patricia
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        sum();
        payroll();
    }
    
    public static void payroll() {
        
        double payRate = 12.5;
        int hoursWorked = 35;
        double pay;

        pay = payRate * hoursWorked;
        
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Pay rate: " + payRate);
        System.out.println("Pay: " + pay);
        
        
    }
    
    public static void sum() {
        int intOne;
        int intTwo;
        int sum;
        
        intOne = 5;
        intTwo = 6;
        sum = intOne + intTwo;
        
        System.out.print("The sum of " + intOne);
        System.out.print(" plus " + intTwo);
        System.out.print(" is " + sum);
        System.out.println(".");
    }
}
