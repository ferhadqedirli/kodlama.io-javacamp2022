package com.company;

import com.company.entity.CorporateCustomer;
import com.company.entity.Customer;
import com.company.entity.IndividualCustomer;
import com.company.entity.Product;


public class Main {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscountRate(7d);
        product1.setUnitPrice(5700d);
        product1.setUnitsInStock(3);
        product1.setImageUrl("test.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscountRate(8d);
        product2.setUnitPrice(4500d);
        product2.setUnitsInStock(2);
        product2.setImageUrl("test2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Kahve Makinesi");
        product3.setDiscountRate(9d);
        product3.setUnitPrice(6500d);
        product3.setUnitsInStock(4);
        product3.setImageUrl("test3.jpg");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product);
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("10000");
        individualCustomer.setPhone("+994555411426");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demirog");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(1);
        corporateCustomer.setTaxNumber("1402660101");
        corporateCustomer.setCompanyName("Evim Tekstil MMC");
        corporateCustomer.setCustomerNumber("10001");
        corporateCustomer.setPhone("+994512917202");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}
