package cn.pattern.validator3;
//存取的接口
public interface KeyValueKeeper {
	public void store(String key, String value);

	public String retrieve(String key);
}