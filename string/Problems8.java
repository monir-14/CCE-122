import java.util.Scanner;

public class Problems8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the  string 2: ");
        String str2 = sc.nextLine();

        System.out.println("Is string 1 contains string 2 ?  "+str1.contains(str2));
    }
}
