package solution.jzoffer.day2;

/**
 * JZ11  二分查找
 *
 * @author Anjude
 * @date 2021/7/4 15:49
 */
public class JZ11 {
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            // 如果中间下标小于最高下标的数，说明最小值不在pivot~high的下标范围内
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                // 当 numbers[pivot] == numbers[high]时，说明有重复值，丢弃右边数据
                high -= 1;
            }
        }
        return numbers[low];
    }

    public static void main(String[] args) {
        JZ11 jz11 = new JZ11();
        jz11.minArray(new int[]{3,1});
    }
}



















