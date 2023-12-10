import java.util.Scanner;

public class problems24 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println("The given String is : "+str);
        System.out.print("Enter the new character : ");
        char ch1 = sc.next().charAt(0);
        System.out.print("\nEnter the old character which will be replaced : ");
        char ch2 = sc.next().charAt(0);
        String str2 = str.replace(ch1,ch2);
        System.out.println("Modified string : "+str2);
    }
}
