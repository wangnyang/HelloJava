public class TestArray1{
	public static void main(String [] args){
		double [] myList = {1.7,2.9,4.6,11.3,2.3};//创建数组myList
		
		for (int i = 0;i < myList.length;i++){//for循环
			System.out.println(myList[i] + " ");//打印数组全部数字
		}
		double total = 0;
		for(int i = 0;i < myList.length; i++){
			total += myList[i];//求和
		}
		System.out.println("total is" + total);
		
		double max = myList[0];
		for (int i = 0;i < myList.length; i++){
			if (myList[i] > max) max = myList[i];//找最大值
		}
		System.out.println("Max is" + max);
	}
	
}