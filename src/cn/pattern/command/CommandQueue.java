package cn.pattern.command;
import java.util.*;

class CommandQueue {
    //����һ��ArrayList���洢�������
	private ArrayList<Command> commands = new ArrayList<Command>();
	
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void removeCommand(Command command) {
		commands.remove(command);
	}
	
    //ѭ������ÿһ����������execute()����
	public void execute() {
		for (Object command : commands) {
			((Command)command).execute();
		}
	}
}