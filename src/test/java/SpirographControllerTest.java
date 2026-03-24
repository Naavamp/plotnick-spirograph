import org.junit.jupiter.api.Test;
import plotnick.spirograph.SpirographController;
import plotnick.spirograph.SpirographModel;

import javax.swing.*;

import static org.mockito.Mockito.*;

public class SpirographControllerTest
{
    @Test
    void updateSpirographModel()
    {
        //given
        SpirographModel spirographModel = mock();
        JTextField largeRadius = mock();
        JTextField smallRadius = mock();
        JTextField penDistance = mock();
        JTextField numsteps = mock();
        JTextField anglePerstep = mock();
        JTextField time = mock();
        doReturn("5").when(time).getText();
        SpirographController spirographController = new SpirographController( spirographModel,
                 largeRadius,  smallRadius,
                 penDistance,  numsteps,
                 anglePerstep,  time);




        //when

        spirographController.updateSpirographModel(200,  75, 55, 8000, 0.007);

        //then

        // then
        verify(spirographModel).setLargeRadius(200);
        verify(spirographModel).setSmallRadius(75);
        verify(spirographModel).setPenDistance(55);
        verify(spirographModel).setNumSteps(8000);
        verify(spirographModel).setAnglePerStep(0.007);

// UI field updates
        verify(largeRadius).setText("200.0");
        verify(smallRadius).setText("75.0");
        verify(penDistance).setText("55.0");
        verify(numsteps).setText("8000");
        verify(anglePerstep).setText("0.007");



    }

}
