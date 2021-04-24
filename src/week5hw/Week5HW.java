package week5hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week5HW {

	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeNames.add("Tim");
		employeeNames.add("Becky");
		employeeNames.add("Ryley");
		employeeNames.add("Josh");
		employeeNames.add("Henry");
		ids.add(23);
		ids.add(42);
		ids.add(18);
		ids.add(4);
		ids.add(12);
		int i = 0;
		for(int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		for(int id : employeeMap.keySet()) {
			String name = employeeMap.get(id);
			System.out.println(id + " " + name);
		}
		StringBuilder idsBuilder = new StringBuilder("");
		for(int id : ids) {
			idsBuilder.append(id);
			idsBuilder.append("-");
		}
		System.out.println(idsBuilder.toString());
		StringBuilder namesBuilder = new StringBuilder("");
		for(String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		System.out.println(namesBuilder.toString());

	}

}
