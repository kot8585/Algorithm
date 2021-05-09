package chap01_1;

import java.util.Scanner;

public class Hrllo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        long f1 = 0;
        long f2 = 1;
        long sum = 0;

        for(int i=1; i<N; i++){
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        System.out.println(sum);
    }
}
