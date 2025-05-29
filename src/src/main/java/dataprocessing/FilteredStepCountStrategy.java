package src.main.java.dataprocessing;

import src.main.java.storage.SensorData;

import java.util.List;

public class FilteredStepCountStrategy implements StepCountStrategy {
private int totalSteps;
    @Override
    public void consumeMessage(SensorData sample) {
        if(sample.getStepsCount()>0)
totalSteps+=sample.getStepsCount();
    }

    @Override
    public int getTotalSteps() {
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "";
    }
}
