package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//선형 검색(보초법)
public class SeqSearchSen {
    static int seqSearchSen(int[] arr, int cnt, int search){
        int i=0;

        arr[cnt] = search;
        for(; i<cnt; i++){
            if(arr[i] == search)
                break;
        }
        return i == cnt ? -1 : i;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("배열의 요솟수를 입력해 주세요");
        int cnt = Integer.parseInt(br.readLine());
        int[] arr= new int[cnt + 1];

        for(int i=0; i<cnt; i++){
            System.out.println("arr[" + i + "] : ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("검색할 값을 입력해주세요 : ");
        int search = Integer.parseInt(br.readLine());
        int result = seqSearchSen(arr, cnt, search);

        if (result == -1){
            System.out.println("찾는 값이 없습니다.");
        } else {
            System.out.println(result + "번째에 있습니다.");
        }
    }
}
