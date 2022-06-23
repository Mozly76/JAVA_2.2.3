public class CreditPaymentService {
    public double calculate(int credit, double interestRate, int validity) {
        double payment = (credit * (interestRate / 12) / 100 * Math.pow((1 + (interestRate / 12) / 100), validity))
                / (Math.pow(1 + (interestRate / 12) / 100, validity) - 1);
        return payment;
    }
}