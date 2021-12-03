package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInVoiceServiceTest {
    CabInVoiceGenerator inVoiceGenerator = null;
    private InVoiceSummary fare;

    @Before
    public void setUp() throws Exception{
        inVoiceGenerator = new CabInVoiceGenerator();
    }
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        CabInVoiceGenerator inVoiceGenerator=new CabInVoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = inVoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 25.0);
    }

    @Test
    public void givenLessDistanceAndFare_ShouldReturnMinFare(){
        CabInVoiceGenerator inVoiceGenerator = new CabInVoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = inVoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5.0, fare, 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] ride1 = {new Ride(2.0, 5),
                new Ride(0.1, 1),
        };
        CabInVoiceGenerator inVoiceGenerator=new CabInVoiceGenerator();
        InVoiceSummary inVoiceSummary = inVoiceGenerator.calculateFare(ride1);
        InVoiceSummary expectedInVoiceSummary= new InVoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInVoiceSummary, inVoiceSummary);
    }
}
