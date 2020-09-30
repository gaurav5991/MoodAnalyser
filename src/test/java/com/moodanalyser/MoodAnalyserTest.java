package com.moodanalyser;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest
{
    @BeforeClass
    public static void beforeClass()
    {
        MoodAnalyser analyser = new MoodAnalyser();
        analyser.printWelcomeMessage();
    }

    @Test
    public void givenMessage_if_not_Sad_shouldReturn_Happy()
    {
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY",mood);
    }

}
