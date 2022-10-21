package javapractice;

import java.util.Arrays;

public class AddingArrayinAnotherArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,6,8,1,2,9};
		int b[]=new int[a.length] ;
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
