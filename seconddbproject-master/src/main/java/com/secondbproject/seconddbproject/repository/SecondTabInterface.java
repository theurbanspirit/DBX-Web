package com.secondbproject.seconddbproject.repository;

import com.secondbproject.seconddbproject.model.SecondTab;

import java.util.List;

/**
 * Created by abhi on 24/07/18.
 */

public interface SecondTabInterface {

    void saveData(SecondTab secondTab);

    List<SecondTab> getList();

    SecondTab getSingleRecord(Integer id);

    List<SecondTab> getSingleList(Integer id);

    void updateData(Integer id,String name);

    void deleteData(Integer id);
}
