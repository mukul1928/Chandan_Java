package Practice_Java_Interview_Questions;
class AnimalG
{
	AnimalG()
	{
		System.out.println("Animal Constructor");
	}
}
class DogG extends AnimalG
{
	DogG()
	{
		super(); // Calls Animal's constructor
		System.out.println("Dog Constructor");
	}
}
public class Super_CallingConstructor 
{
	public static void main(String[] args)
	{
		new DogG();
	}
}
