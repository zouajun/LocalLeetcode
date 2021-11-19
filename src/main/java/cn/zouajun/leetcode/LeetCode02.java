package cn.zouajun.leetcode;

import java.util.*;

public class LeetCode02 {

//    给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
//
//    注意：答案中不可以包含重复的三元组。
//
//    示例 1：
//
//    输入：nums = [-1,0,1,2,-1,-4]
//    输出：[[-1,-1,2],[-1,0,1]]
//    示例 2：
//
//    输入：nums = []
//    输出：[]
//    示例 3：
//
//    输入：nums = [0]
//    输出：[]
//
//    提示：
//        0 <= nums.length <= 3000
//        -105 <= nums[i] <= 105


    public static void main(String[] args) {

        int[] nums = {-2,0,1,1,2};

        LeetCode02 leetCode02 = new LeetCode02();
        leetCode02.threeSum(nums);

    }


    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Set<List<Integer>> tempSet = new HashSet<>();


        int i = 0;
        int j = nums.length -1;
        int fx = 0;

        while (j -i > 1){

            if (nums[i] + nums[j] < 0){//第三个找正数

                int t = j -1;
                while(t > i && nums[t] > 0){

                    if(nums[t] + nums[i] + nums[j] < 0){//不可能存在
                        break;
                    }else {
                        if (nums[t] + nums[i] + nums[j] == 0){
                            List<Integer> tempList = new ArrayList<>();
                            tempList.add(nums[i]);
                            tempList.add(nums[t]);
                            tempList.add(nums[j]);
                            tempSet.add(tempList);
                        }
                        t--;
                    }

                }

            }else {//第三个找<=0的数

                int t = i + 1;
                while(t < j && nums[t] <= 0){

                    if(nums[t] + nums[i] + nums[j] > 0){
                        break;
                    } else {
                        if (nums[t] + nums[i] + nums[j] == 0){
                            List<Integer> tempList = new ArrayList<>();
                            tempList.add(nums[i]);
                            tempList.add(nums[t]);
                            tempList.add(nums[j]);
                            tempSet.add(tempList);
                        }
                        t++;
                    }

                }


            }

//            if (nums[i + 1] <= 0) i++;
//            if (nums[j - 1] >= 0) j--;

            if(fx == 0){
                fx = 1;
                if(nums[i + 1] <= 0){
                    i++;
                }else{
                    j--;
                }
            }else {
                fx = 0;
                if (nums[j - 1] >= 0){
                    j--;
                }else{
                    i++;
                }
            }
        }


        return new ArrayList<>(tempSet);
    }

}
