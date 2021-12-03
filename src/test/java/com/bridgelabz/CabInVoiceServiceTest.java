package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInVoiceServiceTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        CabInVoiceGenerator inVoiceGenerator=new CabInVoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = inVoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 25.0);
    }
}
