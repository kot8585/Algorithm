package chap03.compa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//신체검사 데이터 배열에서 이진 검색하기
public class PhysExamSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("이나령", 162, 0.3),
                new PhyscData("유지훈", 168, 0.4),
                new PhyscData("문효정", 163, 0.8),
                new PhyscData("김한결", 180, 0.9),
                new PhyscData("홍준기", 178, 0.7),
                new PhyscData("전서현", 161, 1.5),
        };

        System.out.print("몇 cm인 사람을 찾고 있나요? : ");
        int height = sc.nextInt();



        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), new Comparator<PhyscData>() {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.getHeight() > o2.getHeight()) ? 1 :
                        (o1.getHeight() < o2.getHeight()) ? -1 : 0;
            }
        });

        if(idx < 0)
            System.out.println("요소가 없습니다.");
        else {
            System.out.println(idx + "에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
