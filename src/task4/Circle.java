package task4;

public class Circle implements TwoDimensional {
    final double PI = 3.14;
    int radius = 5;
    @Override
    public double calcArea(){
        double areaCircle = PI * (radius * radius);
        return areaCircle;
    }
}
