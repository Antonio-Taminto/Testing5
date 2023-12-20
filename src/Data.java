import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Data {
    private OffsetDateTime data;

    public Data (OffsetDateTime data){
        this.data = data;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public String cambiaData(){
       return (data.plusYears(1).minusMonths(1).plusDays(7)).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}
