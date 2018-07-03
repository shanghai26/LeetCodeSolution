package quickStart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result =new int[2];
        for(int i = 0; i< nums.length;i++){
            for(int j = i+1; j< nums.length-1;j++){
                if((nums[i]+nums[j])== target)
                    result[0]=i;
                    result[1]=j;
                //System.out.print("执行结果为："+"["+i+","+j+"]");
                    return result;
            }
        }
        //return result;
        throw new IllegalArgumentException("no two sum solution");
    }
    /****solution2*************************************************************/
    public int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> hashMapData = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMapData.put(nums[i], i);
        }
        for (int num : nums) {
            if (hashMapData.containsKey(target - num)) {
                return new int[]{hashMapData.get(num), hashMapData.get(target - num)};
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }
    /****solution2*************************************************************/
    /****solution3*************************************************************/
    public int[] twoSumHashNew(int[] nums, int target) {
        HashMap<Integer, Integer> hashMapData = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashMapData.containsKey(complement)) {
                return new int[]{hashMapData.get(complement), i};
            }else {
                hashMapData.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }
    /****solution3*************************************************************/
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.print("执行结果为："+ Arrays.toString(twoSum.twoSumHashNew(nums,target)));
    }
}
