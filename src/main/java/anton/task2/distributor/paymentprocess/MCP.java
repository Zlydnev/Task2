package anton.task2.distributor.paymentprocess;

public class MCP implements PaymentProcess{
    @Override
    public String paymentProcess(String payment) {
        return payment + " " + "MCP payment process complete";
    }
}
