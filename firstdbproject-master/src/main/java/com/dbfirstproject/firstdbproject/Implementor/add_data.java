package com.dbfirstproject.firstdbproject.Implementor;

import com.dbfirstproject.firstdbproject.Interface.add_data_interface;
import com.opencsv.CSVReader;
import org.springframework.stereotype.Repository;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

@Repository
public class add_data implements add_data_interface {




    public void readCsv(){



        try (CSVReader reader = new CSVReader(new FileReader("/Users/gurmehrsohi/Downloads/a.csv"), ','); Connection connection = DBConnection.getConnection();)
        {
            System.out.println("sdufhiw");
            String insertQuery = "Insert into securities (SECURITY_ID,COMPANY_NAME, SECTOR, SYMBOL,ISIN,MARKET_LOT,PRICE_VARIANCE_LIMIT) values (null,?,?,?,?,?,?)";

            PreparedStatement pstmt = connection.prepareStatement(insertQuery);
            String[] rowData = null;
            int i = 0;
            System.out.println("reached");
            while((rowData = reader.readNext()) != null){
                for (String data : rowData)
                {
                    pstmt.setString((i % 3) + 1, data);

                    if (++i % 3 == 0)
                        pstmt.addBatch();// add batch

                    if (i % 30 == 0)// insert when the batch size is 10
                        pstmt.executeBatch();
                }}
            System.out.println("Data Successfully Uploaded");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



    }


    public void readCsvUsingLoad(){
        try (
                Connection connection = DBConnection.getConnection())
        {

            String loadQuery = "LOAD DATA LOCAL INFILE '" + "/Users/gurmehrsohi/Downloads/a.csv" + "' INTO TABLE securities FIELDS TERMINATED BY ','"
                    + " LINES TERMINATED BY '\n' (SECURITY_ID,COMPANY_NAME, SECTOR, SYMBOL,ISIN,MARKET_LOT,PRICE_VARIANCE_LIMIT) ";
            System.out.println(loadQuery);
            Statement stmt = connection.createStatement();
            stmt.execute(loadQuery);
            System.out.println("done final");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    };



}
