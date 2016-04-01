package cn.pattern.log;

public class LevelFilter implements Filter {
	private Level level = null;

	public boolean isLoggable(LogRecord record) {
		return record.getLevel().greater(getLevel());
	}

	public Level getLevel() {
		return level;
	}
}