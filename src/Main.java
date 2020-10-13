public class Main {
    public static void main(String[] args) {
        double regularCosts = 1000.0;
        double higherCashCosts = 1000.0;
        double specialCosts = 1000.0;
        int regularCash = 1;
        int higherCash = 5;
        int specialCash = 30;
        double limit = 3000.0;

        double regularCashback = regularCosts * regularCash / 100.0;

        if (regularCashback > limit) {

            regularCashback = limit;
        }

        double higherCashback = higherCashCosts * higherCash / 100.0;

        if (higherCashback > limit) {

            higherCashback = limit;
        }

        double specialCashback = specialCosts * specialCash / 100.0;

        if (specialCashback > limit) {

            specialCashback = limit;
        }

        double cashback = regularCashback + higherCashback + specialCashback;

        System.out.println(cashback);
    }
}