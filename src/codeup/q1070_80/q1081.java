package codeup.q1070_80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1081 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        for(int i=1; i<=a; i++)
            for(int j=1; j<=b; j++)
                System.out.printf("%d %d \n", i, j);

    }
}
