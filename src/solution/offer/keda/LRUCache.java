package solution.offer.keda;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author jane
 * @create 2021-08-28 14:56
 */
public class LRUCache {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(1);
        lruCache.put(2, 1);
//        lruCache.put(2, 2);
//        lruCache.get(1);
//        lruCache.put(3, 3);
        int i = lruCache.get(1);
        int a = -1;
        System.out.println(i);
    }

    public static int size = 0;
    public static int count = 0;
    LinkedList<HashMap<Integer, Integer>> queue;

    public LRUCache(int capacity) {
        size = capacity;
        queue = new LinkedList<>();
    }

    public int get(int key) {
        for (int x = 0; x < queue.size(); x++) {
            HashMap<Integer, Integer> hashMap = queue.get(x);
            if (hashMap.get(key) != null) {
                queue.remove(x);
                queue.add(hashMap);
                return hashMap.get(key);
            }

        }
        return -1;
    }

    public void put(int key, int value) {
        if (count >= size) {
            queue.removeFirst();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(key, value);
        queue.add(map);
        count++;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */