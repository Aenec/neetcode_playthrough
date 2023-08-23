import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> con = new HashMap<>();
        
    for (String str : strs) {
      char[] charArray = str.toCharArray();
      Arrays.sort(charArray);
      String strSorted = new String(charArray);
      con.computeIfAbsent(strSorted, k -> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(con.values());
  }
}
