package Practice_Java_Interview_Questions;
class Parent
{
	void add() {
		System.out.println("Parent class add method");
	}
}
public class SingleLvlChild_Inheritance extends Parent
{
	void sub() {
		System.out.println("Child class sub method");
	}
	public static void main(String[] args) {
		SingleLvlChild_Inheritance s = new SingleLvlChild_Inheritance();
		s.add();
		s.sub();
		
	}
}
