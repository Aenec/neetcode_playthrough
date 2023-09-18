import heapq
from typing import List
from collections import Counter

class Solution:
  def topKFrequent(self, nums: List[int], k: int) -> List[int]:
    freqDict = Counter(nums)
    minHeap = []
    for num, freq in freqDict.items():
      if len(minHeap) < k:
        heapq.heappush(minHeap, (freq, num))
      else:
        if freq > minHeap[0][0]:
          heapq.heappop(minHeap)
          heapq.heappush(minHeap, (freq, num))
      return [el for _, el in minHeap]