package model.services;

public class PaypalService implements OnlinePaymentService {


    public static final double FEE_PERCENTAGE = 0.02;
    public static final double MONTHLY_INTEREST = 0.01;

    public double paymentFee(double amount){

        return amount * FEE_PERCENTAGE;


    }

    public double interest(double amount, int month){

        return amount * MONTHLY_INTEREST * month;

    }

}
