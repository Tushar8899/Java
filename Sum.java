import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter 2nd number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(" Your sum is " + sum );
    }

    
}