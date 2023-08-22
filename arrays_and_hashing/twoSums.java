import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> rest = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
      if(rest.containsKey(nums[i]))
        return new int[]{rest.get(nums[i]), i};

      rest.put(target - nums[i], i);
    }
    return new int[]{};
  }
}