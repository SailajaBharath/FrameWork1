package excel_Reader;

import java.io.File;
import java.util.Date;

public class GettingDate {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString().replace(":", "-"));
		

	}

}
