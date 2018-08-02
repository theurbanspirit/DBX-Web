package com.exampleDatabase.ExampleClass.Model;

import java.math.BigDecimal;

public class BreachRetType {
    Integer Trader_ID;
    String sector_of_breach;
    BigDecimal amount_breach;

    public BreachRetType(Integer trader_ID, String sector_of_breach, BigDecimal amount_breach) {
        Trader_ID=trader_ID;
        this.sector_of_breach=sector_of_breach;
        this.amount_breach=amount_breach;
    }

    public Integer getTrader_ID() {
        return Trader_ID;
    }

    public void setTrader_ID(Integer trader_ID) {
        Trader_ID=trader_ID;
    }

    public String getSector_of_breach() {
        return sector_of_breach;
    }

    public void setSector_of_breach(String sector_of_breach) {
        this.sector_of_breach=sector_of_breach;
    }

    public BigDecimal getAmount_breach() {
        return amount_breach;
    }

    public void setAmount_breach(BigDecimal amount_breach) {
        this.amount_breach=amount_breach;
    }
}
