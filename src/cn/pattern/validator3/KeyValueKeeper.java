package cn.pattern.validator3;
//��ȡ�Ľӿ�
public interface KeyValueKeeper {
	public void store(String key, String value);

	public String retrieve(String key);
}