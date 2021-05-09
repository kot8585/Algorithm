package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dates = br.readLine().split("\\.");
        System.out.printf("%s-%s-$s", dates[2], dates[1], dates[0]);

    }
}
