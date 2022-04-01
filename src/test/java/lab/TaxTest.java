package lab;

import lab.demand.Tax;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaxTest {
    private Tax tax;
    public TaxTest(Tax tax){this.tax = tax;}

    public void TestTax(){
        Assert.assertEquals(tax.calculateTax("PE"),0.1);
        Assert.assertEquals(tax.calculateTax("BR"),0.2);
        Assert.assertEquals(tax.calculateTax("CH"),"");
        Assert.assertEquals(tax.calculateTax("10"),"0.1");

    }

}
