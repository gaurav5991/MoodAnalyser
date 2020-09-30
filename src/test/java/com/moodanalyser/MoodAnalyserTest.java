package com.moodanalyser;

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
}
