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
        g.setColor(Color.BLACK);
        g.translate(getWidth() / 2,getHeight() / 2);


        double numSteps = spirographModel.getNumSteps();
        double anglePerStep = spirographModel.getAnglePerStep();
        double largeRadius = spirographModel.getLargeRadius();
        double smallRadius = spirographModel.getSmallRadius();
        double penDistance = spirographModel.getPenDistance();

        double xprev = (largeRadius - smallRadius) * Math.cos(0) + penDistance
                * Math.cos((largeRadius - smallRadius) * 0 / smallRadius);
        double yprev = (largeRadius - smallRadius) * Math.sin(0) - penDistance
                * Math.sin((largeRadius - smallRadius) * 0 / smallRadius);

        for (int i = 1; i < numSteps; i++)
        {
            double time = i * anglePerStep;
            double x = (largeRadius - smallRadius) * Math.cos(time) + penDistance
                    * Math.cos((largeRadius - smallRadius) * time / smallRadius);
            double y = (largeRadius - smallRadius) * Math.sin(time) - penDistance
                    * Math.sin((largeRadius - smallRadius) * time / smallRadius);



            g.drawLine((int) xprev, (int) yprev, (int) x, (int) y);
            xprev = x;
            yprev = y;

        }
    }
}
