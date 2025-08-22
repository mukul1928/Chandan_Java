package class_33_Polymorphism_Encapsulation;

class Sensititive {
	private String un = "chandanpandey95";

	public void setUn(String un) {
		this.un = un;
	}

	public String getUn() {
		return un;
	}

	private int age = 22;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class Encapsulation_Practice {
	public static void main(String[] args) {
		Sensititive s = new Sensititive();
		s.setUn("hunk_mukul@143willlearncoding");
		System.out.println(s.getUn());
		s.setAge(24);
		System.out.println(s.getAge());
	}

}
