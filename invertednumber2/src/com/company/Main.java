package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);

        int nu = 0, intNum;

        System.out.println("digite numero");
        nu = sc.nextInt();
        String result = "";

        while (nu > 10) {
            result = result + (nu % 10);
            nu = nu / 10;

        }
        result = result + nu;
        System.out.println(result);

    }
}
