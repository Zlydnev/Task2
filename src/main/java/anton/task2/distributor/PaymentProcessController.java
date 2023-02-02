package anton.task2.distributor;

import anton.task2.client.Client;
import anton.task2.distributor.paymentprocess.MCP;
import anton.task2.distributor.paymentprocess.PaymentProcess;
import anton.task2.distributor.paymentprocess.Way4;

//  Класс предназначен для определения типа транзакции клиента
public class PaymentProcessController {
    public PaymentProcess getPaymentProcess(Client client) {
        if(client.isSignOfPensioner()){
            return new MCP();
        }
        return new Way4();
    }
}
