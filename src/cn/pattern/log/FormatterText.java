package cn.pattern.log;

public class FormatterText extends Formatter {
	public String formatLog(LogRecord record) {
		StringBuffer msg = new StringBuffer();
		msg.append("ID " + record.getId());
		return msg.toString();
	}
}