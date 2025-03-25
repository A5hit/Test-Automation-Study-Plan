/*

Q. Write a function that takes an integer as input and returns True if it is prime, otherwise False.

 */


import java.util.Scanner;

public class Check_Prime_Number_using_Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    public static Boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}