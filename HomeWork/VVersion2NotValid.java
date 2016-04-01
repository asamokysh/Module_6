package Module_6.HomeWork;

public class VVersion2NotValid extends Exception{
    private double CircleSquareValue;
    private double CircleSquare2Value;
    private double CircleSquare3Value;

    public VVersion2NotValid(double circleSquareValue, double circleSquare2Value, double circleSquare3Value) {
        CircleSquareValue = circleSquareValue;
        CircleSquare2Value = circleSquare2Value;
        CircleSquare3Value = circleSquare3Value;
    }

    public VVersion2NotValid(double circleSquare) {
    }

    public double getCircleSquareValue() {
        return CircleSquareValue;
    }

    public double getCircleSquare2Value() {
        return CircleSquare2Value;
    }

    public double getCircleSquare3Value() {
        return CircleSquare3Value;
    }
}
