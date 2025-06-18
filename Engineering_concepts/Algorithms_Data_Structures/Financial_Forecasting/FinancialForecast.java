public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double initialValue, double rate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return predictFutureValue(initialValue, rate, years - 1) * (1 + rate);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment amount in ₹
        double rate = 0.05;           // Annual growth rate (5%)
        int years = 5;                // Number of years to forecast

        double futureValue = predictFutureValue(initialValue, rate, years);

        System.out.printf("Predicted future value after %d years: ₹%.2f\n", years, futureValue);
    }
}
