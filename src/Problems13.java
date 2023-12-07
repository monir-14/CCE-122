import java.util.Scanner;

public class Problems13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the Second string: ");
        String str2 = sc.nextLine();
        boolean result = str1.equals(str2);
        if(result)
        {
            System.out.println("String 1 and String 2 is equal");
        }
        else
        {
            System.out.println("String 1 and String 2 are not equal");
        }
    }
}
