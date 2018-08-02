package com.exampleDatabase.ExampleClass.Model;

import java.math.BigDecimal;

public class TradeRetType {
    Integer Trader_ID;
    String SECTOR_1;
    String SECTOR_2;
    BigDecimal SECTOR_LIMIT;
    BigDecimal OVERALL_LIMIT;
   // BigDecimal sector1_limit,sector2_limit;

    public Integer getTrader_ID() {
        return Trader_ID;
    }

    public String getSECTOR_1() {
        return SECTOR_1;
    }

    public String getSECTOR_2() {
        return SECTOR_2;
    }

    public BigDecimal getSECTOR_LIMIT() {
        return SECTOR_LIMIT;
    }

    public BigDecimal getOVERALL_LIMIT() {
        return OVERALL_LIMIT;
    }

   /* public BigDecimal getSector1_limit() {
        return sector1_limit;
    }

    public BigDecimal getSector2_limit() {
        return sector2_limit;
    }*/
}
