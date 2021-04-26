package solution.leetCode.sortandother;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Anjude
 * Date: 2021/4/26 1:11
 */
public class Q1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();
        int curSum = 0;
        for (int i = len - 1; i >= 0; i--) {
            curSum += nums[i];
            res.add(nums[i]);
            if (2 * curSum > sum) break;
        }
        return res;
    }

    public List<Integer> minSubsequence1(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        int temp=0;
        for(int i=nums.length-1;i>=0;i--){
            sum = sum + nums[i];
            temp=0;
            for(int j=0;j<nums.length && j!=i;j++){
                temp += nums[j];
            }
            if(sum > temp){
                for(int z=nums.length-1;z>=i;z--){
                    list.add(nums[z]);
                }
                break;
            }
        }
        return list;
    }
}
