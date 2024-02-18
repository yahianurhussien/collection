package algorithm.practice.collection.collections;

class MyQueue<T> {

    private final T[] queue;
    private int head;
    private int tail;
    private int size;


    //implement a queue which will me generic for any object
    public MyQueue(int sizeOfQueue) {
        this.queue = (T[]) new Object[sizeOfQueue];
        this.head = 0;
        this.tail = -1;
        this.size = 0;
    }

    //add element to the queue
    public void enQueue(T element) throws Exception {
        if (!isFull()) {
            tail = (tail + 1) % queue.length;
            queue[tail] = element;

            size++;

        } else if (isFull() && size < queue.length) {
            tail = (tail + 1) % queue.length;
            queue[tail] = element;
            size++;
        } else {
        }

    }


    //remove element from the queue

    public void deQueue() throws Exception {
        if (!isEmpty()) {
            head = (head + 1) % queue.length;
            size--;
        }

    }

    //show the elements in the queue
    // this needs to be updated to print all elements in the circular array
    public void show() {
        System.out.println();
        for (int i = head; i < queue.length; i++) {
            System.out.print(queue[i] + " ");
        }

    }


    public boolean isFull() {
        return tail == queue.length;

    }

    public boolean isEmpty() {
        return size == 0;
    }


}

class TestQueue {
    public static void main(String[] args) throws Exception {

        MyQueue<Integer> myIntegerQueue = new MyQueue<>(5);

        myIntegerQueue.enQueue(3);
        myIntegerQueue.enQueue(5);
        myIntegerQueue.enQueue(7);
        myIntegerQueue.enQueue(9);
        myIntegerQueue.enQueue(11);
        myIntegerQueue.deQueue();
        myIntegerQueue.show();
        //myQueue.enQueue(13);
        //myQueue.enQueue(15);
        // myQueue.show();

        MyQueue<String> myStringQueue = new MyQueue<>(5);

        myStringQueue.enQueue("Yahia");
        myStringQueue.enQueue("John");
        myStringQueue.enQueue("Salah");
        myStringQueue.enQueue("Kerie");
        myStringQueue.enQueue("Ibrahim");
        myStringQueue.deQueue();
        myStringQueue.show();


    }
}
