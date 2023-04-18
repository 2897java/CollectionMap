package ARRAYDEMO;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
		
		hm.put(14, "Rani");
		hm.put(26, "AMGOI");   //how iterate Map 
        hm.put(35, "INSTUTE");   //entry Individual key and value
        hm.put(42, "OF");    //EntrySet: Bunch of entries
		hm.put(57, "KOLHAPUR");
		hm.put(61, "DISTRICT");   //Methods:getKey() and getValue()
		
		for (Map.Entry<Integer,String> hmm:hm.entrySet()) {
			System.out.println("key is:" +hmm.getKey() +"Value is:" +hmm.getValue ());
			
		}

	}

}
