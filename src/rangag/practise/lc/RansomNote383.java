package rangag.practise.lc;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] map = new int[26];
        for(char c : magazine.toCharArray())
            map[c-'a']++;
        for(char c : ransomNote.toCharArray())
        {
            if(map[c-'a']==0)
                return false;
            else
                map[c-'a']--;
        }
        return true;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magCount = getCounts(magazine);
        Map<Character, Integer> ransomCount = getCounts(ransomNote);
        for (Map.Entry<Character, Integer> entry : ransomCount.entrySet()) {
            if(entry.getValue() > magCount.getOrDefault(entry.getKey(),0))
                return false;
        }
        return true;
    }

    Map<Character, Integer> getCounts(String s)
    {
        HashMap<Character, Integer> magCount = new HashMap<>();
        for (char c : s.toCharArray()){
            int count = magCount.getOrDefault(c,0);
            magCount.put(c,count+1);
        }
        return magCount;
    }
}
