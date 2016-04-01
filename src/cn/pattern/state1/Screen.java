package cn.pattern.state1;
//��Ļ��
class Screen {
    //ö�����е�״̬��currentState��ʾ��ǰ״̬
	private State currentState, normalState, largerState, largestState;

	public Screen() {
    	this.normalState = new NormalState(); //��������״̬����
    	this.largerState = new LargerState(); //���������Ŵ�״̬����
    	this.largestState = new LargestState(); //�����ı��Ŵ�״̬����
    	this.currentState = normalState; //���ó�ʼ״̬
    	this.currentState.display();
	}
	
	public void setState(State state) {
		this.currentState = state;
	}
	
    //�����¼�����������ת�˶�״̬����ҵ�񷽷��ĵ��ú�״̬��ת��
	public void onClick() {
    	if (this.currentState == normalState) {
    		this.setState(largerState);
    		this.currentState.display();
    	}
    	else if (this.currentState == largerState) {
    		this.setState(largestState);
    		this.currentState.display();
    	}
    	else if (this.currentState == largestState) {
    		this.setState(normalState);
    		this.currentState.display();
    	}
	}
}

//����״̬��
abstract class State {
	public abstract void display();
}

//����״̬��
class NormalState extends State{
	public void display() {
		System.out.println("������С��");
	}
}

//����״̬��
class LargerState extends State{
	public void display() {
		System.out.println("������С��");
	}
}

//�ı�״̬��
class LargestState extends State{
	public void display() {
		System.out.println("�ı���С��");
	}
}