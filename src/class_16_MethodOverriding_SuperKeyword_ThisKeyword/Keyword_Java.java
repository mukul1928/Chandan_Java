package class_16_MethodOverriding_SuperKeyword_ThisKeyword;
// In java things takes place from the right hand side to the left hand side 
public class Keyword_Java 
{ 
	int age ;// the default value of this global variable is 0
	String name ;// null
	double salary ;//0.0
	void add(int age,String name,double salary)
	{
		//We can use this keyword to assign the value of our local variable to our global variable if we want it is written like below line
		 
		this.age=age;// this keyword is assigning the value of our local age to global age
		this.name=name;
		this.salary=salary;
		/*System.out.println(age);
		System.out.println(name);
		System.out.println(salary);*/
	}
	public static void main(String[] args) 
	{
		Keyword_Java j = new Keyword_Java();
		j.add(21, "Chandu", 100000.99);
		System.out.println(j.age);//calling global variables we will get the default value of int
		System.out.println(j.name);//calling global variable we will get the defaut value of String
		System.out.println(j.salary);//calling global variable we will get the default valur of double
	}
}
