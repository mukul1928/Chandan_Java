package Practice_Java_Interview_Questions;

class inheritance {
	void add() {
		System.out.println("Add " + "Inheritance");
	}
}

class Area extends inheritance {
	int length = 564;
	int height = 799;
	int areaofrectangle;
}

class results extends Area {
	void areaof() {
		int areaofrectangle = length * height;
		System.out.println(areaofrectangle);
	}

}

public class Inheritance_Program extends results {
	public static void main(String[] args) {
		Inheritance_Program i = new Inheritance_Program();
		i.areaof();
		i.add();
	}
}
