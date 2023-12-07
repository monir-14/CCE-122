import java.util.Scanner;

public class problems18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  string: ");
        String str = sc.nextLine();

        int hash_code = str.hashCode();
        System.out.println("The hashcode of the given string is: "+hash_code);
    }
}
