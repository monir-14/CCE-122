import java.util.Arrays;
import java.util.Scanner;

public class problems28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] array = str.toCharArray();
        System.out.print("The array of the string is : ");
        for(char ch: array)
        {
            System.out.print(ch);
        }
    }
}
