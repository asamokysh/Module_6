package Module_6.ClassWork;

public class NegativeAgeExeption extends Exception {
    private int ageValue;

    public NegativeAgeExeption(final int ageValue) {
        this.ageValue = ageValue;
    }

    public int getAgeValue() {
        return ageValue;
    }
}
