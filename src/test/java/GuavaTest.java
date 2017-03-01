import com.google.common.collect.Range;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GuavaTest {

    @Test
    public void checkContains(){
        assertTrue(Range.closed(0,3).contains(2));
    }
}
