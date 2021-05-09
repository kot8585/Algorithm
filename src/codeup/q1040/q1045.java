package codeup.q1040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int num1 = Integer.parseInt(a[0]);
        int num2 = Integer.parseInt(a[1]);
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.printf("%.2f", (float)num1/num2);
    }
}
