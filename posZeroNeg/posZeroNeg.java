import java.util.*;
public class posZeroNeg {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num>0){
            System.out.println("The number is positive.");
        }else if (num == 0){
            System.out.println("The number is zero.");
        }else{
            System.out.println("The number is negative.");
        }
        }
    }

