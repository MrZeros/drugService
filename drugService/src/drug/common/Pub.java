package drug.common;

import java.util.Map;

import drug.entity.Function;

public class Pub {

	public static Map findFunc(Map<Function, Map> map,Function key1,Function key2){
		Map<Function, Map> map2=map.get(key1);
		Map<Function, Map> map3=map2.get(key2);
		return map3;
	}
}
