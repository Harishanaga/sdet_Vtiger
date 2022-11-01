package javapractice;

public class ReverseofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String rev="";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			rev=str.charAt(i)+rev;
			System.out.println(rev);
		}
		if(str.equals(rev))
		{
			System.out.println(str+ " is a palindrome");
		}
		else 
		{
			System.out.println(str+ " is not a palindrome");
		}
	}

}
