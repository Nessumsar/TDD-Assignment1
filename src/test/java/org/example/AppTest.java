package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Implementation imp;

    @BeforeEach
    void setup(){
        imp = new Implementation(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 5});
        //total 50 - size 10
    }

    @AfterEach
    void destroy(){
        imp = null;
    }


    @Test
    void testGetAverage(){
        Assertions.assertEquals(5, imp.getAverage());
    }

    @Test
    void testFindPositions(){
        Assertions.assertEquals(new int[]{4, 9}, imp.findPositions(5));
    }

    @Test
    void testAppendLast(){
        imp.appendLast(1);
        Assertions.assertEquals(1, imp.arr[9]);
    }

    @Test
    void testInsertAt(){
        imp.insertAt(1, 1);
        Assertions.assertEquals(1, imp.arr[1]);
    }

    @Test
    void testGetAt(){
        Assertions.assertEquals(1, imp.getAt(0));
    }

    @Test
    void testSetAs(){
       imp.setAt(9, 1);
        Assertions.assertEquals(1, imp.arr[9]);
    }

    @Test
    void testDeleteAt(int pos){
        Assertions.assertEquals(5, imp.deleteAt(9));
    }
}
