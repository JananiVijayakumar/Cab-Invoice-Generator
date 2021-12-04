package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInVoiceServiceTest {
    CabInVoiceGenerator inVoiceGenerator = null;
    private InVoiceSummary fare;

    @Before
    public void setUp(){
        inVoiceGenerator = new CabInVoiceGenerator();
    }
    @Test
    public void givenUserId_ShouldReturnInvoiceSummary() {
        InVoiceSummary inVoiceSummary1 = inVoiceGenerator.getInvoice(1);
        InVoiceSummary expectedInvoices = new InVoiceSummary(2, 30);
        Assert.assertEquals(expectedInvoices.getInvoiceSummary(), inVoiceSummary1.getInvoiceSummary());
    }
}
