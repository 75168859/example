package cn.pattern.command;
class Invoker {
	private CommandQueue commandQueue; //ά��һ��CommandQueue���������
	
    //����ע��
	public Invoker(CommandQueue commandQueue) {
		this. commandQueue = commandQueue;
	}
	
    //��ֵע��
	public void setCommandQueue(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}
	
	//����CommandQueue���execute()����
	public void call() {
		commandQueue.execute();
	}
}