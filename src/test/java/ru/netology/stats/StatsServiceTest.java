package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.sum(sales);
        long sum = 0;
        for (long num : sales) {
            sum = sum + num;
        }
        long expected = sum;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.minSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.maxSales(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.belowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void aboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.aboveAverage(sales);
        long expected = 7;
        Assertions.assertEquals(expected, actual);

    }
}
