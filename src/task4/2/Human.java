package task5;

public class Human extends Competitor {
    public Human(int maxDistance, int maxJump, String name) {
        super(maxDistance, maxJump, name);
    }
    @Override
    public void toJump(){
        System.out.println("task5.Human is jumping");
    }
    @Override
    public void toRun(){
        System.out.println("task5.Human is running");
    }
}
