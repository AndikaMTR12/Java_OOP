import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTimes {
    public static void main(String[] args) {
        LocalDate tanggal = LocalDate.now();
        LocalTime waktu = LocalTime.now();
        LocalDateTime fwaktu = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");

        String formatDate = fwaktu.format(myFormat);
        System.out.println(tanggal);
        System.out.println(waktu);
        System.out.println(fwaktu);
        System.out.println(formatDate);
    }
}
