import java.util.regex.*;//ʹ��import����һЩ����õĶ���

public class RegexExample1{
	public static void main(String []args){
		String content = "I am wy" + "wangyang";
		
		String pattern = ".*wang.*";
		
		boolean isMatch = Pattern.matches(pattern,content);//������λ���̫����PΪʲôҪ��д��.matches ��ƥ�����˼��
		System.out.println("�ַ������Ƿ�����ˡ�wang���ַ���?" + isMatch);
	}
}