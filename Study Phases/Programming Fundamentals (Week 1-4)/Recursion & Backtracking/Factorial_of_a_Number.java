import java.util.Scanner;

public class Factorial_of_a_Number {
    public static void main(String[] args){
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println(factorial(n));
    }

    public static long factorial(long n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
