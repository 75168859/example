package cn.pattern.log;

public abstract class Handler {
	private Formatter formatter;
	private Filter filter;

	public void publish(LogRecord record) {
		if (getFilter().isLoggable(record)) {
			String msg = getFormatter().formatLog(record);
			output(msg);
		}
	}

	public abstract void output(String msg);

	public Formatter getFormatter() {
		return formatter;
	}

	public void setFormatter(Formatter formatter) {
		this.formatter = formatter;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}
}
