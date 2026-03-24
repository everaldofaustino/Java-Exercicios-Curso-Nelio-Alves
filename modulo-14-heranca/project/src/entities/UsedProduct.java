package entities;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product {

    private LocalDate manufacturedDate;

    public UsedProduct(){

    }

    public UsedProduct(String name,double price,LocalDate manufacturedDate){
        super(name,price);
        this.manufacturedDate = manufacturedDate;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }



    @Override
    public String priceTag(){

        return getName()
                + " (Used) $ "
                + getPrice()
                + " (Manufactured date: "
                + manufacturedDate
                + ")";



    }
}
