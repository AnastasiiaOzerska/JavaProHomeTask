package task5;

public class Cat extends Competitor {
    public Cat(int maxDistance, int maxJump, String name) {
        super(maxDistance, maxJump, name);
    }
    @Override
    public void toJump(){
        System.out.println("task5.Cat is jumping");
    }
    @Override
    public void toRun(){
        System.out.println("task5.Cat is running");
    }
}
