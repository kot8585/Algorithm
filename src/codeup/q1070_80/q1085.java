package codeup.q1070_80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        double total = Double.parseDouble(s[0]) * Integer.parseInt(s[1]) * Integer.parseInt(s[2]) * Integer.parseInt(s[3]);
        double result = total /8.0d /1024 /1024;
        System.out.printf("%.1f MB",result);
    }
}
