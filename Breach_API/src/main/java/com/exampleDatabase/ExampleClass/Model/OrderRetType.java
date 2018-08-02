package com.exampleDatabase.ExampleClass.Model;

import java.math.BigDecimal;

public class OrderRetType {
    String SECURITY;
    BigDecimal QUANTITY;
    BigDecimal LIMIT_PRICE;
    String DIRECTION;
    BigDecimal VALUE;
    Integer Trader_ID;
    public OrderRetType(String SECURITY, BigDecimal QUANTITY, BigDecimal LIMIT_PRICE, String DIRECTION, BigDecimal VALUE,Integer trader_ID) {
        this.SECURITY=SECURITY;
        this.QUANTITY=QUANTITY;
        this.LIMIT_PRICE=new BigDecimal(0);
        this.LIMIT_PRICE=LIMIT_PRICE;
        this.DIRECTION=DIRECTION;
        this.VALUE=new BigDecimal(0);
        this.VALUE=VALUE;
        Trader_ID=trader_ID;
    }

    public Integer getTrader_ID() {
        return Trader_ID;
    }

    public void setTrader_ID(Integer trader_ID) {
        Trader_ID=trader_ID;
    }

    public String getSECURITY() {
        return SECURITY;
    }

    public void setSECURITY(String SECURITY) {
        this.SECURITY=SECURITY;
    }

    public BigDecimal getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(BigDecimal QUANTITY) {
        this.QUANTITY=QUANTITY;
    }

    public BigDecimal getLIMIT_PRICE() {
        return LIMIT_PRICE;
    }

    public void setLIMIT_PRICE(BigDecimal LIMIT_PRICE) {
        this.LIMIT_PRICE=LIMIT_PRICE;
    }

    public String getDIRECTION() {
        return DIRECTION;
    }

    public void setDIRECTION(String DIRECTION) {
        this.DIRECTION=DIRECTION;
    }

    public BigDecimal getVALUE() {
        return VALUE;
    }

    public void setVALUE(BigDecimal VALUE) {
        this.VALUE=VALUE;
    }
}
