import java.util.Scanner;

public class problems23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the Second string: ");
        String str2 = sc.nextLine();
        System.out.print("Enter the starting point for string1: ");
        int start1 = sc.nextInt();
        System.out.print("\nEnter the ending point for string1: ");
        int end1 = sc.nextInt();
        System.out.print("\nEnter the starting point for string2: ");
        int start2 = sc.nextInt();

        boolean regionMatch = str1.regionMatches(start1,str2,start2,end1-start1); // print for string2 start2 to end of the string2

        System.out.println("is the region of string1[start1 - end1] matches to the string2 region[start2 -end of the string]? : "+regionMatch);
    }
}
