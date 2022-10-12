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
