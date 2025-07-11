package Practice_Java_Interview_Questions;
abstract class Payment
{
	abstract void makePayment();
}
class CreditCardPayment extends Payment
{
	void makePayment() {
		System.out.println("Payment made using Credit Card");
	}
}
class UPIPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using UPI");
	}
}
public class Abstraction_Class 
{
	public static void main(String[] args) {
		Payment obj1 = new CreditCardPayment();
		Payment obj2 = new UPIPayment();
		obj1.makePayment();
		obj2.makePayment();
	}
}
