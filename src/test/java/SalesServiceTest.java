import ru.netology.stats.SalesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    @Test
    public void AmountSales() {
        SalesService service = new SalesService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        int actualAmount = service.calcSales(amount);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void AverageAmount() {
        SalesService service = new SalesService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 15;
        int actualAmount = service.calcAverageAmount(amount);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void MaxMonth() {
        SalesService service = new SalesService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 5;
        int actualAmount = service.calcMaxMonth(amount);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void MinMonth() {
        SalesService service = new SalesService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 8;
        int actualAmount = service.calcMinMonth(amount);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void amountDownAverage() {
        SalesService service = new SalesService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 5;
        int actualAmount = service.calcAmountDownAverage(amount);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void amountUpAverage() {
        SalesService service = new SalesService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 5;
        int actualAmount = service.calcAmountUpAverage(amount);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }
}
