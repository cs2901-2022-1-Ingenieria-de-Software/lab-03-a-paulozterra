package lab.demand;

import java.util.List;

public class ManageDemand {

    private Tax tax;

    public ManageDemand(Tax tax) {
        this.tax = tax;
    }

    public double calculateTotal(List<Order> orders){
        // Calculate Taxes
        double taxes = 0.0;
        for (Order order : orders) {
            double tax = this.tax.calculateTax(order.getCountry());
            taxes += tax;
        }

        // Calculate Total
        double quantities = 0.0;
        for (Order order : orders) {
            double temp = order.getQuantity();
            quantities += temp;
        }

        return quantities * taxes;
    }

    public double calculateTotalForWithAdditionalByCountry(List<Order> orders){
        // Calculate additionals by country
        double taxes = 0.0;

        for (Order order : orders) {
            String currCountry = order.getCountry();
            switch (currCountry) {
                case "PE":
                    taxes += 0.20;
                case "BR":
                    taxes += 0.30;
                default:
                    taxes += 0.10;
            }

        }

        // Calculate Total
        double quantities = 0.0;
        for (Order order : orders) {
            double temp = order.getQuantity();
            quantities += temp;
        }

        return quantities * taxes;
    }

}
