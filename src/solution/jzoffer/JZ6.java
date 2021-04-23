package solution.jzoffer;

/**
 * Created by Anjude
 * Date: 2021/4/19 22:40
 */
public class JZ6 {
    public static void main(String[] args) {
        minNumberInRotateArray(new int[]{5,1});
    }
    public static int minNumberInRotateArray(int[] array) {
        int len = array.length;
        if (len == 0) return 0;

        int low = 0, high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] > array[high]) {
                low = mid + 1;
            } else if (array[mid] == array[high]) {
                high = high - 1;
            } else {
                high = mid;
            }
        }
        return array[low];
    }
}
