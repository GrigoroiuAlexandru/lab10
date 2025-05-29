package src.main.java.dataprocessing;
import src.main.java.storage.SensorData;

public interface StepCountStrategy {
    void consumeMessage(SensorData sample);
    int getTotalSteps();
    String getStrategyDescription();
}
