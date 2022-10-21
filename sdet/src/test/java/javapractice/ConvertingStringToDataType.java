package javapractice;

public class ConvertingStringToDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123";
		int i=Integer.parseInt(s);
		System.out.println(i+1);
		
		double d=Double.parseDouble(s);
		System.out.println(d+1);
		
		boolean bln=Boolean.parseBoolean(s);
		System.out.println(bln);
		
		short sh=Short.parseShort(s);
		System.out.println(sh+1);
		
		float fl=Float.parseFloat(s);
		System.out.println(fl+1);
		
		byte by=Byte.parseByte(s);
		System.out.println(by+1);
		
		long ln=Long.parseLong(s);
		System.out.println(ln+1);
	}

}
