import java.util.Scanner;

public class problems21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the Second string: ");
        String str2 = sc.nextLine();

        int result = str1.lastIndexOf(str2);
        if(result == -1)
        {
            System.out.println("String2 is not found in string1");
        }
        else {
            System.out.println("Last index of string2 is found in string1 at "+result);
        }
    }
}
