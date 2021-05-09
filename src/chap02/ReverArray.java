package chap02;

public class ReverArray {
    static void swap(int[] a, int idx1, int idx2){
        int t = idx1; a[idx1] = idx2; a[idx2] = t;
    }

    static void reverse(int a[]){
        for(int i=0; i<a.length/2; i++){
            swap(a, i, a.length-i-1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reverse(array);
        for(int arr : array){
            System.out.println(arr);
        }
    }
}
