package cn.pattern.log;

public class Level {
	private final String name;
	private final int value;
	protected Level(String name, int value) {
		this.name = name;
		this.value = value;
	}
	public final int intValue() {
		return value;
	}
	public static final Level DEBUG = new Level("DEBUG", 1);
	public static final Level INFO = new Level("INFO", 2);
	public static final Level WARRING = new Level("ERROR", 3);
	public static final Level ERROR = new Level("INFO", 4);
	public boolean greater(Level level) {
		return value > level.intValue() ? true : false;
	}
}