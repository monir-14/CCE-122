import java.util.Calendar;

public class problems_11_Extra {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date and time is: ");
        System.out.printf("%tB %te, %ty%n",calendar,calendar,calendar);

        System.out.printf("%tl:%tM %tp%n",calendar,calendar,calendar);
    }
}
