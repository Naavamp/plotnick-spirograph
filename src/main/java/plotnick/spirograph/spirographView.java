package plotnick.spirograph;

import javax.swing.*;
import java.awt.*;

public class spirographView extends JComponent
{
  spirographModel spirographModel = new spirographModel(200,  75, 55, 8000, 0.007);



    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(new Color(150, 200, 255));
        g.translate(0, getHeight());

        double y = (spirographModel.getLargeRadius() - spirographModel.getSmallRadius()) * Math.sin((spirographModel.getTime()) - spirographModel.getPenDistance() *
                Math.sin(spirographModel.getLargeRadius() - spirographModel.getSmallRadius()) * spirographModel.getTime() / spirographModel.getSmallRadius());

        double x = (spirographModel.getLargeRadius() - spirographModel.getSmallRadius()) * Math.cos(spirographModel.getTime()) + spirographModel.getPenDistance() *
                Math.cos((spirographModel.getLargeRadius() - spirographModel.getSmallRadius()) * spirographModel.getTime() / spirographModel.getSmallRadius());


        for (int i = 0; i < spirographModel.getNumsteps(); i++)
        {
            g.drawLine((int) x, (int) y, 5, 5);
        }





    }


}
