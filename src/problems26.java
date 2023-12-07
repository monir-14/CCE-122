import java.util.Scanner;

public class problems26 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the original String: ");
        String str = sc.nextLine();
        System.out.print("Enter the a new string : ");
        String str1 = sc.next();
        boolean isStart = str.startsWith(str1);
        System.out.println("Is str start with str1?"+isStart);
    }
}
