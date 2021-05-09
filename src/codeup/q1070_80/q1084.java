package codeup.q1070_80;

import java.io.*;

public class q1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split(" ");
        int count = 0;

        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < Integer.valueOf(n[0]); i++)
                for (int j = 0; j < Integer.parseInt(n[1]); j++)
                    for (int k = 0; k < Integer.parseInt(n[2]); k++) {
                        bw.write(i + " " + j + " " + k + "\n");
                        count++;
                    }
            bw.write(String.valueOf(count));
            bw.flush();
        } catch  (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
