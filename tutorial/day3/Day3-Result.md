# Day3 学习目标

1. Runoob Java教程
2. Git及GitHub学习：
> 3. [GitHub for  Windows使用教程](https://www.cnblogs.com/opsprobe/p/9893325.html)：完全掌握
> 3. [Runoob GitHub简明教程](https://www.runoob.com/w3cnote/git-guide.html)：用作参考
> 4. [图解Git](http://marklodato.github.io/visual-git-guide/index-zh-cn.html)：方便后续学习
3. 实现冒泡算法：
- [ ] 分析别人代码
- [ ] 自己重复实现
- [ ] 自己尝试新思路实现

---------------------------------------------------------------------------------------------------------------
package day0515;
public class Demo_sort {
    public static void main(String[] args) {
		
        int[] numbers=new int[]{1,5,8,2,3,9,4};
        int i,j;
        for(i=0;i<numbers.length;i++)
        {
            for(j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是:");
        for(i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
}
-------------------------------------------------------------------------------------------------------------------
冒泡算法百度了一下原理，但还是不知道怎么通过比较数组中的大小去改变数组中数字的位置移动，就又百度了一下冒泡算法代码，就是上面那串代码
但复制粘贴过来在cmd中可以编译但运行不了，不知道怎么回事，打算明天再来研究一下，文件的命名为：Demo_sort

            for(j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    
对上代码中的这段还是看不懂...不清楚 j<numbers.length-1-i;j++ 是什么意思。

