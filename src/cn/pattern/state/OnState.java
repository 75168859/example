package cn.pattern.state;
//��״̬
class OnState extends State {
	public void on(Switch s) {
		System.out.println("�Ѿ��򿪣�");
	}
	
	public void off(Switch s) {
		System.out.println("�رգ�");
		s.setState(Switch.getState("off"));
	}
}

//�ر�״̬
class OffState extends State {
	public void on(Switch s) {
		System.out.println("�򿪣�");
		s.setState(Switch.getState("on"));
	}
	
	public void off(Switch s) {
		System.out.println("�Ѿ��رգ�");
	}
}