package Practice_Java_Interview_Questions;
abstract class one
{
	abstract void add();
	abstract void sub();
	void add1() {
		System.out.println("Concrete method add");
	}
}
public class Abstraction extends one
{
	public static void main(String[] args) {
		Abstraction a = new Abstraction();
		a.add1();
		a.add();
		a.sub();
	}
	
	void add() {
		System.out.println("abstract class add method which i am going to expose");
	}


	void sub() {
		System.out.println("abstract class sub method which i am going to expose");
	}

}
