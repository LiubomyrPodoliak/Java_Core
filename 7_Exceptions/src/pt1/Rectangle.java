package pt1;

public class Rectangle {

    public static int squareRectangle(int a, int b) throws SquareException {

        int squareRectangle = 0;

        if (a > 0 && b > 0) {
            squareRectangle = a * b;
        }else{
            throw new SquareException("The entered should not be negative");
        }

        return squareRectangle;

    }

}
