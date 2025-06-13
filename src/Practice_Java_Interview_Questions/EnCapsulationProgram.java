package Practice_Java_Interview_Questions;

class Sensitive {
	private String username = "chandanpandey1928@";
	private String password = "qwerty98@";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

public class EnCapsulationProgram {

	public static void main(String[] args) {
		Sensitive s1 = new Sensitive();
		s1.setUsername("chandan@143");
		System.out.println(s1.getUsername());
		s1.setPassword("mukul@hunk143");
		System.out.println(s1.getPassword());
	}
}
