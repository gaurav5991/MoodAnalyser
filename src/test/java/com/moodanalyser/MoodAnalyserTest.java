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
    public void givenMessage_When_Sad_shouldReturn_Sad()
    {
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("Its a Sad Message");
        Assert.assertEquals("SAD",mood);
    }

}
