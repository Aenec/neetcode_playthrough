from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs: return [[""]]
        if len(strs) == 1: return [strs]
        
        con = {}
        for string in strs:
            alphabet = [0] * 26
            for char in string:
                diff = ord(char) - ord('a')
                alphabet[diff] += 1

            con.setdefault(tuple(alphabet), []).append(string)
        return con.values()