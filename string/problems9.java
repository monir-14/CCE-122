import java.util.Scanner;

public class problems9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  string: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the character sequence: ");
        CharSequence charSequence = sc.nextLine();
        boolean compareResult = str1.contentEquals(charSequence);
        if(compareResult)
        {
            System.out.println("String and Character Sequence is equal");
        }
        else {
            System.out.println("String and Character Sequence are not equal");
        }
    }
}
