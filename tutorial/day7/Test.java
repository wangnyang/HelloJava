public class Test{
	public static void main(String[] args){
		int [] a = {7,3,5,6,4,9,1};//��������a
			for(int i = 0;i < a.length-1;i++){//forѭ������a������
				for(int j = 0;j < a.length-1-i;j++){//forѭ��,aÿѭ��һ�Σ��������ѭ��һ��
					if(a[j]>a[j+1]){//ѭ��ʱ���a[0]����a[1]ʱ����
						int temp;
						temp = a[j];//��a[0]��ֵ��temp
						a[j] = a[j+1];//��a[1]��ֵ��a[0]
						a[j+1] = temp;//��temp��ֵ��a[1]��ʵ���˵���λ��
					}
				}
			}
			System.out.println(Arrays.toString(a));
	}
}