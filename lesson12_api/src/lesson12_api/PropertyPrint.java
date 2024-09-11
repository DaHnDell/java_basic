package lesson12_api;

import java.util.Date;
import java.util.Calendar;
import java.util.Properties;
import java.util.Set;

public class PropertyPrint {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		Set<?> keys = props.keySet();
		for(Object o : keys) {
			String key = o.toString();
			System.out.printf("%s ::::: %s", key, System.getProperty(key));
		}
		// epoch time; 
		// 1970 / 1. 1 00:00:00 0 / 이 이후로 지난 ms
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date().getTime());
		System.out.println(Calendar.getInstance().getTime());
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DATE, 8);
		
		long between = cal.getTimeInMillis() - System.currentTimeMillis();
		System.out.println(between / 1000 / 60 / 60 / 24);
		
		
	}
	
}
