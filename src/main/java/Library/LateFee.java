package Library;

public class LateFee implements FeeStrategy{
    @Override
    public double fee() {
        return 7.25;
    }
}
