package class_16_MethodOverriding_SuperKeyword_ThisKeyword;
/*
 * super keyword is only used in java in the concept of method overriding to call the parent class implementation 
 * together with the child class implementation.
 * 
 * super keyword has to be used only in the case of non-static context or a non-static methods.
 * 
 * super keyword can be the firs line or any line inside the non-static method.
 */
class Collage_Class
{
	void bookstowrite()
	{	
		System.out.println("Writing to study");
	}
}
public class MethodOverRidingSchool_Class extends Collage_Class
{
	void bookstowrite()
	{
		super.bookstowrite();
		System.out.println("Writing to top the class");
	//	super.bookstowrite();//This is called as super keyword which is used to call the parent class implementation together with the child class implementation
	}
	public static void main(String[] args) 
	{
		MethodOverRidingSchool_Class m = new MethodOverRidingSchool_Class();
		m.bookstowrite();
	}
}
