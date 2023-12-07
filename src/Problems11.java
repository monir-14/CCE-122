public class Problems11 {
    public static void main(String[] args) {
        char[] array = new char[]{'1','2','3','4','5'};

        String str = String.copyValueOf(array,1,3);
        System.out.println("The copy of input from character array is : "+str);
    }
}
