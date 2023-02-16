package ru.netology.stats;

public class SalesService {
    public static void main(String[] args) {

    }

    public int calcSales(int[] amount) {  //общая сумма
        int sales = amount[0];
        for (int i = 1; i < amount.length; i++) {
            sales = sales + amount[i];
        }
        return sales;
    }

    public int calcAverageAmount(int[] amount) {  //средняя сумма
        int avAmount = 0;
        int sales = amount[0];
        for (int i = 1; i < amount.length; i++) {
            sales = sales + amount[i];
        }
        avAmount = sales / amount.length;
        return avAmount;
    }

    public int calcMaxMonth(int[] amount) {
        int maxMonth = amount[0];
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] > amount[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int calcMinMonth(int[] amount) {
        int minMonth = amount[0];
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] < amount[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int calcAmountDownAverage(int[] amount) {
        int avAmount = 0;
        int amountDownAverage = 0;
        int sales = amount[0];
        for (int i = 1; i < amount.length; i++) {
            sales = sales + amount[i];
        }
        avAmount = sales / amount.length;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] < avAmount) {
                amountDownAverage++;
            }
        }
        return amountDownAverage;
    }

    public int calcAmountUpAverage(int[] amount) {
        int avAmount = 0;
        int amountDownAverage = 0;
        int sales = amount[0];
        for (int i = 1; i < amount.length; i++) {
            sales = sales + amount[i];
        }
        avAmount = sales / amount.length;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] > avAmount) {
                amountDownAverage++;
            }
        }
        return amountDownAverage;
    }
}
