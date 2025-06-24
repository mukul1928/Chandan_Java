package class_33_Polymorphism_Encapsulation;
class Private_Information
{
	private int age = 12;
	private int otp = 1245;
	private String un = "chandanpaney@gmail.com";
	private String pas = "Mukul@2345#$@%^&";
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getOtp()
	{
		return otp;
	}
	public void setOtp(int otp)
	{
		this.otp=otp;
	}
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un=un;
	}
	public String getPas()
	{
		return pas;
	}
	public void setPas(String pas)
	{
		this.pas=pas;
	}
}
public class Encapsulation_New_Practice 
{
	public static void main(String[] args)
	{
		Private_Information s = new Private_Information();
		s.setAge(30);
		System.out.println(s.getAge());
		s.setOtp(9876);
		System.out.println(s.getOtp());
		s.setUn("mukulpandey0007@jamesbond.com");
		System.out.println(s.getUn());
		s.setPas("mukul0007@JaMeSbOnD_NotEasyToCrack");
		System.out.println(s.getPas());
	}
}
