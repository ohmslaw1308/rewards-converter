public class RewardValue {

    private int miles;
    private double cash;

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = 0;
    }

    public RewardValue(int miles){
        this.cash = 0;
        this.miles = miles;
    }

    public double getCashValue(){
        return miles * 0.0035;
    }

    public int getMilesValue(){

        return cash / 0.0035;
    }
}
