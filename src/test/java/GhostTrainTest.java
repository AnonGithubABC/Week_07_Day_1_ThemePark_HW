import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GhostTrainTest {

    GhostTrain ghostTrain;

    @Before
    public void before(){
        ghostTrain = new GhostTrain(10, 1.00, 2.50, 10);
    }

    @Test
    public void hasPrice() {
        assertEquals(10, ghostTrain.getridePrice());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1.00, ghostTrain.getminHeight(), 0.01);
    }

    @Test
    public void hasMaxHeight() {
        assertEquals(2.50, ghostTrain.getmaxHeight(), 0.01);
    }

    @Test
    public void hasMinAge() {
        assertEquals(10, ghostTrain.getminAge());
    }
}
