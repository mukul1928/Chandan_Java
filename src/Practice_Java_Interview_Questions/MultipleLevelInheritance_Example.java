package Practice_Java_Interview_Questions;

interface ParentOne {
	void add();

	void sub();
}

interface ParentTwo {
	void mul();

	void div();
}

interface ParentThree {
	void mod();

	void per();
}

interface ParentFour {
	void un();

	void pas();
}

public class MultipleLevelInheritance_Example implements ParentOne, ParentTwo, ParentThree, ParentFour {
	public static void main(String[] args) 
	{
		MultipleLevelInheritance_Example m = new MultipleLevelInheritance_Example();
		m.add();
		m.sub();
		m.mul();
		m.div();
		m.mod();
		m.per();
		m.un();
		m.pas();
	}

	public void un() {
		System.out.println("Username: " + " ChandanLoveSmita");
	}

	public void pas() {
		System.out.println("Password: " + " SmitaLoveChandan");
	}

	public void mod() {
		System.out.println("Modulous");
	}

	public void per() {
		System.out.println("Percentage");
	}

	public void mul() {
		System.out.println("Multiply");
	}

	public void div() {
		System.out.println("Devide");
	}

	public void add() {
		System.out.println("Addition");
	}

	public void sub() {
		System.out.println("Substraction");
	}
}
