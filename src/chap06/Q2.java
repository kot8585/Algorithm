package chap06;

import java.util.Scanner;

//비교횟수와 ㄱ환횟수 출력하기
public class Q2 {
    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

    static void bubbleSort(int arr[], int n){
        int  comparecnt= 0; //비교횟수
        int swapcnt = 0; //교환횟수

        for(int i=0; i<n-1; i++){
            System.out.printf("패스%d：\n", i + 1);
            for(int j=n-1; j>i; j--){
                for(int m=0; m<n; m++){
                    System.out.printf("%3d %c", arr[m], (m != j-1) ? ' ' : (arr[j-1] > arr[j] ? '+' : '-') );
                }
                System.out.println();
                comparecnt++;
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                    swapcnt++;
                }
            }
        }

        System.out.printf("비교를 %d회 했습니다.", comparecnt);
        System.out.printf("교환을 %d회 했습니다.", swapcnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.println("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++){
            System.out.println("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);

    }
}
