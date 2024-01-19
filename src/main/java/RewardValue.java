public class RewardValue {

    public static final double MILES_TO_CASH_CONVERSION = 0.0035;
    private double cashVal;
    public RewardValue(double cash){
        cashVal = cash;
    }

    public RewardValue(int miles){
        cashVal = convertToCash(miles);
    }

    private static int convertToMiles(double cashValue){
        return (int)(cashValue / MILES_TO_CASH_CONVERSION);
    }

    private static double convertToCash(int miles){
        return miles * MILES_TO_CASH_CONVERSION;
    }

    public double getCashValue(){
        return cashVal;
    }

    public int getMilesValue(){
        return convertToMiles(cashVal);
    }

}
