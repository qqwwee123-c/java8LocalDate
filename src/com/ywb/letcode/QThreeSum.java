package com.ywb.letcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QThreeSum {


//    给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
//
//    注意：答案中不可以包含重复的三元组。
//
//    例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//    满足要求的三元组集合为：
//            [
//            [-1, 0, 1],
//            [-1, -1, 2]
//            ]




    public static void main(String[] args) {
        int [] arr = {-2,0,0,2,2};
        List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0 ;i<nums.length ;i++){
            if(nums[i] > 0)
                break;
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int L = i+1;
            int R = nums.length-1;
            while (L < R){
                int sum = nums[i]+nums[L]+nums[R];
                if(sum == 0){
                    ArrayList inner =new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[L]);
                    inner.add(nums[R]);
                    outer.add(inner);
                    while (L<R && nums[L] == nums[L+1])
                        L++;
                    while (L<R && nums[R] == nums[R-1])
                        R--;
                    L++;
                    R--;
                } else if(sum < 0){
                    L++;
                } else{
                    R--;
                }



            }
        }
        return outer;
    }
}
