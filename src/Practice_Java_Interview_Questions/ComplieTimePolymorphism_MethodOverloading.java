package Practice_Java_Interview_Questions;

public class ComplieTimePolymorphism_MethodOverloading 
{
	void add(){
		System.out.println("Method 1");
	}
	void add(int a) {
		System.out.println("Method 2 int a");
	}
	void add(double b) {
		System.out.println("Method 3 double b");
	}
	void add(char c) {
		System.out.println("Method 4 char c");
	}
	public static void main(String[] args) {
		ComplieTimePolymorphism_MethodOverloading d = new ComplieTimePolymorphism_MethodOverloading();
		d.add();
		d.add(232);
		d.add('C');
		d.add(23.3434343434d);
	}
}
