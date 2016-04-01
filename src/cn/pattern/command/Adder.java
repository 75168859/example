package cn.pattern.command;
//�ӷ��ࣺ���������
class Adder {
	private int num=0; //�����ʼֵΪ0
	
    //�ӷ�������ÿ�ν������ֵ��num���ӷ����㣬�ٽ��������
	public int add(int value) {
		num += value;
		return num;
	}
}

//����������
abstract class AbstractCommand {
	public abstract int execute(int value); //��������ִ�з���execute()
	public abstract int undo(); //������������undo()
}

//����������
class ConcreteCommand extends AbstractCommand {
	private Adder adder = new Adder();
	private int value;
		
	//ʵ�ֳ�����������������execute()���������üӷ���ļӷ�����
public int execute(int value) {
		this.value=value;
		return adder.add(value);
	}
	
    //ʵ�ֳ�����������������undo()������ͨ����һ���෴����ʵ�ּӷ����������
	public int undo() {
		return adder.add(-value);
	}
}

//�����������ࣺ��������
class CalculatorForm {
	private AbstractCommand command;
	
	public void setCommand(AbstractCommand command) {
		this.command = command;
	}
	
    //������������execute()����ִ������
	public void compute(int value) {
		int i = command.execute(value);
		System.out.println("ִ�����㣬������Ϊ��" + i);
	}
	
    //������������undo()����ִ�г���
	public void undo() {
		int i = command.undo();
		System.out.println("ִ�г�����������Ϊ��" + i);
	}
}