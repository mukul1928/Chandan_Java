package Practice_Java_Interview_Questions;

abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank {

	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

public class TestBank // AbstractClass_RealTimeExample
{
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("Rate of Interest: " + b.getRateOfInterest() + " %");
		b = new PNB();
		System.out.println("Rate of Interest: " + b.getRateOfInterest() + " %");
	}
}
