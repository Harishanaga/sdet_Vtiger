package javapractice;

public class AutoUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st way
		Integer i=10;
		int i1=i;
		System.out.println(i1);
		
		Character c1='a';//primitive
		char c2=c1;//auto unboxing
		System.out.println(c2);
		
		
		// 2nd way
		int i2=new Integer(65);
		System.out.println(i2);
		
		
		char ch=new Character('a');
		System.out.println(ch);
	}

}
