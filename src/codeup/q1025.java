package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1025 {
    public static void main(String[] args) throws IOException {
        int x = 1;

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        for(int i=0; i<s.length; i++){
            int result = (int) Math.pow(10, s.length-1-i);
            System.out.println("[" + Integer.parseInt(s[i]) * result + "]");
        }

        System.out.println("이중for문");
        for(int i=0; i<s.length; i++){
            System.out.print("[");
            System.out.print(s[i]);
            for(int j=s.length-1; j>i; j--)
                System.out.print("0");
            System.out.println("]");
        }
    }
}
