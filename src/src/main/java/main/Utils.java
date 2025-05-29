package src.main.java.main;

import src.main.java.dataprocessing.BasicStepCountStrategy;
import src.main.java.dataprocessing.FilteredStepCountStrategy;
import src.main.java.dataprocessing.StepCountStrategy;

public class Utils {
    public static final String BASIC_STRATEGY = "basic";
    public static final String FILTERED_STRATEGY = "filtered";

    public static int getClientId() {
        return 42;
    }

    // TODO implement static getStrategy(String type). Returns either BasicStepCountStrategy or FilteredStepCountStrategy
    public static StepCountStrategy getStrategy(String type){
        if(BASIC_STRATEGY.equals(type)){
            return new BasicStepCountStrategy();
        }else  if(FILTERED_STRATEGY.equals(type)){
            return new FilteredStepCountStrategy();
        }
    return  null;
    }
}
