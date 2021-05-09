package chap01_1;

public class Q1 {
    int max;
    public static void main(String[] args) {
        System.out.println(max4(1,2,3,4));
    }

    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b> max){
            max = b;
        }
        if(c > max)
            max = c;
        if(d > max)
            max = d;
        return max;
    }
}
