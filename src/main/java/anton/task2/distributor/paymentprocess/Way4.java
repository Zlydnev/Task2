package anton.task2.distributor.paymentprocess;


public class Way4 implements PaymentProcess{
    @Override
    public String paymentProcess(String payment) {
        return payment + " " +  "Way4 payment process complete";
    }
}
