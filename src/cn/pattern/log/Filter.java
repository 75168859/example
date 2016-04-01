package cn.pattern.log;

public interface Filter {
	public boolean isLoggable(LogRecord record);
}