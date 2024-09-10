import.java.uti;.Scanner;

public class Main{
    public static void main(String[]args){
        Add adder = new Add();
        Subtract subtractor = new Subtract();
        Product multiplier = new Product();
        Division divider= new Division();
        Modulus modulusOperator = new Modulus();

        Scanner scanner = new scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 =scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 =scanner.nextInt();

        int sum =adder.add(num1,num2);
        int difference =subtractor.subtract(num1,num2);
        int product =multiplier.product(num1,num2);
        int quotient =divider.divide(num1,num2);
        int modulus =modulusOperator.modulus(num1,num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulus);

        scanner.close();
    

        
    }
}