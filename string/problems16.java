import java.util.Scanner;

public class problems16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Byte array are: ");
        byte[] array = str1.getBytes();
        for (byte b:array)
        {
            System.out.print(b+" ");
        }

        String str = new String(array);
        System.out.println("\nAfter converting into string : "+str);
    }
}
