package chap06;

import java.util.Scanner;

public class Q1 {
    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

    static void bubbleSort(int arr[], int n){
        for(int i=0; i < n-1; i++) {
            for(int j=0; j < n-1-i; j++)
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(Q1)");
        System.out.println("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++){
            System.out.println("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0; i<nx; i++){
            System.out.println("x[" + i + "]= " + x[i]);

        }
    }
}
