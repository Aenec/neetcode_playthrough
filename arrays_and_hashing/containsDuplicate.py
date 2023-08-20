class Solution:
  def containsDuplicate(self, nums: list[int]) -> bool:
    container = set()
    for item in nums:
      if item in container:
        return True
      container.add(item)
    return False
