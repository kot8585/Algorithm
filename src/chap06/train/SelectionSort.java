package chap06.train;

public class SelectionSort {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void selectionSort(int[] arr, int n){
        //1. 아직 정렬하지 않은 부분에서 가장 작은 키의 값(a[min])을 선택합니다.
        //2. a[main]과 아직 정렬하지 않은 부분의 첫번째 요소를 교환합니다.
        for(int i=0; i<n-1; i++){
            int min = i; //아직 정렬하지 않은 부분에서 갖아 작은 요소의 인덱스 기록
            for(int j=i+1; j<n; j++)
                if(arr[j] < arr[min])
                    min = j;
            swap(arr, min, i);
        }
    }
}
