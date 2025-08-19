package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250819", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-08-19+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-08-19", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-08-19T17:22:17.5246346");

        System.out.println(parse4);

        // dd/MM/yyyy Brasil
        // MM/DD/YYYY USA
        // yyyy/MM/dd Japão

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);

        System.out.println(formatBR);

        LocalDate parseBR = LocalDate.parse("19/08/2025", formatterBR);

        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGM = LocalDate.now().format(formatterGR);

        System.out.println(formatGM);

        LocalDate parseGR = LocalDate.parse("19.August.2025", formatterGR);

        System.out.println(parseGR);
    }
}
