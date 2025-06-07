package class_33_Polymorphism_Encapsulation;
class Sensititive_Info
{
	private String un = "customer@info.com";
	
	public void setUn(String un)
	{
		this.un=un;
	}
	public String getUn()
	{
		return un;
	}
	private int age = 21;

	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
}
public class Encapsulation 
{
	public static void main(String[] args)
	{
		Sensititive_Info s = new Sensititive_Info();
		s.setUn("chandanpandey@gmail.com");
		System.out.println(s.getUn());
		s.setAge(25);
		System.out.println(s.getAge());
	}
}
