package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArr = br.readLine().toCharArray();
        for(char c : cArr){
            System.out.printf("'%c'\n", c);
        }
    }
}
