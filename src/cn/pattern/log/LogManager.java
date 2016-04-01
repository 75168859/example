package cn.pattern.log;

import java.util.ArrayList;

public class LogManager {
	private static LogManager manager = null;
	private final static Handler[] emptyHandlers = null;

	public static LogManager getLogManager() {
		if (manager != null) {
			try {
				Class clz = ClassLoader.getSystemClassLoader().loadClass(
						"LogManager");
				manager = (LogManager) clz.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return manager;
	}

	/*
	 * 读取系统配置文件
	 */
	public void initialized() {
	}

	public ArrayList<Handler> getConfigHandlers() {
		// TODO Auto-generated method stub
		return null;
	}
}