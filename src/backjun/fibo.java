package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo {
    static int fibo0;
    static int fibo1;

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        int[] tests = new int[test];
        
        for(int i=0; i<test; i++){
            tests[i] = Integer.parseInt(br.readLine());
        }

        for(int result : tests){
            fibo0 = 0;
            fibo1 = 0;
            fibonacci(result);
            System.out.println(fibo0 + " " + fibo1);
        }


    }

    static int fibonacci(int n) {

        if( n == 0 ){
            fibo0++;
            return 0;
        }
        if( n == 1 ){
            fibo1++;
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
