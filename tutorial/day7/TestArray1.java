public class TestArray1{
	public static void main(String [] args){
		double [] myList = {1.7,2.9,4.6,11.3,2.3};//��������myList
		
		for (int i = 0;i < myList.length;i++){//forѭ��
			System.out.println(myList[i] + " ");//��ӡ����ȫ������
		}
		double total = 0;
		for(int i = 0;i < myList.length; i++){
			total += myList[i];//���
		}
		System.out.println("total is" + total);
		
		double max = myList[0];
		for (int i = 0;i < myList.length; i++){
			if (myList[i] > max) max = myList[i];//�����ֵ
		}
		System.out.println("Max is" + max);
	}
	
}