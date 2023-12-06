import java.util.Scanner;

public class problems4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        System.out.print("\nEnter the begin index position: ");
        int beginIndex = sc.nextInt();
        System.out.print("\nEnter the end index position: ");
        int endIndex = sc.nextInt();

        int unicodePointCount = name.codePointCount(beginIndex,endIndex);
        System.out.println("\ncount the unicode point is : "+unicodePointCount);
    }
}
