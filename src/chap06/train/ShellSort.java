package chap06.train;

import java.util.Scanner;

public class ShellSort {
    static void shellSort(int[] a, int n){ //n은 요소개수
        for(int h = n/2; h > 0; h /= 2) {   //Outer Loop는 h-정렬 결정 //2
            for(int i=h; i<n; i++) { //비교할 오른쪽의 인덱스값 결정 2.3.4.5.6.7 //단순 선택 정렬
                int j;
                int tmp = a[i]; //오른쪽 인덱스의 값 저장 2
                for(j = i-h;  j>=0 && a[j] > tmp; j -= h){ //tmp값이 비교대상인 a[j]보다작을경우 교환
                    a[j+h] = a[j];
                }
                a[j+h] = tmp;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("셸 정렬(버전 1)");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++){
            System.out.print("x[" + i + "] :");
            x[i] = sc.nextInt();
        }

        shellSort(x,nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0; i<nx; i++) {
            System.out.print("x[" + i + "] :");
        }
    }
}
