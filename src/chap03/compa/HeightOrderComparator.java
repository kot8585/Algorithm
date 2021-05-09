package chap03.compa;

import java.util.Comparator;

//오름차순으로 정렬하기 위한 comparator

public class HeightOrderComparator implements Comparator<PhyscData> {

    @Override
    public int compare(PhyscData o1, PhyscData o2) {
        return (o1.getHeight() > o2.getHeight()) ? 1 :
                (o1.getHeight() < o2.getHeight()) ? -1 : 0;
    }
}
