import java.util.Scanner;

public class Problems12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the  string 2: ");
        String str2 = sc.nextLine();

        boolean result = str1.endsWith(str2);
        System.out.println("Is string 1 end with str2 ? "+result);
    }
}
