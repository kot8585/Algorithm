package chap03.compa;

import java.util.Comparator;

//신체검사 데이터를 정의합니다.
public class PhyscData {
    private String name;
    private  int height;
    private double vision; //시력


    public PhyscData(String name, int height, double vision) {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getVision() {
        return vision;
    }


    @Override
    public String toString() {
        return "PhyscData{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", vision=" + vision +
                '}';
    }
}
