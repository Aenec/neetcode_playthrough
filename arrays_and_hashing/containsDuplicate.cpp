#include <vector>
#include <unordered_set>

class Solution {
public:
  bool containsDuplicate(vector<int>& nums) {
    std::unordered_set<int> container;
    for(size_t i = 0; i < nums.size(); i++) {
      if(container.find(nums[i]) != container.end())
        return true;
      container.insert(nums[i]);
    }
    return false;
  }
};