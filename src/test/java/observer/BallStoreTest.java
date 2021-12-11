package observer;

import com.epam.geometry.logic.Calculator;
import com.epam.geometry.logic.DataException;
import com.epam.geometry.observer.BallIdentifiable;
import com.epam.geometry.observer.BallStore;
import com.epam.geometry.observer.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Map;

public class BallStoreTest {

    private static final double AREA = 1;
    private static final double VOLUME = 1;
//    private static final double DELTA = 0.001;

    @Test
    public void testUpdateShouldUpdateWhenDataIsUpdated() throws DataException {
        //given
        BallIdentifiable ball = Mockito.mock(BallIdentifiable.class);
        Mockito.when(ball.getId()).thenReturn(1);

        Calculator calculator = Mockito.mock(Calculator.class);
        Mockito.when(calculator.calculateArea(ball)).thenReturn(AREA);
        Mockito.when(calculator.calculateVolume(ball)).thenReturn(VOLUME);

        BallStore ballStore = BallStore.getInstance();

        //when
        ballStore.update(ball);

        //then
        Map<Integer, Parameters> parameters = BallStore.getParameters();

        Parameters ballParameters = parameters.get(ball.getId());

        Assert.assertEquals(AREA, ballParameters.getArea(), 0.001);
        Assert.assertEquals(VOLUME, ballParameters.getVolume(), 0.001);
    }
}
