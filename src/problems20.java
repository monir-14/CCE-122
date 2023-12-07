import java.util.Scanner;

public class problems20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        String str2 = "Hello World";

        String canonicalStr1 = str1.intern();
        String canonicalStr2 = str2.intern();

        if(canonicalStr1.equals(canonicalStr2))
        {
            System.out.println("Both strings have the same canonical representation.");
        }
        else {
            System.out.println("Both strings have the different canonical representation.");
        }

    }
}
