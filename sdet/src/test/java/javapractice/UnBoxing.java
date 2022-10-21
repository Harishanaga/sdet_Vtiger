package javapractice;

public class UnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unboxing 1st way
		int a=25;   	//primitive
		Integer a1=Integer.valueOf(a);	//non primitive
		int a2=a1.intValue();	//primitive
		System.out.println(a2);
		
		
		byte b=2;
		Byte b1=Byte.valueOf(b);
		Byte b2=b1.byteValue();
		System.out.println(b2);
				
		
		//unboxing 2nd way
		Integer i1=15;
		int i2=i1.intValue();
		System.out.println(i2);
		
		Short s1=2;
		short s2=s1.shortValue();
		System.out.println(s2);
		
		//By creating object 3rd way
		Integer ii1=new Integer(100);
		int i11=ii1.intValue();
		System.out.println(i11);
		
		
		Double d1=new Double(1.2);
		double d2=d1.doubleValue();
		System.out.println(d2);
	}

}
