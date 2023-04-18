package ARRAYDEMO;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;


public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TreeMap<Integer,String> Tm=new TreeMap<>();
		
		Tm.put(4, "Rani");
		Tm.put(2, "AMGOI");   //how iterate Map 
        Tm.put(3, "INSTUTE");   //entry Individual key and value
        Tm.put(7, "OF");    //EntrySet: Bunch of entries
		Tm.put(5, "KOLHAPUR");
		Tm.put(1, "DISTRICT");   //Methods:getKey() and getValue()
		Tm.put(26, "null");   
		
		for (Map.Entry<Integer,String> Tmm:Tm.entrySet()) {
			System.out.println("key is:" +Tmm.getKey() +"Value is:" +Tmm.getValue ());
		}

	}

}
