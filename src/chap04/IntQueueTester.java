package chap04;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQueue intQueue = new IntQueue(64); //최대 64개를 인큐할 수 있는 큐

        while(true) {
            System.out.println("현재 데이터 수 : " + intQueue.size() + "/" + intQueue.capacity());
            System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료");
            int menu = sc.nextInt();
            if(menu == 0) break;

            switch (menu) {
                case 1:
                    System.out.print("인큐할 데이터: ");
                    int data = sc.nextInt();
                    try{
                        intQueue.enque(data);
                    } catch (IntQueue.OverflowIntStackException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
            }
        }
    }
}
