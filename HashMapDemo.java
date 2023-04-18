package ARRAYDEMO;

   import java.util.Iterator;
   import java.util.HashMap;
   import java.util.Map;
   
   public class HashMapDemo {



			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				HashMap<Integer,String> hm=new HashMap<>();
				
				hm.put(1, "Rani");
				hm.put(2, "Mohini");   //how iterate Map 
		        hm.put(3, "Rohit");   //entry Individual key and value
		        hm.put(4, "AMGOI");    //EntrySet: Bunch of entries
				hm.put(5, "JOBITO");
				hm.put(6, "Prajkta");   //Methods:getKey() and getValue()
				
				for (Map.Entry<Integer,String> hmm:hm.entrySet()) {
					System.out.println("key is:" +hmm.getKey() +"Value is:" +hmm.getValue ());
					
				}
	}

}
