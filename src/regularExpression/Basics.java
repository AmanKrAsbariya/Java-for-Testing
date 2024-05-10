package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basics {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("hello1");
		boolean matchFound = m.find();
		
		if(matchFound) {
			System.out.println("Match Found");
		}
		else {
			System.out.println("Match not found");
		}

	}

}
