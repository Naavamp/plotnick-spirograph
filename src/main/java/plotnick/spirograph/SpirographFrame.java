package plotnick.spirograph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpirographFrame extends JFrame
{

    public SpirographFrame()
    {
        setSize(1000, 1000);
        setTitle("Spirograph Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        final JLabel largeRadiusLabel = new JLabel("Large Radius");
        final JTextField largeRadiusField = new JTextField("200");

        final JLabel smallRadiusLabel = new JLabel("Small Radius");
        final JTextField smallRadiusField = new JTextField("75");

        final JLabel penDistanceLabel = new JLabel("PenDistance");
        final JTextField penDistanceField = new JTextField("55");

        final JLabel numStepsLabel = new JLabel("Number of Steps");
        final JTextField numStepsField = new JTextField("8000");

        final JLabel anglePerStepLabel = new JLabel("Angle Per Step");
        final JTextField anglePerStepField = new JTextField("0.007");

        final JLabel timeLabel = new JLabel("Time");
        final JTextField timeField = new JTextField("");

        JButton button = new JButton("Draw");

        SpirographModel model = new SpirographModel(200, 75, 55, 8000, 0.007);

        SpirographView spirographView = new SpirographView(model);

        SpirographController controller = new SpirographController(
                model, largeRadiusField, smallRadiusField,
                penDistanceField, numStepsField, anglePerStepField, timeField);


        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                controller.updateModel();
                spirographView.repaint();

            }
        });

        GridBagConstraints constraints;

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.ipadx = 10;
        add(largeRadiusLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.ipadx = 10;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(largeRadiusField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(smallRadiusLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(smallRadiusField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(penDistanceLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add((penDistanceField), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(numStepsLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(numStepsField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(anglePerStepLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(anglePerStepField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(timeLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(timeField, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.anchor = GridBagConstraints.NORTH;
        add(button, constraints);

        constraints = new GridBagConstraints();
        constraints.gridheight = 7;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.BOTH;
        add(spirographView, constraints);
    }

    public static void main(String[] args)
    {
        SpirographFrame frame = new SpirographFrame();
        frame.setVisible(true);
    }
}
