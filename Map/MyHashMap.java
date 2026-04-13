package Map;

import java.security.KeyStore.Entry;
import java.util.*;
import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
public static void main(String[] args) {
	HashMap<String,String> hs=new HashMap<String,String>();
	hs.put("FirstName", "Omm");
	hs.put("LastName", "Sahoo");
	hs.put("Age", "22");
	hs.put("Email", "ommsubham@gamil.com");
	hs.put("Gender", "male");
	hs.put("Pass", "Omm@123");
	
	/*
	 * System.out.println(hs.get("FirstName"));
	 * System.out.println(hs.get("LastName")); System.out.println(hs.get("Age"));
	 * System.out.println(hs.get("Email")); System.out.println(hs.get("Gender"));
	 * System.out.println(hs.get("Pass "));
	 */
	
	
	Set<String> keySet = hs.keySet(); //keyset return Set
	for(String z:keySet)
	{
		System.out.println(z);
	}
	System.out.println();
	System.out.println();
	
	
	Collection<String> values = hs.values(); //values return collection
	for(String n:values)
	{
		System.out.println(n);
	}
	System.out.println();
	System.out.println();
	
	
	Set<java.util.Map.Entry<String,String>> entryset = hs.entrySet();
	for(java.util.Map.Entry<String, String> es:entryset)
	{
		System.out.println(es);
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
