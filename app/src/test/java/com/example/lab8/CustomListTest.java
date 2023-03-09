package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }


    @Test
    void testHasCity() {
        list = MockCityList();
        City city = new City("Ooga", "Booga");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        City city2 = new City("Oooga", "Boooga");
        assertFalse(list.hasCity(city2));
    }

//    @Test
//    void testDelete() {
//        list = MockCityList();
//        City city = new City("Ooga", "Booga");
//        list.add(city);
//        int size = list.getCities().size();
//        list.delete(city);
//        int size2 = list.getCities().size();
//        assertEquals(size - 1, size2);
//    }
//    @Test
//    void testDeleteException() {
//        list = MockCityList();
//        City city = new City("Ooga", "Booga");
//        assertThrows(IllegalArgumentException.class, () -> {
//            list.delete(city); });
//    }
}
