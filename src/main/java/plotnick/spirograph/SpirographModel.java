package plotnick.spirograph;

public class SpirographModel
{
    private double largeRadius = 200;
    private double smallRadius = 75;
    private double penDistance = 55;
    private double numsteps = 8000;
    private double anglePerstep = 0.007;
    private double time;

    public SpirographModel(double largeRadius, double smallRadius,
                           double penDistance, double numSteps,
                           double anglePerStep)
    {
        this.largeRadius = largeRadius;
        this.smallRadius = smallRadius;
        this.penDistance = penDistance;
        this.numsteps = numSteps;
        this.anglePerstep = anglePerStep;
    }

    double getLargeRadius()
    {
        return largeRadius;
    }

    double getSmallRadius()
    {
        return smallRadius;
    }

    double getPenDistance()
    {
        return penDistance;
    }

    double getNumsteps()
    {
        return numsteps;
    }

    double getAnglePerstep()
    {
        return anglePerstep;
    }

    public void setLargeRadius(double largeRadius)
    {
        this.largeRadius = largeRadius;
    }

    public void setSmallRadius(double smallRadius)
    {
        this.smallRadius = smallRadius;
    }

    public void setPenDistance(double penDistance)
    {
        this.penDistance = penDistance;
    }

    public void setNumSteps(double numsteps)
    {
        this.numsteps = numsteps;
    }

    public void setAnglePerStep(double anglePerstep)
    {
        this.anglePerstep = anglePerstep;
    }




}