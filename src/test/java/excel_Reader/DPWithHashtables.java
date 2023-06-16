package excel_Reader;

		import org.testng.annotations.DataProvider;

		import java.util.Hashtable;

		public class DPWithHashtables {

		    @DataProvider(name = "data")
		    public Object[][] testData() {
		        Object[][] data = new Object[2][1];

		        // Creating key-value pairs
		        Hashtable<String, String> dataSet1 = new Hashtable<>();
		        dataSet1.put("username", "sailaja");
		        dataSet1.put("password", "s@123");
		        data[0][0] = dataSet1;

		        Hashtable<String, String> dataSet2 = new Hashtable<>();
		        dataSet2.put("username", "bharath");
		        dataSet2.put("password", "b@123");
		        data[1][0] = dataSet2;

		        return data;
		    }
		}

	

	
	


