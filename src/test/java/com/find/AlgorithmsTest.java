package com.find;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    public void testFindSeven(){
        FindSeven algo = new FindSeven();

        int randomArray[] = {1,2,3,4,5,6,87};
        assertTrue(algo.findSeven(randomArray));

        int randomArray1[] = {8, 6, 33, 100};
        assertFalse(algo.findSeven(randomArray1));

        int randomArray2[] = {2, 55, 60, 97642, 86};
        assertTrue(algo.findSeven(randomArray2));

        int randomArray3[] = {2, 55, 60, 77777, 86};
        assertTrue(algo.findSeven(randomArray3));

        int randomArray4[] = {86};
        assertFalse(algo.findSeven(randomArray4));

        int randomArray5[] = {7};
        assertTrue(algo.findSeven(randomArray5));

        int randomArray6[] = {};
        assertFalse(algo.findSeven(randomArray6));

    }

    @Test
    public void testDigitSum(){
        DigitSum algo = new DigitSum();

        assertEquals(1 , algo.digitSum(10) );
        assertEquals(2 , algo.digitSum(38) );
        assertEquals(2 , algo.digitSum(785) );
        assertEquals(1 , algo.digitSum(99892) );
        assertEquals(1 , algo.digitSum(1000) );
        assertEquals(0 , algo.digitSum(0) );
        assertEquals(9 , algo.digitSum(567) );
    }

    @Test
    public void testDoRemake(){
        DoRemake algo = new DoRemake();

        assertEquals("Histay isway away aypay." , algo.doRemake("This is a pay.") );
        assertEquals( "Atscay areway reatgay etspay.", algo.doRemake("Cats are great pets.") );
        assertEquals( "Ehay oldtay usway away eryvay excitingway aletay.", algo.doRemake("He told us a very exciting tale.") );
        assertEquals( "Histay isway otallytay rongway Rmay Mithsay.", algo.doRemake("This is totally wrong Mr Smith.") );
//        assertEquals("Omtay otgay away allsmay iecepay ofway iepay.", algo.doRemake("Tom got a small piece of pie." ) );

    }

}