package cn.pattern.log;
public class LogRecord {
	String id;
	Level level;
	String threadid;
	String message;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
}