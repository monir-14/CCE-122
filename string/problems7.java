import java.util.Scanner;

public class problems7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the Second string: ");
        String str2 = sc.nextLine();
        String str = str1.concat(str2);
        System.out.println("The concat string is : "+str);
    }
}
