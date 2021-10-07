package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvd(int[] seles) {
        int averageСost = calculateSum(seles) / seles.length;
        return averageСost;

    }

    public int findMaxSale(int[] seles) {
        int month = 1;
        int max = seles[0];
        for (int i = 1; i < seles.length; i++) {
            if (seles[i] >= max) {
                max = seles[i];
                month = i + 1;

            }

        }
        return month;
    }

    public int minimumMaxSale(int[] seles) {
        int month = 1;
        int minimum = seles[0];
        for (int i = 1; i < seles.length; i++) {
            if (seles[i] <= minimum) {
                minimum = seles[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int monthsAmountWithSalesHigherAverage(int[] seles) {
        int month = 0;
        int averageAmount = findAvd(seles);
        for (int i = 0; i < seles.length; i++) {

            if (seles[i] > averageAmount) {
                month = month + 1;
            }
        }
        return month;
    }

    public int monthsWithBelowAverageSales(int[] seles) {
        int month = 0;
        int averageAmount = findAvd(seles);
        for (int i = 0; i < seles.length; i++) {

            if (seles[i] < averageAmount) {
                month = month + 1;
            }
        }
        return month;
    }
}


