public class Test{
	public static void main(String[] args){
		int [] a = {7,3,5,6,4,9,1};//创建数组a
			for(int i = 0;i < a.length-1;i++){//for循环数组a的数字
				for(int j = 0;j < a.length-1-i;j++){//for循环,a每循环一次，这里就少循环一个
					if(a[j]>a[j+1]){//循环时如果a[0]大于a[1]时，则：
						int temp;
						temp = a[j];//把a[0]赋值给temp
						a[j] = a[j+1];//把a[1]赋值给a[0]
						a[j+1] = temp;//把temp赋值给a[1]，实现了调换位置
					}
				}
			}
			System.out.println(Arrays.toString(a));
	}
}