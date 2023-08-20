import java.util.HashSet;

class Solution {
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> container = new HashSet<>();
    for(int item : nums) {
      if(container.contains(item))
        return true;
      container.add(item);
    }
    return false;
  }
}