import java.util.Scanner;
public class IT26102763Lab3Q1B {
	public static void main (String[] args){
		
		double price ,quantity ,totalAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		price = input.nextDouble();
		
		System.out.print("Enter the number of kilogram you want to buy: ");
		quantity = input.nextDouble();
		
		double total = price * quantity;
		double discount = total * 0.10;
		double finalAmount = total - discount;
		
		System.out.println();
		System.out.print("The total amount with 10% discount is:" + finalAmount);
		
		input.close();
	}
}	
		