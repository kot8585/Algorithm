package chap04;

import chap04.q4.intAryQueue;

public class IntQueue {
    private int max; //큐의 용량
    private int front; // 첫번째 요소 커서
    private int rear; // 마지막 요소 커서
    private int num; //데이터의 개수
    private int[] que; //큐 본체

    public class EmptyIntStackException extends RuntimeException {
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    public IntQueue(int capacity) {
        max = capacity;
        num = front = rear = 0;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws OverflowIntStackException {
        if (num >= max)
            throw new OverflowIntStackException();
        que[rear++] = x;
        num++;
        if (rear == max)
            rear = 0;
        return x;
    }

    public int deque() throws EmptyIntStackException {
        if(num <= 0)
            throw new EmptyIntStackException();
        int x = que[front++];
        num--;
        if(front >= max)
            front = 0;
        return x;

    }

    public int peek() throws EmptyIntStackException {
        if(num <= 0)
            throw new EmptyIntStackException();
        return que[front];
    }

    //큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    //만약 찾는게 0일 경우에는 어떻게 할건데..
    //front부터 rear까지 선형검색하는 방법이 필요해
    //front를 상승시키다가 max를 만났을때는 0으로 설정??
    public int indexOf(int x) {
        for (int i=0; i<num; i++){
            int idx = (front + i) % max;
            if(que[idx] == x)
                return i;
        }
        return -1;
    }

    public int capacity() {return max;}

    public int size() { return num;}

    public void clear() {
        num = front = rear = 0;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    //큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
    public void dump() {
        if(num <= 0){
            System.out.println("큐가 비어있습니다.");
        }
        for(int i=0; i<num; i++){
            int idx = front + i % max;
            System.out.print(que[idx] + " ");
        }
        System.out.println();
    }


}
