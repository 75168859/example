package cn.pattern.log;

public class HandlerConsole extends Handler {
	public void output(String msg) {
		System.out.println(msg);
	}
	
}
