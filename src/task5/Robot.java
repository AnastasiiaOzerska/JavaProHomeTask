package task5;

public class Robot extends Competitor {
    public Robot(int maxDistance, int maxJump, String name) {
        super(maxDistance, maxJump, name);
    }
    @Override
    public void toJump(){
        System.out.println("task5.Robot is jumping");
    }
    @Override
    public void toRun(){
        System.out.println("task5.Robot is running");
    }
}
