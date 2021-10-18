package com.mapping;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
 
/*Important Features of a LinkedHashMap:
A LinkedHashMap contains values based on the key. ...
It contains only unique elements.
It may have one null key and multiple null values.
It is non-synchronized.
It is the same as HashMap with an additional feature that it maintains insertion order.*/
 
public class LinkedHashMapDemo
{
	public static void main(String[] args) 
	{
		Map<Integer, String> mapdemp = new LinkedHashMap<Integer, String>();
 
        mapdemp.put(1, "ankit");
        mapdemp.put(2, "ram");
        mapdemp.put(3, "tom");
        mapdemp.put(4, "ankit");
        mapdemp.put(null,null);
        mapdemp.put(null,null);
 
        // traversing map
 
        Iterator<Integer> itr = mapdemp.keySet().iterator();
 
        while (itr.hasNext()) 
        {
        	Integer keydemo = itr.next();
            String valuedemo = mapdemp.get(keydemo);
            System.out.println("key   " + keydemo + "values" + valuedemo);
        }
    }
 
}