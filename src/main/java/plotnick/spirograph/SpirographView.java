package plotnick.spirograph;

import javax.swing.*;
import java.awt.*;

public class SpirographView extends JComponent
{
  SpirographModel spirographModel = new SpirographModel(200,  75, 55, 8000, 0.007);



    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(new Color(150, 200, 255));
        g.translate(0, getHeight());




        double xprev = 0;
        double yprev = 0;

        for (int i = 0; i < spirographModel.getNumsteps(); i++)
        {
            double time = i * spirographModel.getAnglePerstep();
            double y = (spirographModel.getLargeRadius() - spirographModel.getSmallRadius()) *
                    Math.sin((time) - spirographModel.getPenDistance() *
                            Math.sin(spirographModel.getLargeRadius() - spirographModel.getSmallRadius()) *
                            time / spirographModel.getSmallRadius());

            double x = (spirographModel.getLargeRadius() - spirographModel.getSmallRadius()) *
                    Math.cos(time) + spirographModel.getPenDistance() *
                    Math.cos((spirographModel.getLargeRadius() - spirographModel.getSmallRadius()) *
                           time / spirographModel.getSmallRadius());

            g.drawLine((int)xprev, (int)yprev, (int)x,(int) y);
            xprev = x;
            yprev =y;




        }





    }


}
