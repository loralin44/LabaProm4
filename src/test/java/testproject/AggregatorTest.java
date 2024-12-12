package testproject;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class AggregatorTest {

    @Test
    public void testInitialState() {
        Aggregator agr = new Aggregator();
        assertThat(agr.getSum()).isZero();
    }

    @Test
    public void testSingleAddition() {
        Aggregator agr = new Aggregator();
        double val = 20;
        agr.addValue(val);
        assertThat(agr.getSum()).isEqualTo(val);
    }

    @Test
    public void testMultipleAdditions() {
        Aggregator agr = new Aggregator();
        double val = 15;
        agr.addValue(val);
        agr.addValue(val);
        assertThat(agr.getSum()).isEqualTo(val * 2);
    }
    @Test
    void testReset() {
        Aggregator agg = new Aggregator();

        // Добавляем значения
        agg.addValue(10);
        agg.addValue(20);
        agg.addValue(30);

        // Проверяем, что сумма равна 60
        assertThat(agg.getSum()).isEqualTo(60);

        // Сбрасываем сумму
        agg.reset();

        // Проверяем, что сумма стала равной 0
        assertThat(agg.getSum()).isEqualTo(0);
    }
}
