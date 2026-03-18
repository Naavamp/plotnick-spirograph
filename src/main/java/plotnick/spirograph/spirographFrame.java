package plotnick.spirograph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class spirographFrame extends JFrame
{
    public spirographFrame()
    {
        setSize(500, 500);
        setTitle("Spirograph Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());


        final JLabel largeRadiusLabel = new JLabel("LRadius");
        JTextField largeRadiusField = new JTextField("200");

        final JLabel smallRadiusLabel = new JLabel("SRadius");
        JTextField smallRadiusField = new JTextField("75");

        final JLabel penDistanceLabel = new JLabel("PenDistance");
        JTextField penDistanceField = new JTextField("55");

        final JLabel numStepsLabel = new JLabel("Number of Steps");
        JTextField numStepsField = new JTextField("8000");

        final JLabel anglePerStepLabel = new JLabel("Angle Per Step");
        JTextField anglePerStepField = new JTextField("0.007");

        final JLabel timeLabel = new JLabel("Time");
        JTextField timeField = new JTextField("");


        final JButton button = new JButton("Draw");

        spirographModel spirographModel = new spirographModel(200,  75, 55, 8000, 0.007);


        SpirographController spirographController = new SpirographController( spirographModel,
                largeRadiusField, smallRadiusField, penDistanceField,
                numStepsField, anglePerStepField, timeField);

        spirographView spirographView = new spirographView();

        spirographView.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }

            @Override
            public void mousePressed(MouseEvent e)
            {

            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

            }

            @Override
            public void mouseEntered(MouseEvent e)
            {

            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }
        });

        add(spirographView);


    }

    public static void main(String[] args)
    {
        spirographFrame frame = new spirographFrame();
        frame.setVisible(true);
    }


}
