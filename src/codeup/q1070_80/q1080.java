package codeup.q1070_80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1080 {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(i =1; sum<a; i++){
            sum += i;
        }
        System.out.println(--i);
    }
}
