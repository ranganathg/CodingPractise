package rangag.practise.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        HashMap<Integer, String> mapper = new HashMap<>();
        mapper.put(3, "Fizz");
        mapper.put(5, "Buzz");
        List<Integer> divisors = new ArrayList<>(Arrays.asList(3, 5));
        for (int i = 1; i <= n; i++) {
            String ansStr = "";
            for (Integer in :
                    divisors) {
                if (i % in == 0)
                    ansStr += mapper.get(in);
            }
            if (ansStr == "")
                ansStr += Integer.toString(i);
            answer.add(ansStr);
        }
        return answer;
    }

    public List<String> fizzBuzz2(int n) {
        List<String> ans = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;
            if (divBy3 && divBy5)
                ans.add("FizzBuzz");
            else if (divBy3)
                ans.add("Fizz");
            else if (divBy5)
                ans.add("Buzz");
            else
                ans.add(i + "");
        }
        return ans;
    }
}
