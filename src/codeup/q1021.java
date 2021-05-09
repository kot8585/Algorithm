package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());

        System.out.println("data 입력");
        char[] data = br.readLine().toCharArray();
        System.out.println(data);
    }
}
