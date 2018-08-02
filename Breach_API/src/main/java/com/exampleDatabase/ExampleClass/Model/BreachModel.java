package com.exampleDatabase.ExampleClass.Model;

import java.math.BigDecimal;

public class BreachModel {
     Integer Trader_ID;
     String TRADER_NAME;
     BigDecimal SECTOR_LIMIT;
     BigDecimal OVERALL_LIMIT;
     Integer Total_Trade;
     String msg;
     String SECTOR_1;
     String SECTOR_2;

    public String getSECTOR_1() {
        return SECTOR_1;
    }
    public void setSECTOR_1(String SECTOR_1) {
        this.SECTOR_1=SECTOR_1;
    }

    public String getSECTOR_2() {
        return SECTOR_2;
    }

    public void setSECTOR_2(String SECTOR_2) {
        this.SECTOR_2=SECTOR_2;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getTrader_ID() {
        return Trader_ID;
    }

    public void setTrader_ID(Integer trader_ID) {
        Trader_ID = trader_ID;
    }

    public String getTRADER_NAME() {
        return TRADER_NAME;
    }

    public void setTRADER_NAME(String TRADER_NAME) {
        this.TRADER_NAME = TRADER_NAME;
    }

    public BigDecimal getSECTOR_LIMIT() {
        return SECTOR_LIMIT;
    }

    public void setSECTOR_LIMIT(BigDecimal SECTOR_LIMIT) {
        this.SECTOR_LIMIT = SECTOR_LIMIT;
    }

    public BigDecimal getOVERALL_LIMIT() {
        return OVERALL_LIMIT;
    }

    public void setOVERALL_LIMIT(BigDecimal OVERALL_LIMIT) {
        this.OVERALL_LIMIT = OVERALL_LIMIT;
    }

    public Integer getTotal_Trade() {
        return Total_Trade;
    }

    public void setTotal_Trade(Integer total_Trade) {
        Total_Trade = total_Trade;
    }
}
