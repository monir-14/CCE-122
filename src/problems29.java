import java.util.Scanner;

public class problems29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String lowercaseStr = str.toLowerCase();
        System.out.println("After converting the string into lower case : "+lowercaseStr);
    }
}
