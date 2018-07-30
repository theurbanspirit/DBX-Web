package com.secondbproject.seconddbproject.impl;

import com.secondbproject.seconddbproject.model.SecondTab;
import com.secondbproject.seconddbproject.repository.SecondTabInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * Created by abhi on 24/07/18.
 */

@Repository
public class SecondTabImpl implements SecondTabInterface{

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
        String sql="select trader_id, sum(value) as value from orders group by trader_id order by trader_id";

        List<SecondTab> list=jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(SecondTab.class));

        return list;
    }
    @Override
    public SecondTab getSingleRecord(Integer id) {
        // ? in sql query means object array has 2 parametres
        String sql="select company_name,sector,symbol,isin from securities where security_id = ?"     ;
// trading id getter are required since to receive the values
        SecondTab st=jdbcTemplate.
        queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(SecondTab.class));//Execute a query for a result object, given static SQL.
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
