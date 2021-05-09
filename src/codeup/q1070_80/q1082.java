package codeup.q1070_80;

import java.io.BufferedReader;
import java.util.Scanner;

public class q1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(16);
        for(int i=1; i<16; i++){
            System.out.printf("%X*%X=%X\n", a,i,a*i);
        }
    }
}
