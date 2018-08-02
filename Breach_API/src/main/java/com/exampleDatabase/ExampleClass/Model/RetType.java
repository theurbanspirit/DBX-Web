package com.exampleDatabase.ExampleClass.Model;

import java.math.BigDecimal;
import java.util.List;

public class RetType {
    String retmsg;
    BigDecimal percent;
    String sector;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector=sector;
    }

    public List<Security_RetType> getRet() {
        for(Security_RetType srt:ret){
            System.out.println(srt.getSYMBOL());
        }
        return null;
    }

    public void setRet(List<Security_RetType> ret) {
        this.ret=ret;
    }

    List<Security_RetType> ret;


    public RetType(String retmsg, BigDecimal percent, String sector,List<Security_RetType> ret) {
        this.retmsg=retmsg;
        this.percent=percent;
        this.sector=sector;
        this.ret=ret;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg=retmsg;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent=percent;
    }
}
