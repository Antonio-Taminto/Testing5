import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {
    private Data testing = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));

    @org.junit.jupiter.api.Test
    void cambiaData() {
        String result = testing.cambiaData(1,-1,7);
        assertEquals("08/02/24",result,
                "ci aspettiamo la data con un mese in mese ma un anno e 7 giorni in più");
    }
}