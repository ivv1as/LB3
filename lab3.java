import java.util.regex.*;
import java.util.Scanner;

public class lab4 {
    public static void main(String args[]) {
        String pattern = "(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[012])/(19|[2-9][0-9])\\d\\d";
        Pattern p = Pattern.compile(pattern);
        Scanner d = new Scanner(System.in);
        System.out.println("Введите дату(день, месяц и год)");
        String text = d.next();
        d.close();
        Matcher m = p.matcher(text);
        if (m.matches() == true) {
            System.out.println("Веденные данные являются датой типа 'день, месяц и год' ");
        } else {
            System.out.println("Веденные данные не являются датой типа 'день, месяц и год' ");
        }
    }
}