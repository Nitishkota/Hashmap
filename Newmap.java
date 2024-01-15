package mapping;

import java.util.*;

public class Newmap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> data = new HashMap<>();
		
		data.put("Sek", 200);
		data.put("Mahi", 410);
		data.put("Har", 500);
		
		
		HashMap<String, Integer> data1 = new HashMap<String, Integer>(data);
		
		
		data1.put("Nit", 400);
		
		data1.remove("Mahitha");
		
		
		System.out.println(data1);
		
		

	}

}
