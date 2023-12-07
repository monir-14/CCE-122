import java.util.Scanner;

public class problems25 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the original String: ");
        String str = sc.nextLine();
        System.out.print("Enter the new string which will be placed on the original string : ");
        String replaceStr1 = sc.next();
        System.out.print("\nEnter the old string which will be replaced : ");
        String str2 = sc.next();

        String modifiedStr = str.replaceAll(str2,replaceStr1);
        System.out.println("Modified String : "+modifiedStr);

    }
}
