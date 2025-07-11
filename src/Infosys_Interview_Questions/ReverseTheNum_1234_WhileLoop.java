package Infosys_Interview_Questions;

public class ReverseTheNum_1234_WhileLoop {
	public static void main(String[] args) {
		int num = 1234;
		int remainder, sum = 0;
		int temp;
		temp = num;
		while (num != 0) {
			remainder = num % 10;
			sum = (sum * 10) + remainder;
			num /= 10;
		}
		System.out.println("Reverse of " + temp + " is " + sum);
	}
}

//Explanation:- At first in the line no 9 it will check if the given num is equal to 0 or not so it is not equal so it
//will enter in the loop and first it will take the remainder if the num is devided by 10 the remainder will be 4 then it
//will store in the remainder variable at first we have initialized the sum as 0 into anything is 0 and the remainder is 4
//so sum will be equal to 4 sum = 4 and remainder is also 4 then if the number is devided by 10 then quetionent will be 123
//next it will come out of loop and check if the number 123 is equal to 0 or not if not then it will enter the loop and 
//again it will be devided the number 10 then the remainder will be 3 so previously the sum was 4 so 4*10 is 40 plus the remainder is 3
//so now the remainder is 3 so sum is 40+3=43 and the number will be 12 untill the number is 0 then it will come out of loop and print
//the given statement
//remainder = 4,3
//sum = 4,43
//num = 123,12 