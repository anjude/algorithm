package test;

/**
 * Created by Anjude
 * Date: 2021/4/19 22:18
 */
class Main {
    // 由于中位数会受长度是奇偶数的影响，所以我们可以把问题转化为求
    // (（n+m+1)/2+(n+m+2)/2)/2。
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
//        return (findKthNumber(nums1, 0, n-1, nums2,0,m-1,(n+m+1)/2) +
//                findKthNumber(nums1, 0, m-1,nums2,0,m-1,(n+m+2)/2)) /2;
        return 1;
    }

    public static int findKth(int[] arr1, int[] arr2, int k) {
        if (arr1 == null || arr1.length < 1)
            return arr2[k - 1];
        if (arr2 == null || arr2.length < 1)
            return arr1[k - 1];
        // 注意这个函数的参数有7个，上面那个函数的参数只有3个，同名不同函数哈
        return findKth(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1, k - 1);
    }

    public static int findKth(int[] arr1, int l1, int r1, int[] arr2, int l2, int r2, int k) {
        // 递归结束条件
        if (l1 > r1)
            return arr2[l2 + k];
        if (l2 > r2)
            return arr1[l1 + k];
        if (k == 0)// 注意，k == 0的结束条件与上面两个结束条件不能颠倒。
            return Math.min(arr1[l1], arr2[l2]);
        // 比较中点値，中点値小的一半必然在前 k / 2 小里面
        int md1 = Math.min(l1 + k / 2, r1);
        int md2 = l2 + k / 2 < (r2 - l1) ? l2 + k / 2 : r2;
        if (arr1[md1] < arr2[md2])
            return findKth(arr1, md1 + 1, r1, arr2, l2, r2, k - k / 2 - 1);
        else if (arr1[md1] > arr2[md2])
            return findKth(arr1, l1, r1, arr2, md2 + 1, r2, k - k / 2 - 1);
        else
            return arr1[md1];   // 返回arr2[md2]也可以，一样的。
    }

    // 测试
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {0, 4, 6, 7, 8};
        System.out.println(findKth(arr1, arr2, 7));
    }
}
