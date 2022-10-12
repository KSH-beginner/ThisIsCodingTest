package dp;

import java.util.*;

/* 8-2. 피보나치 수열 (탑다운 - 재귀)
public class Main {

    public static long[] dp = new long[100];

    public static long fibo(int x) {
        if(x == 1 || x == 2) {
            return 1;
        }

        if(dp[x] != 0) {
            return dp[x];
        }

        dp[x] = fibo(x-2) + fibo(x-1);
        return dp[x];
    }

    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
}
 */

/* 8-4. 피보나치 수열(바텀 업 - 반복문)
public class Main {

    public static void main(String[] args) {
        long[] dp = new long[100];

        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i <= 50; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        System.out.println(dp[50]);
    }
}
 */

/* 8-5. 1로 만들기
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int[] dp = new int[x+1];
        dp[1] = 0;

        for(int i = 2; i <= x; i++) {
            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
            if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
            if(i % 5 == 0) dp[i] = Math.min(dp[i], dp[i/5] + 1);
        }
        System.out.println(dp[x]);
    }
}
 */
