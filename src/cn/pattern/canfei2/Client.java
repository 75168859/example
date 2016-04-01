package cn.pattern.canfei2;
public class Client {
	public static void main(String[] args) {
		
		//System.out.println("the ret1=" + ret1);
		//String ret2 = h3.handleFeeRequest("小张", 300);
		//System.out.println("the ret2=" + ret2);
		//请求的发起者和请求处理者进行解耦的操作
		f().handleFeeRequest("小张", 500);
	}
	//单独的工厂来包装该责任链，返回链条的起点即可
	//添加新的链条必须修改工厂
	static Handler f(){
		// 先要组装职责链
				Handler h1 = new GeneralManager();
				Handler h2 = new DepManager();
				
				Handler h3 = new ProjectManager();
				
				h3.setSuccessor(h2);
				h2.setSuccessor(h1);
				
				// 开始测试
				//System.out.println(h3.handleFeeRequest(name, price));
	     return h3;
	}
}