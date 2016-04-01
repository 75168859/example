package cn.pattern.validator3;

import java.util.HashMap;
import java.util.Map;

public class MemoryKeeper implements KeyValueKeeper {
	private Map<String, String> keyValue = new HashMap<String, String>();

	@Override
	public void store(String key, String value) {
		keyValue.put(key, value);
	}

	@Override
	public String retrieve(String key) {
		return keyValue.get(key);
	}
}