#include <string>
#include <unordered_map>

class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size() != t.size())
            return false;

        unordered_map<char, size_t> smap;
        unordered_map<char, size_t> tmap;
        for(size_t i = 0; i < s.size(); i++) {
            smap[s[i]]++;
            tmap[t[i]]++;
        }
        return smap == tmap;
    }
};