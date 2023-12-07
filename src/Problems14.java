import java.util.Scanner;

public class Problems14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the Second string: ");
        String str2 = sc.nextLine();
        int result = str1.compareToIgnoreCase(str2);
        if(result>0)
        {
            System.out.println("String 1 is greater than String 2");
        }
        else if(result<0)
        {
            System.out.println("String 1 is less than String 2");
        }
        else
        {
            System.out.println("String 1 and String 2 are equal");
        }
    }
}
