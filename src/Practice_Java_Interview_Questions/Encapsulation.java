package Practice_Java_Interview_Questions;
class Sensititive_Info
{
	private String un = "chandanpandey90";
	private String pas = "smitalovechandan143";
	
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPas() {
		return pas;
	}
	public void setPas(String pas) {
		this.pas=pas;
	}
}
public class Encapsulation {
	public static void main(String[] args) 
	{
		Sensititive_Info s = new Sensititive_Info();
		s.setUn("mukullovesmita143@hotmail.com");
		System.out.println(s.getUn());
		s.setPas("smitalovechandan@143mylove");
		System.out.println(s.getPas());
	}
}
