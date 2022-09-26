package greedy;

import java.util.*;

/* 3-1. 거스름돈
public class Main {

    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;
        int[] money = {500, 100, 50, 10};

        for(int x : money) {
            cnt += n / x;
            n %= x;
        }
        System.out.println(cnt);
    }
}
 */

/* 3-2. 큰 수의 법칙
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cnt = 0, answer = 0, lt = 0;
        int n = kb.nextInt();
        int m = kb.nextInt();
        int k = kb.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < m; i++) {
            if(cnt == k) {
                lt++;
                answer += arr[lt];
                cnt = 0;
                lt = 0;
            } else {
                answer += arr[lt];
                cnt++;
            }
        }
        System.out.println(answer);
    }
}
 */

/* 3-3. 숫자 카드 게임
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int answer = 0;
        int n = kb.nextInt();
        int m = kb.nextInt();

        for(int i = 0; i< n; i++) {
            int[] arr = new int[m];
            for(int j = 0; j < m; j++) {
                arr[j] = kb.nextInt();
            }
            int num = Arrays.stream(arr).min().getAsInt();
            if(answer < num) answer = num;
        }
        System.out.println(answer);
    }
}
 */

/* 3-4. 1이 될 때까지
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cnt = 0;
        int n = kb.nextInt();
        int k = kb.nextInt();

        while(n != 1) {
            if(n % k == 0) {
                n = n / k;
                cnt++;
            } else {
                n -= 1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
 */

