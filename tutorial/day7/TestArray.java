public class TestArray{
	public static void main(String[] args){
		int size = 10;
		double[] myList = new double[size];//����һ����ʮ�����ֵ�����
		myList[0] = 5.6;
		myList[1] = 4.5;
		myList[2] = 3.2;
		myList[3] = 14.6;
		myList[4] = 2.0;
		myList[5] = 34.9;
		myList[6] = 34.2;
		myList[7] = 47.5;
		myList[8] = 99.996;
		myList[9] = 11197;
		double total = 0;
		for(int i = 0;i < size;i++){//��iС��10��i+1
			total += myList[i];//total = total + myList-=[0+1+2....+9]
		}
		System.out.println("�ܺ�Ϊ��" + total);//��ӡtotal
	}
}
