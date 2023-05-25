package task5;

public abstract class Obstacle {
    private int height;
    private int length;
    private String model;

    public Obstacle(int height, int length, String model) {
        this.height = height;
        this.length = length;
        this.model = model;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public abstract boolean overCome(Competitor competitor);
    public abstract int checkingObstacle(Competitor competitor);
}
