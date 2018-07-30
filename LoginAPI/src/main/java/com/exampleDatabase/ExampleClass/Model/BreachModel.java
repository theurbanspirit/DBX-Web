package com.exampleDatabase.ExampleClass.Model;

public class BreachModel {
     Integer Trader_ID;
     String TRADER_NAME;
     Integer SECTOR_LIMIT;
     Integer OVERALL_LIMIT;
     Integer Total_Trade;

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

    public Integer getSECTOR_LIMIT() {
        return SECTOR_LIMIT;
    }

    public void setSECTOR_LIMIT(Integer SECTOR_LIMIT) {
        this.SECTOR_LIMIT = SECTOR_LIMIT;
    }

    public Integer getOVERALL_LIMIT() {
        return OVERALL_LIMIT;
    }

    public void setOVERALL_LIMIT(Integer OVERALL_LIMIT) {
        this.OVERALL_LIMIT = OVERALL_LIMIT;
    }

    public Integer getTotal_Trade() {
        return Total_Trade;
    }

    public void setTotal_Trade(Integer total_Trade) {
        Total_Trade = total_Trade;
    }
}
