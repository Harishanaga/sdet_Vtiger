package javapracticeclass;

import java.util.Arrays;

public class Ascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,1,9,5};
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
		}System.out.println(Arrays.toString(a));
	}

}
