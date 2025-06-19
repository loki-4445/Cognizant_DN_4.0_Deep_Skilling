public class AdapterPatternDemo {
    public static void main(String[] args) {

        // PayPal payment
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(1500);

        // Stripe payment
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        stripe.processPayment(2999);

        // Razorpay payment
        PaymentProcessor razor = new RazorpayAdapter(new RazorpayGateway());
        razor.processPayment(999);
    }
}
