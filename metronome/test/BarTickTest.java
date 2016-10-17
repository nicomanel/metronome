package metronome.test;

import metronome.BarTick;
import metronome.EigthNote;
import metronome.QuarterNote;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nico on 17/10/2016 for ${PROJET_NAME}
 */
public class BarTickTest {
    private BarTick barTickTobeTested;

    @Test
    public void isCompleteWithNoRythm() throws Exception {
        Assert.assertEquals(barTickTobeTested.isComplete(), false);
    }

    @Test
    public void isCompleteWith1QuarterNote()
    {
        barTickTobeTested.addRythm(new QuarterNote());
        Assert.assertEquals(barTickTobeTested.isComplete(), true);
    }

    @Test
    public void isCompleteWith2QuarterNote()
    {
        barTickTobeTested.addRythm(new QuarterNote());
        barTickTobeTested.addRythm(new QuarterNote());
        Assert.assertEquals(barTickTobeTested.isComplete(), false);
    }

    @Test
    public void isCompleteWith1EigthNote()
    {
        barTickTobeTested.addRythm(new EigthNote());
        Assert.assertEquals(barTickTobeTested.isComplete(), false);
    }

    @Test
    public void addRythmWhenAlreadyComplete() throws Exception {

    }

    @Test
    public void addRythmWhenNotyComplete() throws Exception {

    }

    @Test
    public void computeCommonDiviser() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        barTickTobeTested = new BarTick();
    }
}