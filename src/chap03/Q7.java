package chap03;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7 {
    static class PhysData{
        private String name;    //이름
        private int height;     //키
        private double vision; //시력

        public PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhysData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhysData> VISION_ORDER = new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhysData> {
            public int compare(PhysData d1, PhysData d2) {
                return (d1.vision > d2.vision) ? 1 :
                        (d1.vision < d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhysData[] x = {					// 키의 오름차순으로 정렬되어 있습니다.
                new PhysData("이나령", 162, 0.3),
                new PhysData("유지훈", 168, 0.4),
                new PhysData("전서현", 173, 0.7),
                new PhysData("김한결", 169, 0.8),
                new PhysData("이호연", 174, 1.2),
                new PhysData("홍준기", 171, 1.5),
                new PhysData("이수민", 175, 2.0), };
        System.out.print("시력이 몇몇인 사람을 찾고 있나요?：");
        double vision = stdIn.nextDouble();						// 키 값 입력
        int idx = Arrays.binarySearch(
                x,									// 배열x에서
                new PhysData("", 0, vision),		// 키가 height인 요소를
                PhysData.VISION_ORDER				// HEIGHT_ORDER에 의해  검색
        );

        if (idx < 0)
            System.out.println("요소가 없습니다.");
        else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터：" + x[idx]);
        }
    }
}
