package dp;

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
