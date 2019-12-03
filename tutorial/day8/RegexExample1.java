import java.util.regex.*;//使用import导入一些定义好的东西

public class RegexExample1{
	public static void main(String []args){
		String content = "I am wy" + "wangyang";
		
		String pattern = ".*wang.*";
		
		boolean isMatch = Pattern.matches(pattern,content);//后面这段还不太懂，P为什么要大写，.matches 是匹配的意思？
		System.out.println("字符串中是否包含了‘wang’字符串?" + isMatch);
	}
}