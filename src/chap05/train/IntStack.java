package chap05.train;

public class IntStack {
    private int max;
    private int pointer;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException {
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    public IntStack(int capacity) {
        pointer = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if(pointer >= max)
            throw  new OverflowIntStackException();
        return stk[pointer++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if(pointer <= 0)
            throw new EmptyIntStackException();
        return stk[--pointer];
    }

    //정상에 있는 데이터를 들여다봄
    public int peek() throws EmptyIntStackException {
        if(pointer <= 0)
            throw new EmptyIntStackException();
        return stk[pointer -1];
    }

    public int indexOf(int search) {
        for(int i=pointer; i>0; i--){
            if(stk[i] == search)
                return i;
        }
        return -1;
    }

   public void clear() {
        pointer = 0;
   }


}
