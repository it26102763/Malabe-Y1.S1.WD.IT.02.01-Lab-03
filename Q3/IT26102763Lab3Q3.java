import java.util.Scanner;

public class IT26102763Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Rupee amount: ");
        int amount = input.nextInt();
        
        int n5000 = amount / 5000;
        amount %= 5000;
        
        int n1000 = amount / 1000;
        amount %= 1000;
        
        int n500 = amount / 500;
        amount %= 500;
        
        int n200 = amount / 200;
        amount %= 200;
        
        int n100 = amount / 100;
        amount %= 100;
        
        int n50 = amount / 50;
        amount %= 50;
        
        int n20 = amount / 20;
        amount %= 20;
        
        int c10 = amount / 10;
        amount %= 10;
        
        int c5 = amount / 5;
        amount %= 5;
        
        int c2 = amount / 2;
        amount %= 2;
        
        int c1 = amount / 1;
        amount %= 1;
        
        System.out.println("\n5000 Notes - " + n5000);
        System.out.println("1000 Notes - " + n1000);
        System.out.println("500 Notes - " + n500);
        System.out.println("200 Notes - " + n200);
        System.out.println("100 Notes - " + n100);
        System.out.println("50 Notes - " + n50);
        System.out.println("20 Notes - " + n20);
        System.out.println("10 Coins - " + c10);
        System.out.println(String.format("05 Coins - %d", c5));
        System.out.println(String.format("02 Coins - %d", c2));
        System.out.println(String.format("01 Coins - %d", c1));
        
        input.close();
    }
}
