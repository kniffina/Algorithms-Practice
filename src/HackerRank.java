import java.util.Calendar;
import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

        /*
        ================================
        java           100
        cpp            065
        python         050
        ================================

        a + 2^0 * b
        a + 2^0 * b + 2^1 * b
        a + 2^0 * b + 2^1 * b + 2^2 * b


        Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double.

        A byte is an 8-bit signed integer.
        A short is a 16-bit signed integer.
        An int is a 32-bit signed integer.
        A long is a 64-bit signed integer.

         *** CONVERT STRING TO INT AND GET DAY OF WEEK
         public static String getDay(String day, String month, String year) {
            Calendar cal = Calendar.getInstance();
            cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            String Day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};

            return(Day[dayOfWeek-1]);
        }


        *** using currency locales
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale INDIA = new Locale("en","IN");

        NumberFormat us    = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

        */

    }
}
