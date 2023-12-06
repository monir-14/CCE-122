import java.util.Scanner;

public class problems10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  string 1: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the string 2: ");
        String str2 = sc.nextLine();

        StringBuffer strBuf = new StringBuffer(str2);
        boolean compareResult = str1.contentEquals(strBuf);
        if(compareResult)
        {
            System.out.println("String and String Buffer is equal");
        }
        else {
            System.out.println("String and String Buffer are not equal");
        }
    }
}
