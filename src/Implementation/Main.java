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

/* 4-2. 시각
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int h = kb.nextInt();
        int cnt = 0;

        for(int i = 0; i <= h; i++) {
            for(int j = 0; j < 60; j++) {
                for(int k = 0; k < 60; k++) {
                    String str_i = String.valueOf(i);
                    String str_j = String.valueOf(j);
                    String str_k = String.valueOf(k);
                    String str = str_i + str_j + str_k;
                    if(str.contains("3")) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
 */

/* 4-3. 왕실의 나이트
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String cur = kb.next();
        char[] row = {'1', '2', '3', '4', '5', '6', '7', '8'};
        char[] col = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int x, y;
        int cnt = 0;

        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        char cur_x = cur.charAt(0);
        char cur_y = cur.charAt(1);
        x = cur.indexOf(cur_x) + 1;
        y = Character.getNumericValue(cur_y);
        int nx, ny;

        for(int i = 0; i < dx.length; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if(nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8) cnt++;
        }
        System.out.println(cnt);
    }
}
 */

/* 4-4. 게임 개발
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cnt = 0, answer = 1;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int n = kb.nextInt();
        int m = kb.nextInt();
        int x = kb.nextInt();
        int y = kb.nextInt();
        int direction = kb.nextInt();
        int new_direction = 0;
        int[][] check = new int[n][m];
        int[][] gameMap = new int[n][m];
        check[x][y] = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                gameMap[i][j] = kb.nextInt();
            }
        }

        while(true) {
            new_direction = direction - 1;
            if(new_direction == -1) new_direction = 3;
            direction = new_direction;

            int nx = x + dx[new_direction];
            int ny = y + dy[new_direction];
            if(check[nx][ny] == 0 && gameMap[nx][ny] == 0) {
                check[nx][ny] = 1;
                x = nx;
                y = ny;
                answer++;
                cnt = 0;
            } else {
                cnt++;
            }
            if(cnt == 4) {
                int back_direction = direction + 2;
                if(back_direction == 4) back_direction = 0;
                if(back_direction == 5) back_direction = 1;

                nx = x + dx[back_direction];
                ny = y + dy[back_direction];

                if(gameMap[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break;
                }
                cnt = 0;
            }
        }
        System.out.println(answer);
    }
}
 */