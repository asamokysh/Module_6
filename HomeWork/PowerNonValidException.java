package Module_6.HomeWork;

public class PowerNonValidException extends Exception {
    private double powerValue;

    public PowerNonValidException(double powerValue) {
        this.powerValue = powerValue;
    }

    public double getPowerValue() {
        return powerValue;
    }
}
