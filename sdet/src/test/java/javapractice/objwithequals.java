package javapractice;

public class objwithequals {

	int age;
	String name;
	long salary;
	
	public objwithequals(int age,String name,long salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		
	}
	
	@Override
	public String toString() {
		return "objwithequals [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return false;
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objwithequals obj=new objwithequals(12,"harisha",10000);
		objwithequals obj2=new objwithequals(12,"harisha",10000);
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj.equals(obj2));
	}

}
