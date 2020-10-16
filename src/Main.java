public class Main {
    public static void main(String[] args) {
        double regularCosts = 100000.0;
        double higherCashCosts = 100000.0;
        double specialCosts = 100000.0;
        int regularCash = 1;
        int higherCash = 5;
        int specialCash = 30;
        double limit = 3000.0;

        double regularCashback = regularCosts * regularCash / 100.0;

        double higherCashback = higherCashCosts * higherCash / 100.0;

        double specialCashback = specialCosts * specialCash / 100.0;

        double cashback = regularCashback + higherCashback + specialCashback;

        if (cashback > limit) {
            cashback = limit;
        }

        System.out.println(cashback);
    }
}