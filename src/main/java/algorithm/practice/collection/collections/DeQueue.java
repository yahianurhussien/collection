package algorithm.practice.collection.collections;

import java.util.*;

public class DeQueue {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Deque> list = new ArrayList<>();
        Deque deque = new ArrayDeque<>();
        Deque dequeCopy = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
        }

        dequeCopy.addAll(deque);

        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            Deque deque1 = new ArrayDeque<>();
            for (int i = 0; i < m; i++) {

                System.out.println(iterator.next());
            }
        }

        System.out.println(deque.peek());
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque);

    }
}
