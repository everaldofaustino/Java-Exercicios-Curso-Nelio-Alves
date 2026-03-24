public class CurrencyConverter {

    public double calcDolar;
    public double dolarReal;
    public static double IOF = 0.06;



    public static double converter(double amount, double dollarPrice){

      return  (amount * dollarPrice) * (1 + IOF);

    }



}
