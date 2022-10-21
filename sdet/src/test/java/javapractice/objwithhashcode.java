package javapractice;

import com.google.common.base.Objects;

public class objwithhashcode {
	int age;
	String name;
	long salary;
	
	public objwithhashcode(int age,String name,long salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		
	}
	@Override
	public String toString() {
		return "objwithhashcode [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
	@Override
	public int hashCode() {
		
		return Objects.hashCode(age,name,salary);
	}
	@Override
	public boolean equals(Object obj) {
		
		objwithhashcode other = (objwithhashcode) obj;
		
		return age==other.age && name.equals(other.name)&& salary == other.salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		objwithhashcode obj=new objwithhashcode(12,"harisha",10000);
		
		System.out.println(obj);
		System.out.println(obj.hashCode());
		
		objwithhashcode obj2=new objwithhashcode(12,"harisha",10000);
		System.out.println(obj2);
		System.out.println(obj2.hashCode());
		System.out.println(obj.equals(obj2));
		
		objwithhashcode obj3=new objwithhashcode(12,"harisha",10000);
		System.out.println(obj3);
		System.out.println(obj3.hashCode());
		System.out.println(obj.equals(obj3));
	}

	
}
