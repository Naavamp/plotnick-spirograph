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
        double nmstps = spirographModel.getNumsteps();
        double anglprstp = spirographModel.getAnglePerstep();
        double lrgrds = spirographModel.getLargeRadius();
        double smllrds = spirographModel.getSmallRadius();
        double pndstnc = spirographModel.getPenDistance();


        for (int i = 0; i < nmstps; i++)
        {
            double time = i * anglprstp;
            double y = (lrgrds - smllrds) * Math.sin((time) - pndstnc
                    * Math.sin(lrgrds - smllrds) * time / smllrds);

            double x = (lrgrds - smllrds) * Math.cos(time) + pndstnc
                    * Math.cos((lrgrds - smllrds) * time / smllrds);

            g.drawLine((int) xprev, (int) yprev, (int) x, (int) y);
            xprev = x;
            yprev = y;

        }

    }

}
