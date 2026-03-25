package plotnick.spirograph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpirographFrame extends JFrame
{

    public SpirographFrame()
    {
        setSize(500, 500);
        setTitle("Spirograph Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        JLabel largeRadiusLabel = new JLabel("Large Radius");
        JTextField largeRadiusField = new JTextField("200");

        JLabel smallRadiusLabel = new JLabel("Small Radius");
        JTextField smallRadiusField = new JTextField("75");

        JLabel penDistanceLabel = new JLabel("PenDistance");
        JTextField penDistanceField = new JTextField("55");

        JLabel numStepsLabel = new JLabel("Number of Steps");
        JTextField numStepsField = new JTextField("8000");

        JLabel anglePerStepLabel = new JLabel("Angle Per Step");
        JTextField anglePerStepField = new JTextField("0.007");

        JLabel timeLabel = new JLabel("Time");
        JTextField timeField = new JTextField("");

        JButton button = new JButton("Draw");

        SpirographModel spirographModel = new SpirographModel(220, 78, 555, 10000, 0.007);

        SpirographView spirographView = new SpirographView(spirographModel);

        SpirographController spirographController = new SpirographController(
                spirographModel, largeRadiusField, smallRadiusField,
                penDistanceField, numStepsField, anglePerStepField, timeField);


        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                spirographController.updateModel();
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
