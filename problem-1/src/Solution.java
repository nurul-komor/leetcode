import java.util.HashMap;

public class Solution {
    
    public int[] twoSum(int [] nums, int target) {
        HashMap <Integer,Integer> newMap = new HashMap();
        for (int i=0;i<nums.length;i++) {
            if(newMap.containsKey(target- nums[i])){
                int firstIndex = newMap.get(target-nums[i]);
                return new int[]{firstIndex,i};
            }

            newMap.put(nums[i],i);
        }
        return nums;
    }
}
