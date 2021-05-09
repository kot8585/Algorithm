package chap04.q4;

public class intAryQueue {
    private int max;
    private int num; //현재 데이터수
    private int[] que;

    public class EmptyIntStackException extends RuntimeException {
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    public intAryQueue(int capacity) {
        max = capacity;
        num = 0;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int inqueue(int x) {
        if(num >= max) {
            throw new OverflowIntStackException();
        }
        return que[num++] = x;
    }

    public int dequeue() {
        if(num <= 0) {
            throw new OverflowIntStackException();
        }
        int result = que[0];
        for(int i=0; i<num; i++){
            que[i] = que[i+1];
        }
        num--;
        return result;
    }

}
