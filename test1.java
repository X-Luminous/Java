package test1;

import java.util.Scanner;

public class test1 {
	public static  int maxSum(int[] array){//�õ�����������
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
	static int[] generateRandomArr(int n,int min, int max) {//����������飬����n�Ǵ�С��������Ƿ�Χmin-max
	    int [] a = new int [n];
	    for (int i = 0; i < n; i++) {
	        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
	        a[i]=random;
	    }
	    return a;
	}
	public static void main(String[] args) {
		
		int [] a = generateRandomArr(5,-5,5);
		System.out.println("����Ĵ�С��"+a.length+" ");
		Scanner in=new Scanner(System.in);
		/*int []a = new int[4];
		for(int i=0;i<4;i++)
		{
			a[i]=in.nextInt();
		}*///��������
		System.out.print("����Ԫ�أ�");
		for(int i = 0;i < a.length; i++)
		{
			System.out.print(a[i]+" ");
			if(i==a.length-1)
			{
				System.out.println();
			}
		}	
		System.out.println("��������������ͣ�"+maxSum(a));
		
	}
}
