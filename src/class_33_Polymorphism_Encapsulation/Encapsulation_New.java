package class_33_Polymorphism_Encapsulation;
class Amazon_login
{
	private int age = 32;
	private String un = "chandu@hotmail.com";
	private String pwd = "Chandan_143@";
	private int otp = 243434;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
}

public class Encapsulation_New 
{
	public static void main(String[] args) 
	{
		Amazon_login a = new Amazon_login();
		a.setAge(22);
		System.out.println(a.getAge());
		a.setUn("chandanpandey@hotmail.com");
		System.out.println(a.getUn());
		a.setPwd("Mukul@143Love");
		System.out.println(a.getPwd());
		a.setOtp(2323232);
		System.out.println(a.getOtp());
	}
}
