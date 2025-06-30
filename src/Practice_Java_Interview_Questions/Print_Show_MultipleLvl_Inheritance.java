package Practice_Java_Interview_Questions;

public class Print_Show_MultipleLvl_Inheritance implements Print, Show {
	public static void main(String[] args) {
		Print_Show_MultipleLvl_Inheritance p = new Print_Show_MultipleLvl_Inheritance();
		p.print();
		p.show();
	}

	public void show() {
		System.out.println("Show Something");
	}

	public void print() {
		System.out.println("Print Something");
	}

}
