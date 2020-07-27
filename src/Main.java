import java.util.Random;

public class Main {
    // 测试使用q运行opCount个enqueue和dequeue操作所需时间，单位：秒
    private static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for(int i = 0; i < opCount; i++)
            q.dequeue();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    // 测试使用stack运行opCount个push和pop操作所需要的时间,单位:秒
    private static double testStack(Stack<Integer> stack, int opCount) {
        Long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++)
            stack.push(random.nextInt(Integer.MAX_VALUE));
        for (int i = 0; i < opCount; i++)
            stack.pop();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {






//        int opCount = 1000000;
//
//        ArrayStack<Integer> arrayStack = new ArrayStack<>();
//        double time1 = testStack(arrayStack, opCount);
//        System.out.println("ArrayStack, time: " + time1 + " s");
//
//        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
//        double time2 = testStack(arrayStack, opCount);
//        System.out.println("LinkedListStack, time: " + time2 + " s");

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 5; i++) {
//            linkedList.addFirst(i);
//            System.out.println(linkedList);
//        }
//
//        linkedList.add(2, 666);
//        System.out.println(linkedList);
//
//        linkedList.remove(2);
//        System.out.println(linkedList);
//        linkedList.removeFirst();
//        System.out.println(linkedList);
//        linkedList.removeLast();
//        System.out.println(linkedList);

//        int opCount = 100000;
//
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//        double time1 = testQueue(arrayQueue, opCount);
//        System.out.println("ArrayQueue, time:" + time1 + " s");
//
//        LoopQueue<Integer> loopQueue = new LoopQueue<>();
//        double time2 = testQueue(loopQueue, opCount);
//        System.out.println("LoopQueue, time:" + time2 + " s");
//
//        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
//        double time3 = testQueue(linkedListQueue, opCount);
//        System.out.println("LinkedListQueue, time: " + time3 + "s");

//        ArrayStack<Integer> stack = new ArrayStack<>();
//
//        for(int i = 0; i < 5; i++){
//            stack.push(i);
//            System.out.println(stack);
//        }
//
//        stack.pop();
//        System.out.println(stack);

//        Array<Integer> arr = new Array<Integer>();
//        for (int i = 0; i < 10; i++) {
//            arr.addLast(i);
//        }
//        System.out.println(arr);
//
//        arr.add(1, 100);
//        System.out.println(arr);
//
//        arr.addFirst(-1);
//        System.out.println(arr);
//        // [-1,0, 100, 1,2,3,4, 5, 6,7, 8, 9]
//
//        arr.remove(2);
//        System.out.println(arr);
//
//        arr.removeElement(4);
//        System.out.println(arr);
//
//        arr.removeFirst();
//        System.out.println(arr);
    }
}