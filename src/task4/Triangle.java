package task4;

public class Triangle implements TwoDimensional{
    int height = 6;
    int width = 3;
    @Override
    public double calcArea(){
        double areaTriangle = (height * width)/2;
        return areaTriangle;
    }
}
