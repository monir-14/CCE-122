import java.util.Scanner;

public class Problems1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        System.out.print("\nEnter the index position: ");
        int pos = sc.nextInt();

        char ch = name.charAt(pos);
        System.out.println("\nThe character at position "+pos+" is : "+ch);
    }
}
