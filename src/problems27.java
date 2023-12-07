import java.util.Scanner;

public class problems27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the starting point for string: ");
        int start = sc.nextInt();
        System.out.print("\nEnter the ending point for string: ");
        int end = sc.nextInt();

        String sub_str = str.substring(start,end);
        System.out.println("The sub string of the given string is : "+sub_str);
    }
}
