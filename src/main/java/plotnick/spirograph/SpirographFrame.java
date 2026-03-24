package plotnick.spirograph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpirographFrame extends JFrame
{
    final SpirographView spirographView = new SpirographView();
    public SpirographFrame()
    {
        setSize(500, 500);
        setTitle("Spirograph Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());


        final JLabel largeRadiusLabel = new JLabel("Large Radius");
        JTextField largeRadiusField = new JTextField("200");

        final JLabel smallRadiusLabel = new JLabel("Small Radius");
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

        SpirographModel spirographModel = new SpirographModel(200,  75, 55, 8000, 0.007);


        SpirographController spirographController = new SpirographController(spirographModel,
                largeRadiusField, smallRadiusField, penDistanceField,
                numStepsField, anglePerStepField, timeField);



        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                spirographController.updateSpirographModel(
                        Double.parseDouble(largeRadiusField.getText()),
                        Double.parseDouble(smallRadiusField.getText()),
                        Double.parseDouble(penDistanceField.getText()),
                        Double.parseDouble(numStepsField.getText()),
                        Double.parseDouble(anglePerStepField.getText())
                );
            }
        });
        GridBagConstraints constraints;

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        add((largeRadiusLabel), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;
        add((largeRadiusField), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        add((smallRadiusLabel), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        add((smallRadiusField), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        add((penDistanceLabel), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        add((penDistanceField), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 3;
        add((numStepsLabel),constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 3;
        add((numStepsField), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 4;
        add((anglePerStepLabel), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 4;
        add((anglePerStepField), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 5;
        add((timeLabel), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 5;
        add((timeField), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.anchor = GridBagConstraints.NORTH;
        add((button), constraints);

        constraints = new GridBagConstraints();
        constraints.gridheight = 7;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.BOTH;
        add(spirographView, constraints);



    }

    public static void main(String[] args)
    {
        SpirographFrame frame = new SpirographFrame();
        frame.setVisible(true);
    }


}
