package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/* 7-2. 재귀함수로 구현한 이진 탐색
public class Main {

    public static int binarySearch(Integer[] arr, int target, int lt, int rt) {
        if(lt > rt) return -1;
        int mid = (lt + rt) / 2;

        if(arr[mid] > target) return binarySearch(arr, target, lt, mid-1);
        else if(arr[mid] < target) return binarySearch(arr, target, mid+1, rt);
        else return mid;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int target = kb.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int result = binarySearch(arr, target, 0, n - 1);
        if(result == -1) System.out.println("원소가 존재하지 않습니다.");
        else System.out.println(result+1);
    }
}
 */

/* 7-3. 반복문으로 구현한 이진 탐색
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int target = kb.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int lt = 0;
        int rt = n-1;

        int mid = 0;
        while(lt <= rt) {
            mid = (lt + rt) / 2;

            if(arr[mid] == target) break;
            if(arr[mid] > target) rt = mid-1;
            if(arr[mid] < target) lt = mid+1;
        }
        System.out.println(mid+1);
    }
}
 */

/* 7-5. 부품 찾기
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Integer[] list = new Integer[n];
        for(int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] req_list = new int[m];
        for(int j = 0; j < m; j++) {
            req_list[j] = kb.nextInt();
        }

        Arrays.sort(list);
        for(int k = 0; k < m; k++) {
            int req = req_list[k];
            int lt = 0;
            int rt = n-1;
            boolean isHave = false;
            while(lt <= rt) {
                int mid = (lt + rt) / 2;
                if(list[mid] > req) rt = mid-1;
                if(list[mid] < req) lt = mid+1;
                if(list[mid] == req) {
                    isHave = true;
                    break;
                }
            }
            if(isHave) System.out.print("yes ");
            else System.out.print("no ");
        }
    }
}
 */