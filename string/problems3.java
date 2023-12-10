import java.util.Scanner;

public class problems3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        System.out.print("\nEnter the index position: ");
        int pos = sc.nextInt();

        int unicode = name.codePointAt(pos-1);
        System.out.println("\nThe character at position "+(pos-1)+" is : "+unicode);
    }
}
