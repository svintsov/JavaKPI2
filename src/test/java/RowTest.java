import com.bazyl.playground.Model.StatisticRangeRow;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RowTest {

    @Test
    public void checkUpdateStatus() {
        StatisticRangeRow row = new StatisticRangeRow(0, 3);
        row.updateStatus(1);
        assertEquals(1, row.getStatus());
        row.updateStatus(5);
        assertEquals(1, row.getStatus());
    }
}
