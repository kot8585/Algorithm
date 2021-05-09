package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayEqual {
    static boolean equals(int[] a, int[] b){
        if(a.length != b.length)
            return false;

        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("배열 a의 요솟수: ");
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            System.out.print("arr["+i+"] : ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("배열 arrB의 요솟수: ");
        int b = Integer.parseInt(br.readLine());
        int[] arrB = new int[a];
        for(int i=0; i<a; i++){
            System.out.print("arrB["+i+"] : ");
            arrB[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("배열 a와 b는 " + (equals(arr, arrB) ? "같습니다" : "같지 않습니다."));
        System.out.println("배열 a와 b는 " + (Arrays.equals(arr, arrB) ? "같습니다" : "같지 않습니다."));
    }
}
