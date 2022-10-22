import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class Automat {
    private String uuid;
    private String manufacturer;
    private String state;

    private HashMap<Integer, InputData> Data;

    public Automat(String id, String manufacturer){
        this.uuid = id;
        this.manufacturer = manufacturer;
        this.state = "OFF";
        Data = new HashMap<>();
    }

    public void input(String csvFile) throws FileNotFoundException {
        File getCSV = new File(csvFile);
        Scanner sc = new Scanner(getCSV);
        sc.useDelimiter(";|\\r\\n");
        while (sc.hasNext()){
            int id = Integer.parseInt(sc.next());
            String clas = sc.next();
            int keinPlan = Integer.parseInt(sc.next());
            String name = sc.next();
            String passID = sc.next();
            String ticketID = sc.next();
            Data.put(id, new InputData(0, "", "", "", null, ticketID, clas.charAt(0), name, passID));
        }
    }

    public String print(int i){
        return Data.get(i).print();
    }
}
