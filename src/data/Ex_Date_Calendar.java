package data;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Ex_Date_Calendar {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        // adiciona 4 horas do dia
        // cal.add(Calendar.HOUR_OF_DAY, 4);
        // d = cal.getTime();
        // System.out.println(sdf.format(d));

        // Extrair minutos da data
        int minutes = cal.get(Calendar.MINUTE);
        // Extrai mes da data
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println("minutes: " + minutes);
        System.out.println("Month: " + month);

    }

}
