package chap06.train;

public class QuickSort {
    static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    static void quickSort(int[] arr, int left, int right){
        int pl = left; //왼쪽 커서
        int pr = right; //오른쪽 커서
        int x = arr[(pl+pr) / 2]; //pivot

        do{
            while(pl < x) pl++;
            while(pr > x) pr--;
            if(pl <= pr)
                swap(arr, pl++, pr-- );
        }while(pl <= pr);

        if(left < pr) quickSort(arr, left, pr);
        if(pl < right) quickSort(arr, pl, right);
    }
}

