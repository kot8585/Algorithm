package chap06.train;

public class ShellSort2 {
    static void ShellSort2(int[] arr, int n){
        int h;
        for(h=1; h<n/9; h =h*3 + 1) //너무 크면 효과가 없기 땨뮨애 배열의 요솟수 n을 9로 나누 값을 넘지 않도록 h 초키값 설정
            ;

        for(; h>0; h/= 3) //h-정렬 설절
            for(int i=h; i<n; i++){
                int j;
                int tmp = arr[i];
                for(j=i-h; j>=0 && arr[j]>tmp; j-=h)
                    arr[j+h] = arr[j];
                arr[j+h] = tmp;
            }
    }
}
