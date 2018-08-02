package com.exampleDatabase.ExampleClass.Model;

public class Security_RetType {
    String Company_Name;

    public String getCompany_Name() {
        return Company_Name;
    }

    public void setCompany_Name(String company_Name) {
        Company_Name=company_Name;
    }

    public String getISIN() {
        return ISIN;
    }

    public void setISIN(String ISIN) {
        this.ISIN=ISIN;
    }

    public String getSECTOR() {
        return SECTOR;
    }

    public void setSECTOR(String SECTOR) {
        this.SECTOR=SECTOR;
    }

    public String getSYMBOL() {
        return SYMBOL;
    }

    public void setSYMBOL(String SYMBOL) {
        this.SYMBOL=SYMBOL;
    }

    String ISIN;
    String SECTOR;
    String SYMBOL;




}
