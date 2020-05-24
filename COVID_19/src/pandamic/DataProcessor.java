package pandamic;

public class DataProcessor {
	
	public static final String FILE_PATH = "F:\\Eclipse\\COVID_19\\src\\covid-19-data.json";

	public static void main(String[] args) {
		
		DataReader reader = new DataReader();
		reader.readData(FILE_PATH);
		
	}

}
