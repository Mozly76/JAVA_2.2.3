public class CreditPaymentService {
    public double calculate(int a, double b, int c) {
        double payment = (a * (b / 12) / 100 * Math.pow((1 + (b / 12) / 100), c)) / (Math.pow(1 + (b / 12) / 100, c) - 1);
        return payment;
    }
}