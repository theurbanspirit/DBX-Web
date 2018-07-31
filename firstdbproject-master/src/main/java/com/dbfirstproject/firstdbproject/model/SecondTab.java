package com.secondbproject.seconddbproject.model;

import java.util.Date;

/**
 * Created by abhi on 24/07/18.
 */
public class SecondTab {

   /* Integer id;
    String name;
    String city;*/
//---------------->SECURITIES

    Integer security_id;
    String company_name;
    String sector;
    String symbol;
    String isin;
    //  Integer market_lot;
    //  String price_variance_limit;


    // public Integer getTrader_id() {
    //   return trader_id;
    //}
    //Integer trader_id;
    /*    public Integer getSecurity_id() {
            return security_id;
        }0
    */
    public String getCompany_name() {
        return company_name;
    }

    public String getSector() {
        return sector;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getIsin() {
        return isin;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }
}
    /*public Integer getMarket_lot() {
        return market_lot;
    }

    public void setMarket_lot(Integer market_lot) {
        this.market_lot = market_lot;
    }

    public String getPrice_variance_limit() {
        return price_variance_limit;
    }

    public void setPrice_variance_limit(String price_variance_limit) {
        this.price_variance_limit = price_variance_limit;
    }*/


    /*public Integer getTrader_id() {
        return trader_id;
    }

    public void setTrader_id(Integer trader_id) {
        this.trader_id = trader_id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    Integer trader_id;
    Double value;
}*/
 /* //------------------>ORDERS
    String client_name;
    String security;
    String trade_date;
    Integer quantity;
    String trade_type;
    Double limit_price;
    String direction;


    Integer order_id;
    //----------------------------*/

    /*@Override
    public String toString() {
        return "SecondTab{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}*/
