package codeup.q1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hexNum = Integer.parseInt(br.readLine(), 16);
        String octNum = Integer.toOctalString(hexNum);
        System.out.println(octNum);
    }
}
