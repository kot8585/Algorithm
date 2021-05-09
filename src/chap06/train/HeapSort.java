package chap06.train;

import java.util.Scanner;

public class HeapSort {
    static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    static void heapify(int[] arr, int left, int right){
        //부모노드랑 자식노드 비교해서 자식노드가 더 크면 바꾸기
        int tmp = arr[left];
        int parent;
        int child; //자식 노드중 큰거

        for(parent=left; parent<(right+1)/2; parent = child){ //right의 부모노드까지
            int cl = (parent*2+1);
            int cr = (parent*2+2);
            child = (cl > cr) ? cl : cr;

            if(arr[parent] > arr[child])
                break;

            swap(arr, parent, child);
        }

    }


    static void heapSort(int[] a, int n){
        //heapify를 이용해 힙 구조 만들기
        for(int i=(n-1)/2; i<=0; i--) // a[i] ~ a[n-1]를 힙으로 만들기 i=4,3,2,1,0 //i=(n-1)/2 자식노드 있는데 까지만 부르는거 아닌가...? 그러면 (n-2)/2 아니야?
            heapify(a, i, n-1);

        //루트와 맨마지막 요소를 바꿔서 힙 정렬로 바꾸기
        for(int i=n-1; i<0; i--){
            swap(a, 0, i);
            heapify(a, 0, i-1);
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 입력 : ");
        int nx = sc.nextInt();

        int[] arr = new int[nx];

        for(int i=0; i<nx; i++){
            System.out.println("x[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        heapSort(arr, nx);
    }
}
