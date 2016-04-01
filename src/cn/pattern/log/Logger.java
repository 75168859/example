package cn.pattern.log;

import java.util.ArrayList;


public class Logger {
	private ArrayList<Handler> handlers;

	public Logger() {
		LogManager logManager = LogManager.getLogManager();
		handlers = logManager.getConfigHandlers();
	}

	public synchronized void addHandler(Handler handler) {
	}

	public synchronized void removeHandler(Handler handler) {
	}

	public void log(LogRecord logRecord) {
		for (Handler logHandler : handlers) {
			logHandler.publish(logRecord);
		}
	}
}