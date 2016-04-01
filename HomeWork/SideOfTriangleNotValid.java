package Module_6.HomeWork;

public class SideOfTriangleNotValid extends Exception{
    private int aValue;

    public SideOfTriangleNotValid(int aValue) {
        this.aValue = aValue;
           }

    public int getaValue() {
        return aValue;
    }
}
