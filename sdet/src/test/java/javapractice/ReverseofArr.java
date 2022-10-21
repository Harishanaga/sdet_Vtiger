package javapractice;

import java.util.Arrays;

public class ReverseofArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {5,3,6,8,1,2,9};
//		int b[]=new int[a.length] ;
//		for(int i=a.length-1;i>=0;i--)
//		{
//			b[i]=a[i];
//			System.out.println(b[i]);
//			
//		}
		
		
		int []a= {2,3,6,1,7,3,5};
		int start=0;
		int end=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(start<end)
			{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
