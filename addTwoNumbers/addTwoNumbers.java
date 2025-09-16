import java.util.*;
public class addTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Inputting the two numbers
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        /*Calculating 
        the 
        sum
        */
        
        int sum = n1 + n2;
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
