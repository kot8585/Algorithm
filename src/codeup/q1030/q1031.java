package codeup.q1030;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int octNum = Integer.parseInt(br.readLine());
        System.out.println(Integer.toOctalString(octNum));
    }
}
