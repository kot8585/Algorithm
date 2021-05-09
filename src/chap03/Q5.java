package chap03;

public class Q5 {
    static int binSearchX(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl + pr) / 2;
            if(a[pc] == key){
                for(; pc > pl; pc--) {
                    if(a[pc -1] < key)
                        break;
                }
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pl = pc - 1;
            }
        } while (pl < pr);

         return -1;
    }
}
