import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        Data data1 = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        System.out.println(data1.getData().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(data1.cambiaData(1,-1,7));
    }
}