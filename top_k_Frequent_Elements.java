import java.util.*;

class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> frq = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
      if(!frq.containsKey(nums[i]))
        frq.put(nums[i], 1);
      else
        frq.replace(nums[i], frq.get(nums[i])+1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
    for(Map.Entry<Integer, Integer> set : frq.entrySet()) {
      pq.add(set);
      if (pq.size() > k) pq.poll();
    }

    int right = k;
    int[] ret = new int[k];
    while (!pq.isEmpty())
      ret[--right] = pq.poll().getKey();
    return ret;
  }
}