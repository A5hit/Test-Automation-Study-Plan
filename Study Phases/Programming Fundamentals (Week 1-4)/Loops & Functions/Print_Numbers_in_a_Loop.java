/*
Q. Write a program that prints numbers from 1 to 10 using:
    - For loop
    - While loop
*/

public class Print_Numbers_in_a_Loop {

    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 10; i++) {
            System.out.print(i + ",");
        }

        i = 1;
        System.out.println(" ");
        while (i <= 10) {
            System.out.print(i + ",");
            i++;
        }

    }

}
