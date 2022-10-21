package javapracticeclass;

import java.util.Scanner;

public class FinalAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int value;
		System.out.println("enter scanner");
		value=sc.nextInt();
		System.out.println("value is= "+value);
		
		while(value>9)
		{
			int sum=0;
			while(value!=0)
			{
				sum=sum+value%10;
				value=value/10;
			}
			value=sum;
		}System.out.println(value);
	}
	}
