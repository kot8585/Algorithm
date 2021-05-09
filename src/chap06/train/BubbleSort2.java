package chap06.train;

public class BubbleSort2 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int exchg = 0;
            for(int j=n-1; j>i; j--)
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                    exchg++;
                }

            if(exchg==0) break; //교환이 이루이지지 않으면 종료합니다.
        }
    }
}
