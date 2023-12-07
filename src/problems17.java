import java.util.Scanner;

public class problems17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str = sc.nextLine();

        char[] array = str.toCharArray();
        System.out.print("After converting into array: ");
        for (char ch: array)
        {
            System.out.print(ch);
        }
    }
}
