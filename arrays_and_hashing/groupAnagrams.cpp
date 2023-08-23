#include <vector>
#include <string>
#include <unordered_map>
#include <algorithm>


class Solution {
public:
  vector<vector<string>> groupAnagrams(vector<string>& strs) {
    std::unordered_map<std::string, std::vector<std::string>> con;
    
    for (const std::string& str : strs) {
      std::string strSorted = str;
      std::sort(strSorted.begin(), strSorted.end());
      con[strSorted].emplace_back(str);
    }

    std::vector<std::vector<string>> res;
    for (const auto& entry : con) {
      res.emplace_back(entry.second.begin(), entry.second.end());
    }
    return res;
  }
};