package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class ContractService {


    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract,int month){
        double parcelQuota = contract.getTotalValue()/month;

        for(int i = 1; i<=month;i++){
            LocalDate plusDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(parcelQuota,i);
            double paymentFee = onlinePaymentService.paymentFee(parcelQuota);
            double soma = parcelQuota + paymentFee+interest;
            contract.getInstallment().add(new Installment(plusDate,soma));





        }








    }
}
