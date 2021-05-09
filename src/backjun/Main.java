package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        dp[0][0] = 1; //T=0일때 0호출 횟수
        dp[0][1] = 0; //T=0일때 1호출 횟수
        dp[1][0] = 0; //T=1일때 0호출 횟수
        dp[1][1] = 1; //T=1일때 0호출 횟수

        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append("\n");
        }
        System.out.println(sb);
    }

    static Integer[] fibonacci(int T) {
        if( dp[T][0] == null || dp[T][1] == null) {
            // 각 N에 대한 0 호출 횟수와 1 호출 횟수를 재귀호출한다.
            dp[T][0] = fibonacci(T - 1)[0] + fibonacci(T - 2)[0];
            dp[T][1] = fibonacci(T - 1)[1] + fibonacci(T - 2)[1];
        }
        return dp[T];
    }
}
