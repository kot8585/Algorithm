package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\.");
        System.out.println(s[0]);
        System.out.println(s[1]);
    }
}
