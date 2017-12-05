import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashmapText {
public static void main(String[] args) {
	HashMap<Country,String> hashMap=new HashMap<Country,String>();
	Country china = new Country("china",15);
	Country india = new Country("india",14);
	Country japan = new Country("china",2);
	hashMap.put(china,"Beijing");
	hashMap.put(india,"Delhi");
	hashMap.put(japan,"Tokyo");
	
	
	Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
	while (iterator.hasNext()) {
		Entry<Country, String> entry = iterator.next();
		Country key = entry.getKey();
		String value = entry.getValue();
		System.out.println(entry.toString());
	}
			
			
			
			
			
			
}
}
