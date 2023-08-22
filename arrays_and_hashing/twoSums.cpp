#include <vector>
#include <unordered_map>

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int, int> rest;
        for(int i = 0; i < nums.size(); i++) {
            if(rest.find(nums[i]) != rest.end())
                return vector<int>{rest[nums[i]], i};

            rest[target - nums[i]] = i;
        }
        return vector<int>{};
    }
};