package Library;

public class UsageFee implements FeeStrategy{
    @Override
    public double fee() {
        return 4.25;
    }
}
