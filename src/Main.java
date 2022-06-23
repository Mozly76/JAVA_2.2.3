public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // int credit = 1_000_000;
        // double interestRate = 9.99;
        // int validity = 12;
        // double payment = service.calculate(credit, interestRate, validity);
        // System.out.println(payment);

        System.out.println();
        System.out.println("1_000_000 / 9.99 / 12");
        System.out.println(service.calculate(1_000_000, 9.99, 12));

        System.out.println();
        System.out.println("1_000_000 / 9.99 / 24");
        System.out.println(service.calculate(1_000_000, 9.99, 24));

        System.out.println();
        System.out.println("1_000_000 / 9.99 / 36");
        System.out.println(service.calculate(1_000_000, 9.99, 36));
    }
}