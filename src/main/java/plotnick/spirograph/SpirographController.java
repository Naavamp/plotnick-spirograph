package plotnick.spirograph;
import javax.swing.*;

public class SpirographController
{
    private spirographModel spirographModel;
    private JTextField largeRadius;
    private JTextField smallRadius;
    private JTextField penDistance ;
    private JTextField numsteps;
    private JTextField anglePerstep;
    private JTextField time;

    public SpirographController(spirographModel spirographModel, JTextField largeRadius, JTextField smallRadius, JTextField penDistance, JTextField numsteps,
                                JTextField anglePerstep, JTextField time)
    {
        this.spirographModel = spirographModel;
        this.largeRadius = largeRadius;
        this.smallRadius = smallRadius;
        this.penDistance = penDistance;
        this.numsteps = numsteps;
        this.anglePerstep = anglePerstep;
        this.time = time;
    }

    public void updateSpirographModel(double largeRadius, double smallRadius, double penDistance, double numSteps, double anglePerStep)
    {
        spirographModel spirographModel1 = new spirographModel(largeRadius, smallRadius, penDistance,
                                                               numSteps, anglePerStep);



    }
}
