package plotnick.spirograph;

import javax.swing.*;
import java.awt.*;


public class SpirographView extends JComponent
{
    private SpirographModel spirographModel;

    public SpirographView(SpirographModel model) {
        spirographModel = model;
    }



    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(new Color(0,0,0));
        g.translate(0, getHeight());


        double xprev = 0;
        double yprev = 0;
        double numSteps = spirographModel.getNumSteps();
        double anglePerStep = spirographModel.getAnglePerStep();
        double largeRadius = spirographModel.getLargeRadius();
        double smallRadius = spirographModel.getSmallRadius();
        double penDistance = spirographModel.getPenDistance();


        for (int i = 0; i < numSteps; i++)
        {
            double time = i * anglePerStep;
            double y = (largeRadius - smallRadius) * Math.sin((time) - penDistance
                    * Math.sin(largeRadius - smallRadius) * time / smallRadius);

            double x = (largeRadius - smallRadius) * Math.cos(time) + penDistance
                    * Math.cos((largeRadius - smallRadius) * time / smallRadius);

            g.drawLine((int) xprev, (int) yprev, (int) x, (int) y);
            xprev = x;
            yprev = y;

        }
    }
}
