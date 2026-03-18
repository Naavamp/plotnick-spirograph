package plotnick.spirograph;
public class spirographModel
{

    private double largeRadius = 200 ;
    private double smallRadius = 75;
    private double penDistance = 55;
    private double numsteps = 8000;
    private double anglePerstep = 0.007;
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