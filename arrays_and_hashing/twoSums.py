from typing import List

class Solution:
  def twoSum(self, nums: List[int], target: int) -> List[int]:
    rest = {}
    for i in range(len(nums)):
      if nums[i] in rest.keys():
        return [rest[nums[i]], i]
      
      rest[target - nums[i]] = i
    return []