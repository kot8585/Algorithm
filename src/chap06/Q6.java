package chap06;

import java.util.Scanner;

//단순 선택 정렬 프로그램
//정렬하지 않은 부분의 첫번째 요소위에는 기호 *를, 정렬하지 않은 부분의 가장 작은 값의 요소 위에는 +를 출력하세요
public class Q6 {
    static void swap(int arr[], int idx1, int idx2){
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

    static void selectSort(int arr[], int length){
        for(int i=0; i<length-1; i++){ //왜 length-1일까?
            int min = i; //미정렬된 부분 최소 요소의 index
            for(int j=i+1; j<length; j++)
                if(arr[j] < arr[min])
                    min = j;

            for(int m=0; m<length; m++)
                System.out.print((m == i) ? "  *" : (m==min) ? "  +" : "   ");
            System.out.println();

            for(int m=0; m<length; m++)
                System.out.printf("%3d", arr[m]);
            System.out.println();

            swap(arr, i, min);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순선택정렬");
        System.out.print("요솟수：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        selectSort(x, nx); // 배열 x를 단순선택정렬
    }
}
