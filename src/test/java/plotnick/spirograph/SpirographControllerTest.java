package plotnick.spirograph;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.mockito.Mockito.*;

public class SpirographControllerTest
{
    @Test
    void SpirographModel()
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
        SpirographModel spirographModel1 = new SpirographModel(200, 75,55, 80000, 0.007 );


        //then


        verify(spirographModel1).setLargeRadius(200);
        verify(spirographModel1).setSmallRadius(75);
        verify(spirographModel1).setPenDistance(55);
        verify(spirographModel1).setNumSteps(8000);
        verify(spirographModel1).setAnglePerStep(0.007);

        verify(largeRadius).setText("200.0");
        verify(smallRadius).setText("75.0");
        verify(penDistance).setText("55.0");
        verify(numsteps).setText("8000");
        verify(anglePerstep).setText("0.007");



    }

}
