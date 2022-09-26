package Implementation;

import java.util.Scanner;

/* 4-1. 상하좌우
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        String[] plans = kb.nextLine().split(" ");
        int x = 1;
        int y = 1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        for(int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            int nx = 0, ny = 0;
            for(int j = 0; j < 4; j++) {
                if(plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if(nx < 1 || ny < 1 || nx > n || ny > n) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
 */
