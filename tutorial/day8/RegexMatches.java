import java.util.regex.Matcher;//��ô���ﲻ�� .*; ��β
import java.util.regex.Pattern;

public class RegexMatches{
	public static void main(String []args){
		String line = "This order was placed for QT3000! ok?";
		String pattern = "(\\d*)(\\d+)(.*)";
		
		Pattern r = Pattern.compile(pattern);
		//ƥ�������̫����
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