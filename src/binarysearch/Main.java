package binarysearch;

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
