package sorting;

import java.util.*;

/* 6-10. 위에서 아래로
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
 */

/* 6-11. 성적이 낮은 순서로 학생 출력하기
public class Main {

    static class Student implements Comparable<Student> {

        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return this.name;
        }

        public int getScore() {
            return this.score;
        }

        @Override
        public int compareTo(Student o) {
            if(this.score < o.score) return -1;
            else return +1;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        int n = kb.nextInt();

        for(int i = 0; i < n; i++) {
            String name = kb.next();
            int score = kb.nextInt();
            studentList.add(new Student(name, score));
        }

        Collections.sort(studentList);

        for(Student x : studentList) {
            System.out.print(x.getName() + " ");
        }

    }
}
 */

/* 6-12. 두 배열의 원소 교체
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        Integer[] target_arr = new Integer[n];
        Integer[] change_arr = new Integer[n];
        int cnt = 0;
        int result = 0;
        for(int i = 0; i < n; i++) {
            target_arr[i] = kb.nextInt();
        }
        for(int j = 0; j < n; j++) {
            change_arr[j] = kb.nextInt();
        }

        Arrays.sort(change_arr, Collections.reverseOrder());
        Arrays.sort(target_arr);

        for(int i = 0; i < n; i++) {
            if(target_arr[i] < change_arr[i]) {
                int temp = target_arr[i];
                target_arr[i] = change_arr[i];
                change_arr[i] = temp;
                cnt++;
                if(cnt >= k) break;
            }
        }

        for(Integer x : target_arr) {
            result += x;
        }
        System.out.println(result);
    }
}
 */