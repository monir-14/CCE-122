public class problems19 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        int k = 1;
        for(char i='a';i<='z';i++)
        {

            System.out.print(i+"=>"+str.indexOf(i)+"\t");
            if(k%9==0)
            {
                System.out.println();
            }
            k++;
        }
    }
}
