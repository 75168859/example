package cn.pattern.state;
//打开状态
class OnState extends State {
	public void on(Switch s) {
		System.out.println("已经打开！");
	}
	
	public void off(Switch s) {
		System.out.println("关闭！");
		s.setState(Switch.getState("off"));
	}
}

//关闭状态
class OffState extends State {
	public void on(Switch s) {
		System.out.println("打开！");
		s.setState(Switch.getState("on"));
	}
	
	public void off(Switch s) {
		System.out.println("已经关闭！");
	}
}