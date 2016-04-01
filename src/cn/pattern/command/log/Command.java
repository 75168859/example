package cn.pattern.command.log;
import java.io.*;
import java.util.*;

//���������࣬������Ҫ���������д���ļ��������ʵ����Serializable�ӿ�
abstract class Command implements Serializable {
	protected String name; //��������
	protected String args; //�������
	protected ConfigOperator configOperator; //ά�ֶԽ����߶��������
	
	public Command(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setConfigOperator(ConfigOperator configOperator) {
		this.configOperator = configOperator;
	}
	
    //�������������ִ�з���execute()
	public abstract void execute(String args);
	public abstract void execute();
}

//���������ࣺ��������
class InsertCommand extends Command {
	public InsertCommand(String name) {
		super(name);
	}
	
	public void execute(String args) {
		this.args = args;
		configOperator.insert(args);
	}
	
	public void execute() {
		configOperator.insert(this.args);
	}
}

//�޸������ࣺ��������
class ModifyCommand extends Command {
	public ModifyCommand(String name) {
		super(name);
	}
	
	public void execute(String args) {
		this.args = args;
		configOperator.modify(args);
	}
	
	public void execute() {
		configOperator.modify(this.args);
	}
}

//ʡ����ɾ��������DeleteCommand

//�����ļ������ࣺ��������ߡ�����ConfigOperator��Ķ�����Command�ĳ�Ա������Ҳ����Command����һ��д���ļ������ConfigOperatorҲ��Ҫʵ��Serializable�ӿ�
class ConfigOperator implements Serializable {
	public void insert(String args) {
		System.out.println("�����½ڵ㣺" + args);
	}
	
	public void modify(String args) {
		System.out.println("�޸Ľڵ㣺" + args);
	}
	
	public void delete(String args) {
		System.out.println("ɾ���ڵ㣺" + args);
	}
}

//�����ļ����ô����ࣺ��������
class ConfigSettingWindow {
    //����һ���������洢ÿһ�β���ʱ���������
	private ArrayList<Command> commands = new ArrayList<Command>();
	private Command command; 

    //ע������������
	public void setCommand(Command command) {
		this.command = command;
	}
	
    //ִ�������ļ��޸����ͬʱ�����������ӵ��������
	public void call(String args) {
		command.execute(args);
		commands.add(command);
	}
	
    //��¼������־��������־�ļ����������д����־�ļ�
	public void save() {
		FileUtil.writeCommands(commands);
	}
	
    //����־�ļ�����ȡ����ϣ���ѭ������ÿһ����������execute()������ʵ�������ļ�����������
	public void recover() {
		ArrayList list;
		list = FileUtil.readCommands();
		
		for (Object obj : list) {
			((Command)obj).execute();
		}
	}
}

//�����ࣺ�ļ�������
class FileUtil {
    //�������д����־�ļ�
	public static void writeCommands(ArrayList commands) {
		try {
			FileOutputStream file = new FileOutputStream("config.log");
			//����������������ڽ�����д�뵽�ļ���
    		ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(file));
			//������д���ļ�
    		objout.writeObject(commands);
    		objout.close();
    		}
    	catch(Exception e) {
    			System.out.println("�����ʧ�ܣ�");	
    			e.printStackTrace();
    	    }
	}
	
    //����־�ļ�����ȡ�����
	public static ArrayList readCommands() {
		try {
			FileInputStream file = new FileInputStream("config.log");
			//�����������������ڴ��ļ��ж�ȡ����
    		ObjectInputStream objin = new ObjectInputStream(new BufferedInputStream(file));
			
			//���ļ��еĶ��������ת��ΪArrayList����
    		ArrayList commands = (ArrayList)objin.readObject();
    		objin.close();
    		return commands;
    		}
    	catch(Exception e) {
    			System.out.println("�����ȡʧ�ܣ�");
    			e.printStackTrace();
    			return null;	
    	    }		
	}
}