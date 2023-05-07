
public class Main {
    public static void main(String[] args) {
TwoDimensional[] figures = new TwoDimensional[3];
figures[0] = new Circle();
figures[1] = new Square();
figures[2] = new Triangle();
        System.out.println("Sum of all figures is " + calcSum(figures) + " sm");

    }
    public static double calcSum(TwoDimensional[] figures){
        double sum = figures[0].calcArea() + figures[1].calcArea() + figures[2].calcArea();
        return sum;
    }
}
