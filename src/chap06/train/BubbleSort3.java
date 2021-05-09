package chap06.train;

public class BubbleSort3 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] arr, int n){
        int k = 0; //첫번째 패스에서는 모든 요소를 검사해야 한다.
        while(k<n-1){
            int last = n-1;
            for(int j=n-1; j>last; j--)
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                    last = j;
                }
            k = last;
        }
    }
}
