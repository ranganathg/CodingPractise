package rangag.practise.leetcode;
/**
 * This one is from codekata - 19
 */
import java.util.HashSet;
import java.util.Set;

public class WordChains {
	static Set<String> wordDictionary = GetWordDictionary();

	public static void main(String[] args) {

	}

	private static Set<String> GetWordDictionary() {
		return new HashSet<String>();
	}

	static void PrintWordChain(char[] start, char[] end) {
		for (int i = 0; i < start.length; i++) {
			if(start[i]!=end[i]){
				start[i]=end[i];
				
			}
		}
	}
}