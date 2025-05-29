package src.main.java.dataprocessing;

import src.main.java.storage.SensorData;

public class BasicStepCountStrategy implements StepCountStrategy {
private int totalSteps;
    @Override
    public void consumeMessage(SensorData sample) {
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
