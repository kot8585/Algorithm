package codeup.q1050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        if(a[0].equals("1")&&a[1].equals("1"))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
