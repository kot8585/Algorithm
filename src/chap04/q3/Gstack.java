package chap04.q3;

import chap04.IntStack;

public class Gstack {
    private int max; //스텍 용량
    private int bottomPointer;
    private int topPointer;
    private int[] stk; //스택 본체

    public Gstack(int capacity) {
        max = capacity;
        stk = new int[capacity];
        bottomPointer = 0;
        topPointer = max;
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    public int pushBottom(int x) {
        if(bottomPointer >= topPointer)
            throw new OverflowIntStackException();
        return stk[bottomPointer++] = x;
    }

    public int pushTop(int x) {
        if(topPointer <= bottomPointer)
            throw new OverflowIntStackException();
        return stk[topPointer--] = x; //이거 값 뭐리턴돼돼
   }
}
