package fechahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FechaHoraMain {
    public static void main(String[] args) {

        ////Antiguo
        Date d1 =  new Date();
        Date d2 = new Date(124, 2, 15);
        Date d3 = new Date(24*60*60*1000);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(d1.getTime());

        System.out.println(d1.getDate());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());
        System.out.println(d1.getHours());
        System.out.println(d1.getMinutes());
        System.out.println(d1.getSeconds());

        System.out.println(d1.after(d2));
        System.out.println(d1.before(d2));


        ////Nuevo

        LocalDate fechaActual = LocalDate.now();

        System.out.println(fechaActual);

        LocalTime horaActual = LocalTime.now();

        System.out.println(horaActual);

        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println(fechaHoraActual);

        LocalDate ld1 = LocalDate.of(2014, 03, 20);
        System.out.println(ld1);

        LocalDate ld2 = LocalDate.ofYearDay(2024, 51);
        System.out.println(ld2);

        LocalDate ld3 = LocalDate.parse("2024-06-06");
        System.out.println(ld3);


        LocalTime t1 = LocalTime.of(11,10);
        System.out.println(t1);

        LocalTime t2 = LocalTime.of(10,23,55);
        System.out.println(t2);

        LocalTime t3 = LocalTime.ofSecondOfDay(30000);
        System.out.println(t3);


        LocalDateTime dt1 = LocalDateTime.of(ld1, t1);
        System.out.println(dt1);
        LocalDateTime dt2 = LocalDateTime.of(2023, 2, 20, 11, 2, 40);
        System.out.println(dt2);
        LocalDateTime dt3 = LocalDateTime.parse("2023-02-20T11:02:40");
        System.out.println(dt3);


        LocalDateTime dt4 = LocalDateTime.of(2024,2,4, 10, 07, 55);
        System.out.println(dt4);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String format = dt4.format(dtf);

        System.out.println(format);

        System.out.println(dt1.isAfter(dt2));
        System.out.println(dt1.isBefore(dt2));
        System.out.println(dt1.isEqual(dt2));

        System.out.println(dt1.getMonth());

        System.out.println(dt1.plusDays(5));

        System.out.println(dt1.minusDays(5));


    }
}
