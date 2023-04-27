/**
 * @author fazliberkordek
 */
//This program find the exponential power of the user input:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
        //Taking the number from user:
        System.out.print("Please enter the number:");
        n = input.nextInt();
        //Power of the n ?
        System.out.print("Please enter the power of the n :");
        k = input.nextInt();
        // 3^4 = 3*3*3*3
        int i;
        int total = 1;
        /*
        while (i <= k){
            total*=n;
            i++;
        }
        System.out.println("n^k : " + total);
        */
        //for :
        for (i = 1; i <= k; i++) {
            total = total * n;
        }
        System.out.println("n^k :" + total);

    }
}