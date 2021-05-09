package chap06.train;

import java.util.Scanner;

public class InsertionSort {
    //아직  정렬되지 않은 부분의 텃번째 요소를 정렬된 부분의 알맞은 위치에 삽입한다.
    static void insertionSort(int[] a, int n){
        for(int i=1; i<n; i++){
            int j;
            int tmp = a[i]; //정렬되지 않은 부분의 첫번째 요소
            for(j=i; j>0 && a[j-1] > tmp; j--){
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단순 삽입 정렬");
        System.out.println("요솟수 : ");

    }
}
