package test1;

import java.util.Scanner;

public class test1 {
	public static  int maxSum(int[] array){//得到最大子数组和
		if(null == array || array.length == 0){
			return 0;
		}
		int tmp = array[0];
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			if(tmp < 0){
				tmp = 0;
			} 
			tmp += array[i];  
			max = Math.max(max, tmp); 
		}
		return max;
	}
	static int[] generateRandomArr(int n,int min, int max) {//产生随机数组，参数n是大小，后面的是范围min-max
	    int [] a = new int [n];
	    for (int i = 0; i < n; i++) {
	        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
	        a[i]=random;
	    }
	    return a;
	}
	public static void main(String[] args) {
		
		int [] a = generateRandomArr(5,-5,5);
		System.out.println("数组的大小："+a.length+" ");
		Scanner in=new Scanner(System.in);
		/*int []a = new int[4];
		for(int i=0;i<4;i++)
		{
			a[i]=in.nextInt();
		}*///测试所用
		System.out.print("数组元素：");
		for(int i = 0;i < a.length; i++)
		{
			System.out.print(a[i]+" ");
			if(i==a.length-1)
			{
				System.out.println();
			}
		}	
		System.out.println("数组子数组的最大和："+maxSum(a));
		
	}
}
