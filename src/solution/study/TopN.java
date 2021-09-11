package solution.study;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * TopN  TODO
 *
 * @author Anjude
 * @date 2021/9/11 14:15
 */
public class TopN {
    private int size;

    public TopN(int size) {
        this.size = size;
    }

    public int[] topN(int[] list) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(5, (o1, o2) -> o1 - o2);
        for (int i : list) {
            if (size == queue.size()) {
                if (queue.peek() > i) {
                    continue;
                } else queue.poll();
            }
            queue.add(i);
        }

        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = queue.poll();
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = {2, 5, 1, 6, 4, 7, 9, 8, 3};
        int[] list = new TopN(5).topN(ints);
        System.out.println(Arrays.toString(list));
    }
}
