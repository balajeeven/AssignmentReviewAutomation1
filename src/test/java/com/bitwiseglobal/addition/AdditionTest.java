package com.bitwiseglobal.addition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by balajeev on 2/5/2016.
 */
public class AdditionTest {

 @Test

    public void itShouldAddTwoNumbers()
 {
     Addition ob=new Addition();

     assertEquals(20,ob.add(10,20));
 }

    @Test

    public void itShouldSubtractTwoNumbers()
    {
        Addition ob=new Addition();

        assertEquals(10,ob.sub(20,10));
    }



}
