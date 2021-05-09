package codeup.q1070_80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<=a; i++){
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
