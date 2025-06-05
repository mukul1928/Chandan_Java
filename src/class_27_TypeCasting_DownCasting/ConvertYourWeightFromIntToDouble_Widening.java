package class_27_TypeCasting_DownCasting;
//Primititive TypeCasting

public class ConvertYourWeightFromIntToDouble_Widening 
{
	public static void main(String[] args) 
	{
		double wt = 52; // widening implicitely way
		System.out.println(wt);
		wt = 65.3434343;
		
		/*
		 * widening can be done in two ways
		 * a) Implicitely
		 * b) Explicitely
		 */
		
		//If something is working in Implicitely manner already so its not required to write it down explicitely
		
		//---------------------------------------------------------------------
		
		double weight = (double) 90; // widening in explicitely way
		System.out.println(weight);
		//---------------------------------------------------------------------
		
		byte a1 = 90;
		//byte into int widening 
		int a2 = a1;
		System.out.println(a2);
	}
}
