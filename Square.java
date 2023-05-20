public class Square  implements TwoDimensional{
    int side = 7;
    @Override
    public double calcArea(){
        double areaSquare = side * side;
        return areaSquare;

    }
}
