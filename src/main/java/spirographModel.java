public class spirographModel
{
    private double largeRadius;
    private double smallRadius;
    private double penDistance;
    private double numsteps;
    private double anglePerstep;
    private double time;

    public spirographModel(double largeRadius, double smallRadius, double penDistance, double numSteps, double anglePerStep)
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

    double getTime()
    {

        for(int i = 0; i < numsteps; i++)
        {
             time += (i * anglePerstep);
        }
        return time;
    }


}