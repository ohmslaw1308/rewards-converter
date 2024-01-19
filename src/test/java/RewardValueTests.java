import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        var rewardValue = new RewardValue(200.0);
        int expected = (int)(200.0 / RewardValue.MILES_TO_CASH_CONVERSION);
        assertEquals(expected, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        var rewardValue = new RewardValue(10000);
        double expected = 10000 * RewardValue.MILES_TO_CASH_CONVERSION;
        assertEquals(expected, rewardValue.getCashValue());
    }
}
