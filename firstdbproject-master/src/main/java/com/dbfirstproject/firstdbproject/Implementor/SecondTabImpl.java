package com.dbfirstproject.firstdbproject.Implementor;

import com.dbfirstproject.firstdbproject.Interface.SecondTabInterface;
import com.secondbproject.seconddbproject.model.SecondTab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by abhi on 24/07/18.
 */

@Repository
public class SecondTabImpl implements SecondTabInterface {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //@Override
    public void saveData(SecondTab secondTab) {

        String sql="insert into student values" +
                "(?,?,?)";

        jdbcTemplate.update(sql,
                new Object[]{/*secondTab.getId(),secondTab.getName(),
                secondTab.getCity()*/});
    }// a different class to insert the values

    @Override
    public List<SecondTab> getList() {
        String sql="select symbol from securities";

        List<SecondTab> list=jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(SecondTab.class));

        List<SecondTab> list2;

    /*    for (int i=0; i<list.size(); i++){
         String company=list.get(i).getCompany_name();
         String sql1 = "select * from '"+company+"'";
         list2=jdbcTemplate.query(sql,
                    new BeanPropertyRowMapper(SecondTab.class));


         for(int j=0;j<list2.size();j++){
             System.out.println(list2.get(j).get)
         }

        }*/

        return list;
    }
    @Override
    public SecondTab getSingleRecord(Integer id) {
        // ? in sql query means object array has 2 parametres
        String sql="select company_name from securities where security_id = ?"     ;
// trading id getter are required since to receive the values
        SecondTab st=jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(SecondTab.class));

        //Execute a query for a result object, given static SQL.

        return st;                                   // this is for queryForObject
    }

    @Override
    public List<SecondTab> getSingleList(Integer id) {
        Integer id1=id;
// ? in sql query means object array has 2 parametres
        String sql="select * from securities where sector =(select sector_1 from trading_limits where trader_id =?) " +
                "or sector =(select sector_2 from trading_limits where trader_id =?)" ;
// trading id getter are required since to receive the values
        List<SecondTab> list2=jdbcTemplate.query(sql,new Object[]{id,id1},
                        new BeanPropertyRowMapper<>(SecondTab.class));//Execute a query for a result object, given static SQL.
        return list2;                                        // this is for queryForObject
    }

    @Override
    public void updateData(Integer id, String name) {

        String sql="update student set name=? where id=?";
        jdbcTemplate.update(sql,
                new Object[]{name,id},
                new int[]{Types.VARCHAR,
                        Types.INTEGER});
    }

    @Override
    public void deleteData(Integer id) {

        String sql="delete from student where id=?";

        jdbcTemplate.update(sql,new Object[]{id},
                new int[]{Types.INTEGER});

    }


}
