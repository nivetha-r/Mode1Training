package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("Nive", "tha");
		m.put("sri", "keerthna");
		m.put("kiruba", "laxmi");
		m.put("visha", "lakshi");
		
		String key="kiruba";
		String value=(String)m.getOrDefault(key, "Not found");
		System.out.println(value);
		
	}

}
