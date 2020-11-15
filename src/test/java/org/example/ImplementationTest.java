package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImplementationTest
{
    private Implementation imp;

    @BeforeEach
    void setup(){
        imp = new Implementation(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 5});
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
    void testSuccessFindPositions(){
        int[] result = new int[]{4,9};
        Assertions.assertArrayEquals(result, imp.findPositions(5));
    }

    @Test
    void testFailFindPositions(){
        Assertions.assertThrows(NullPointerException.class, () -> imp.findPositions(22));
    }

    @Test
    void testSuccessAppendLast(){
        imp.appendLast(1);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 1};
        Assertions.assertArrayEquals(expected, imp.arr);
    }


    @Test
    void testSuccessInsertAt(){
        int[] expected = new int[]{1, 11, 2, 3, 4, 5, 6 , 7, 8, 9, 5};
        imp.insertAt(1, 11);
        Assertions.assertArrayEquals(expected, imp.arr);
    }

    @Test
    void testFailInsertAt(){
        Assertions.assertThrows(NullPointerException.class, () -> imp.insertAt(22, 21));
    }

    @Test
    void testSuccessGetAt(){
        Assertions.assertEquals(1, imp.getAt(0));
    }

    @Test
    void testFailGetAt(){
        Assertions.assertThrows(NullPointerException.class, () -> imp.getAt(12));
    }

    @Test
    void testSuccessSetAs(){
       imp.setAt(9, 1);
        Assertions.assertEquals(1, imp.arr[9]);
    }

    @Test
    void testFailSetAs(){
        Assertions.assertThrows(NullPointerException.class, () -> imp.setAt(11, 12));
    }

    @Test
    void testSuccessDeleteAt(){
        Assertions.assertEquals(5, imp.deleteAt(4));
    }

    @Test
    void testFailDeleteAt(){
        Assertions.assertThrows(NullPointerException.class, () -> imp.deleteAt(22));
    }
}
