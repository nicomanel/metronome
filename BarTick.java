package metronome;

import java.util.ArrayList;
import java.util.List;

public class BarTick {
    private List<AbstractRythm> rythms;

    public BarTick()
    {
        rythms = new ArrayList<AbstractRythm>();
    }

    public boolean isComplete()
    {
        int timeSum = 0;
        int commonDiviser = computeCommonDiviser();
        if (rythms.size() == 0)
        {
            return true;
        }

        for(AbstractRythm rythm : rythms)
        {
            timeSum += rythm.getTimeValue() * rythm.getTimeDivision() / commonDiviser ;
        }

        return timeSum == commonDiviser;
    }

    public boolean addRythm(AbstractRythm aNewRythm)
    {
        rythms.add(aNewRythm);
        return true;
    }

    public int computeCommonDiviser()
    {
        List<Integer> knownDiviser = new ArrayList<Integer>();
        int commonDiviser = 0;
        for(AbstractRythm rythm : rythms)
        {
            int diviser = rythm.getTimeDivision();
            if (knownDiviser.contains(diviser))
            {
                commonDiviser *= diviser;
            }
        }
        return commonDiviser;
    }

}
