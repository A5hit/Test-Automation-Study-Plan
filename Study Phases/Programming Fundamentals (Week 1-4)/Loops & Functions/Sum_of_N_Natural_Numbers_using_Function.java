/*

Q. Write a function to calculate the sum of the first N natural numbers.
    - Input: N = 5
    - Formula: Sum = 1 + 2 + 3 + ... + N

 */

import java.util.Scanner;

public class Sum_of_N_Natural_Numbers_using_Function {

    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        sumOfNaturalNumbers(n);
    }

    public static void sumOfNaturalNumbers(int n) {
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
