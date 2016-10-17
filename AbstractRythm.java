package metronome;

public abstract class AbstractRythm {
    protected int timeDivision;
    protected int timeValue;

    public int getTimeDivision() {
        return timeDivision;

    }

    public int getTimeValue() {
        return timeValue;
    }

    public AbstractRythm(int timeValue, int timeDivision)
    {
           this.timeValue = timeValue;
           this.timeDivision = timeDivision;
    }

    public abstract boolean isSilence();


}
