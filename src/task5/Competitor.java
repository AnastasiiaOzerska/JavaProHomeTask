package task5;

public abstract class Competitor {
    private int maxDistance;
    private int maxJump;
    private String name;

    public Competitor(int maxDistance, int maxJump, String name) {
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
        this.name = name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void toRun();
    public abstract void toJump();
}
