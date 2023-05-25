package task5;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human(500,2,"Bob"),
                new Cat(300,1,"Tslia"),
                new Robot(600,4,"Bob3000")
        };
        Obstacle[] obstacles = {
                new Treadmill(0,400,"SprintX5"),
                new Wall(3,0,"JumperX5")
        };
        Battles(competitors,obstacles);
    }
    public static void Battles(Competitor [] competitors, Obstacle[] obstacles ){
        for (Competitor competitor:competitors) {
            for (Obstacle obstacle:obstacles) {
                if (!obstacle.overCome(competitor)){
                if (!obstacle.overCome(competitor) && obstacle.getLength() < competitor.getMaxDistance()){
                    System.out.println("task5.Competitor " + competitor.getName() +" did not came the obstacle "+obstacle.getModel()+", at the distance " + obstacle.checkingObstacle(competitor)+"passed 400 m");
                    break;
            }
                    System.out.println("task5.Competitor " + competitor.getName() +" did not came the obstacle "+obstacle.getModel()+", at the distance"+ obstacle.checkingObstacle(competitor) +" passed " + obstacle.getHeight()+ " m");
        break;
                }
                System.out.println("task5.Competitor" + competitor.getName() + "passed the obstacle" + obstacle.getModel() + " at the distance" + obstacle.checkingObstacle(competitor) + "m");
    }
}}}
