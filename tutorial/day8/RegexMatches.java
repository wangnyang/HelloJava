import java.util.regex.Matcher;//怎么这里不用 .*; 结尾
import java.util.regex.Pattern;

public class RegexMatches{
	public static void main(String []args){
		String line = "This order was placed for QT3000! ok?";
		String pattern = "(\\d*)(\\d+)(.*)";
		
		Pattern r = Pattern.compile(pattern);
		//匹配符还不太明白
		Matcher m = r.matcher(line);
		if(m.find()){
			System.out.println("Found value:" + m.group(0));
			System.out.println("Found value:" + m.group(1));
			System.out.println("Found value:" + m.group(2));
			System.out.println("Found value:" + m.group(3));
		}
		else{
			System.out.println("No Match");
		}
	}
}