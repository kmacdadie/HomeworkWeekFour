package secondTimeAround;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class homework2 {

	public static void main(String[] args) {
		
		List<String> employeeNames = new ArrayList<String>();
			employeeNames.add("Keith Mac");
			employeeNames.add("Jd Tomp");
			employeeNames.add("Matt F");
			employeeNames.add("Nick Suw");
			employeeNames.add("Brantley M");
		
		Set<Integer> ids = new HashSet<Integer>();
			ids.add(0);
			ids.add(1);
			ids.add(2);
			ids.add(3);
			ids.add(4);
			
		Map<Integer,String> employeeMap = new HashMap<Integer, String>();
			
		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i++));
			//System.out.println(i);
		}
		
		for (Integer employee : employeeMap.keySet()){
		    System.out.println(employee + " : " + employeeNames.get(employee));
		}
			
		StringBuilder idsBuilder = new StringBuilder();
		for (Integer id : ids) {
			idsBuilder.append(id + "- " );
		}
			System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		for (String employeeName : employeeNames) {
				namesBuilder.append(employeeName + "- " );
			}
				System.out.println(namesBuilder.toString());
			
			
	}
}