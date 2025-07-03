package Infosys_Interview_Questions;
class Shape
{
	void Draw() {
		System.out.println("Drawing a Shape");
	}
}
class Circle extends Shape
{
	void Draw() {
		System.out.println("Drawing a Circle");
	}
}
class Rectangle extends Shape
{
	void Draw() {
		System.out.println("Drawing a Rectangle");
	}
}
public class Main // Method Overriding Runtime polymorphism
{

	public static void main(String[] args) 
	{	
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		s1.Draw();
		s2.Draw();
	}
}
