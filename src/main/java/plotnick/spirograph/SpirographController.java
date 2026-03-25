package plotnick.spirograph;
import javax.swing.*;

public class SpirographController
{
    private SpirographModel model;
    private JTextField largeRadius;
    private JTextField smallRadius;
    private JTextField penDistance;
    private JTextField numsteps;
    private JTextField anglePerstep;
    private JTextField time;

    public SpirographController(SpirographModel spirographModel,
                                JTextField largeRadius, JTextField smallRadius,
                                JTextField penDistance, JTextField numsteps,
                                JTextField anglePerstep, JTextField time)
    {
        this.model = spirographModel;
        this.largeRadius = largeRadius;
        this.smallRadius = smallRadius;
        this.penDistance = penDistance;
        this.numsteps = numsteps;
        this.anglePerstep = anglePerstep;
        this.time = time;
    }

    public void updateModel() {
        model.setLargeRadius(Double.parseDouble(largeRadius.getText()));
        model.setSmallRadius(Double.parseDouble(smallRadius.getText()));
        model.setPenDistance(Double.parseDouble(penDistance.getText()));
        model.setNumSteps(Integer.parseInt(numsteps.getText()));
        model.setAnglePerStep(Double.parseDouble(anglePerstep.getText()));
    }


}
