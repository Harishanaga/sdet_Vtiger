package javapractice;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class SecondMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,12,19,5,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-2]);
	}

}
