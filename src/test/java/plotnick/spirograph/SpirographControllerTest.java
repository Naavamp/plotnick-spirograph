package plotnick.spirograph;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import static org.mockito.Mockito.*;

public class SpirographControllerTest
{
    @Test
    void spirographUpdateTest()
    {
        SpirographModel model = mock(SpirographModel.class);

        JTextField large = mock(JTextField.class);
        JTextField small = mock(JTextField.class);
        JTextField pen = mock(JTextField.class);
        JTextField steps = mock(JTextField.class);
        JTextField angle = mock(JTextField.class);
        JTextField time = mock(JTextField.class);

        when(large.getText()).thenReturn("200");
        when(small.getText()).thenReturn("75");
        when(pen.getText()).thenReturn("55");
        when(steps.getText()).thenReturn("8000");
        when(angle.getText()).thenReturn("0.007");

        SpirographController controller =
                new SpirographController(model, large, small, pen, steps, angle, time);

        controller.updateModel();

        verify(model).setLargeRadius(200);
        verify(model).setSmallRadius(75);
        verify(model).setPenDistance(55);
        verify(model).setNumSteps(8000);
        verify(model).setAnglePerStep(0.007);
    }

}
