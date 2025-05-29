package src.main.java.storage;


import java.util.ArrayList;
import java.util.List;
public class DataRepository {
    private DataRepository() {}
    private static DataRepository instance;
    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }
private List<SensorData> lista=new ArrayList<>();
    public void addData(SensorData dataRecord){
        // TODO store data (e.g. in a List)
        lista.add(dataRecord);
    }

    // TODO implement a method to get the stored data (needed by the strategies)
    public List<SensorData> getRecords() {
        return lista;
    }
}


