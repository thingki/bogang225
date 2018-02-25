package test;

import java.util.List;
import java.util.Map;

public class Json {
	private List<Map> mapList;
	private String key;
	
	public Json() {
		
	}
	public Json(List<Map> mapList, String key) {
		super();
		this.mapList = mapList;
		this.key = key;
	}
	public List<Map> getMapList() {
		return mapList;
	}
	public void setMapList(List<Map> mapList) {
		this.mapList = mapList;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "Json [mapList=" + mapList + ", key=" + key + "]";
	}
	
	
}
